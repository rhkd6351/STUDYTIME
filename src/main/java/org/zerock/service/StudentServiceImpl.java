package org.zerock.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.zerock.domain.StudentVO;
import org.zerock.mapper.StudentMapper;

import java.util.List;

@Service
@Log4j
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{

    StudentMapper mapper;

    @Override
    public List<StudentVO> getList() {
        log.info("listing Student...");
        return mapper.getList();
    }

    @Override
    public StudentVO get(String id) {
        log.info("getting Student...");
        return mapper.read(id);
    }

    @Override
    public void insert(StudentVO vo) {
        log.info("inserting Student...");
        mapper.insert(vo);
    }

}
