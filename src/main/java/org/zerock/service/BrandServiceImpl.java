package org.zerock.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.zerock.domain.BrandVO;
import org.zerock.mapper.BrandMapper;

import java.util.List;

@Service
@Log4j
@AllArgsConstructor
public class BrandServiceImpl implements BrandService{

    BrandMapper mapper;

    @Override
    public List<BrandVO> getList() {
        log.info("listing brand...");
        return mapper.getList();
    }

}
