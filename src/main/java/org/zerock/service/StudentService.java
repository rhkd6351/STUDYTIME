package org.zerock.service;

import org.zerock.domain.StudentVO;

import java.util.List;


public interface StudentService {
    public List<StudentVO> getList();

    public StudentVO get(String id);

    public void insert(StudentVO vo);
}
