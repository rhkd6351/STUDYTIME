package org.zerock.service;

import oracle.jdbc.proxy.annotation.Post;
import org.zerock.domain.PostVO;

import java.util.List;


public interface PostService {
    public List<PostVO> getList();

    public PostVO get(int oid);

    public void insert(PostVO vo);

    public void delete(int postOid);

    public void update(PostVO vo);

    public List<PostVO> getListAccordingToBoardOid(int boardOid);
    public List<PostVO> getLeftList();
    public List<PostVO> getRightList();
}
