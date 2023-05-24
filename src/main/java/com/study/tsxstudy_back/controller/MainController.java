package com.study.tsxstudy_back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(){
        System.out.println("ㄴ(o-o)ㄱ");
        return "index";
    }
    
}
