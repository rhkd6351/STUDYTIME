package org.zerock.service;

import org.zerock.domain.ReplyVO;

import java.util.List;


public interface ReplyService {
    public List<ReplyVO> getList();

    public ReplyVO get();

    public void insert(ReplyVO vo);
}
