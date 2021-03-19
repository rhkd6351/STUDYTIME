package org.zerock.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.zerock.domain.PostVO;
import org.zerock.mapper.PostMapper;

import java.util.List;

@Service
@Log4j
@AllArgsConstructor
public class PostServiceImpl implements PostService{

    PostMapper mapper;

    @Override
    public List<PostVO> getList() {
        log.info("listing Post...");
        return mapper.getList();
    }

    @Override
    public PostVO get() {
        log.info("getting Post...");
        return mapper.read();
    }

    @Override
    public void insert(PostVO vo) {
        log.info("inserting Post...");
        mapper.insert(vo);
    }

    @Override
    public List<PostVO> getListAccordingToBoardOid(int boardOid) {
        log.info("listing Post...");
        return mapper.getListAccordingToBoardOid(boardOid);
    }

    @Override
    public List<PostVO> getLeftList() {
        log.info("listing Post...");
        return mapper.getLeftList();
    }

    @Override
    public List<PostVO> getRightList() {
        log.info("listing Post...");
        return mapper.getRightList();
    }

}
