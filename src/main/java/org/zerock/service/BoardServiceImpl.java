package org.zerock.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import java.util.List;

@Service
@Log4j
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{

    BoardMapper mapper;

    @Override
    public List<BoardVO> getList() {
        log.info("listing board...");
        return mapper.getList();
    }

    @Override
    public BoardVO get() {
        log.info("getting board...");
        return mapper.read();
    }

    @Override
    public void insert(BoardVO vo) {
        log.info("inserting board...");
        mapper.insert(vo);
    }

}
