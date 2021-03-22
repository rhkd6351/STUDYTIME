package org.zerock.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.datasource.pooled.PoolState;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.BoardVO;
import org.zerock.domain.PostVO;
import org.zerock.domain.ReplyVO;
import org.zerock.domain.StudentVO;
import org.zerock.service.*;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Log4j
@Controller
@RequestMapping("/main/*")
@AllArgsConstructor
public class MainController {

    private BoardService boardService;
    private PostService postService;
    private ReplyService replyService;
    private StudentService studentService;

    private HttpSession session;

    @PostMapping("/login")
    public String login(Model model, String id, String pw){
        model.addAttribute("loginPw",true);
        StudentVO vo = studentService.get(id);
        if(vo == null){ //invalid id
            model.addAttribute("loginId",false);
            return "/index";
        }else{ //valid id
            model.addAttribute("loginId",true);
            if(vo.getPw().equals(pw)){//valid pw
                session.setAttribute("student", vo);
                return "redirect:/main/page";

            }else{//invalid pw
                model.addAttribute("loginPw",false);
                return "/index";
            }
        }
    }

    @GetMapping("/page")
    public String main(Model model){
        addBoardList(model);
        List<PostVO> leftPostList = postService.getLeftList();
        List<PostVO> rightPostList = postService.getRightList();

        model.addAttribute("leftPostList",leftPostList);
        model.addAttribute("rightPostList",rightPostList);
        return "/main";
    }

    @GetMapping("/board")
    public String board(Model model, int boardOid){
        addBoardList(model);
        List<PostVO> postList = postService.getListAccordingToBoardOid(boardOid);
        BoardVO boardvo = boardService.get(boardOid);

        model.addAttribute("postList",postList);
        model.addAttribute("boardVo",boardvo);
        return "/board";
    }

    @GetMapping("/board/post")
    public String post(Model model, int postOid){
        addBoardList(model);
        PostVO postVo = postService.get(postOid);
        List<ReplyVO> replyList = replyService.getListAccordingToPostOid(postOid);

        model.addAttribute("replyList",replyList);
        model.addAttribute("postVo",postVo);
        return "/post";
    }

    @GetMapping("/board/post/delete")
    public String deletePost(int postOid){
        PostVO vo = postService.get(postOid);
        postService.delete(postOid);
        return "redirect:/main/board?boardOid=" + vo.getBoardOid();
    }

    @GetMapping("/board/post/update")
    public String updatePost(Model model, int postOid){
        PostVO postVo = postService.get(postOid);
        BoardVO boardVo = boardService.get(postVo.getBoardOid());

        model.addAttribute("postVo",postVo);
        model.addAttribute("boardVo",boardVo);
        return "/modify";
    }
    @PostMapping("/board/post/updateSubmit")
    public String updateSubmitPost(PostVO vo){
        PostVO postVo = postService.get(vo.getOid());
        postVo.setTitle(vo.getTitle());
        postVo.setContent(vo.getContent());
        postService.update(postVo);
        return "redirect:/main/board/post?postOid=" + postVo.getOid();
    }

    @GetMapping("/board/post/reply/delete")
    public String deleteReply(int replyOid){
        ReplyVO vo = replyService.get(replyOid);
        replyService.delete(replyOid);
        return "redirect:/main/board/post?postOid=" + vo.getPostOid();
    }

    @PostMapping("/addPost")
    public String addPost(PostVO vo){
        vo.setStudentId(((StudentVO)session.getAttribute("student")).getId());
        postService.insert(vo);
        return "redirect:/main/board?boardOid=" + vo.getBoardOid();
    }

    @PostMapping("/addReply")
    public String addReply(ReplyVO vo){
        vo.setStudentId(((StudentVO)session.getAttribute("student")).getId());
        replyService.insert(vo);
        return "redirect:/main/board/post?postOid=" + vo.getPostOid();
    }

    private void addBoardList(Model model){
        List<BoardVO> boardList = boardService.getList();
        model.addAttribute("boardList",boardList);
    }
}