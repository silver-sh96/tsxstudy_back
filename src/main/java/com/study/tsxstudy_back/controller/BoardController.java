package com.study.tsxstudy_back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @GetMapping("/apiTest")
    public String apiTest(){
        return "성공따라우쉬";
    }
    
}
