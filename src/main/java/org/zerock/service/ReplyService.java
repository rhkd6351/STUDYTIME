package org.zerock.service;

import org.zerock.domain.ReplyVO;

import java.util.List;


public interface ReplyService {
    public List<ReplyVO> getList();

    public ReplyVO get(int oid);

    public void delete(int oid);

    public void insert(ReplyVO vo);

    public List<ReplyVO> getListAccordingToPostOid(int postOid);
}
