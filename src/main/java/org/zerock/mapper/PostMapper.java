package org.zerock.mapper;

import org.zerock.domain.PostVO;

import java.util.List;

public interface PostMapper {

    public List<PostVO> getList();

    public PostVO read();

    public void insert(PostVO vo);

}
