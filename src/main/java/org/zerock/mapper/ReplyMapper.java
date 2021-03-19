package org.zerock.mapper;

import org.zerock.domain.ReplyVO;

import java.util.List;

public interface ReplyMapper {

    public List<ReplyVO> getList();

    public ReplyVO read();

    public void insert(ReplyVO vo);

}
