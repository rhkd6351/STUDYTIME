package org.zerock.mapper;

import org.zerock.domain.StudentVO;

import java.util.List;

public interface StudentMapper {

    public List<StudentVO> getList();

    public StudentVO read(String id);

    public void insert(StudentVO vo);

}
