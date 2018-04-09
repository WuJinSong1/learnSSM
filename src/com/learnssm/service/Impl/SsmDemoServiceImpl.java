package com.learnssm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.learnssm.mapper.SsmDemoMapper;
import com.learnssm.model.SsmDemo;
import com.learnssm.service.SsmDemoService;
@Service
public class SsmDemoServiceImpl implements SsmDemoService{

    @Resource
    private SsmDemoMapper ssmDemoMapper;
    
    @Override
    public List<SsmDemo> getAllRecords() {
        // TODO Auto-generated method stub
        return ssmDemoMapper.getAllBeans();
    }

}
