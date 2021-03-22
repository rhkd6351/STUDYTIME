package org.zerock.mapper;

import org.zerock.domain.PostVO;

import java.util.List;

public interface PostMapper {

    public List<PostVO> getList();

    public PostVO read(int oid);

    public void insert(PostVO vo);

    public void delete(int oid);

    public void update(PostVO vo);

    public List<PostVO> getListAccordingToBoardOid(int boardOid);

    public List<PostVO> getLeftList();

    public List<PostVO> getRightList();

}
