package org.zerock.mapper;

import org.zerock.domain.ReplyVO;

import java.util.List;

public interface ReplyMapper {

    public List<ReplyVO> getList();

    public ReplyVO read(int oid);

    public void insert(ReplyVO vo);

    public void delete(int oid);

    public List<ReplyVO> getListAccordingToPostOid(int postOid);
}
