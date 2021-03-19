package org.zerock.service;

import org.zerock.domain.BoardVO;

import java.util.List;


public interface BoardService {
    public List<BoardVO> getList();

    public BoardVO get();

    public void insert(BoardVO vo);
}
