package com.learnssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learnssm.model.SsmDemo;
import com.learnssm.service.SsmDemoService;

@Controller
public class SsmDemoController {
    
    @Resource
    private SsmDemoService ssmDemoService;
    
    @RequestMapping("/getAllRecords.do")
    public ModelAndView toIndex(){
        ModelAndView mav = new ModelAndView();
        
        List<SsmDemo> records = ssmDemoService.getAllRecords();
        
        mav.addObject("beans", records);
        
        mav.setViewName("index");
        
        return mav;
    }
    
}