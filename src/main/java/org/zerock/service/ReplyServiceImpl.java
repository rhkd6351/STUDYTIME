package org.zerock.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.zerock.domain.ReplyVO;
import org.zerock.mapper.ReplyMapper;

import java.util.List;

@Service
@Log4j
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService{

    ReplyMapper mapper;

    @Override
    public List<ReplyVO> getList() {
        log.info("listing Reply...");
        return mapper.getList();
    }

    @Override
    public ReplyVO get() {
        log.info("getting Reply...");
        return mapper.read();
    }

    @Override
    public void insert(ReplyVO vo) {
        log.info("inserting Reply...");
        mapper.insert(vo);
    }

}
