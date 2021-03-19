package org.zerock.mapper;

import org.zerock.domain.BoardVO;

import java.util.List;

public interface BoardMapper {

    public List<BoardVO> getList();

    public BoardVO read();

    public void insert(BoardVO vo);

}
