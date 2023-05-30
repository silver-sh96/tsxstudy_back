package com.study.tsxstudy_back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.tsxstudy_back.dto.Board;
import com.study.tsxstudy_back.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    // 게시글 목록
    @GetMapping("/boardList")
    public List<Board> getBoardList(){
        List<Board> boardList = boardService.getBoardList();
        log.info("boardList : {} ", boardList);
        return boardList;
    }
    
}
