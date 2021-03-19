package org.zerock.service;

import org.zerock.domain.PostVO;

import java.util.List;


public interface PostService {
    public List<PostVO> getList();

    public PostVO get();

    public void insert(PostVO vo);
}
