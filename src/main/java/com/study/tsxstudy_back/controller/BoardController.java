package com.study.tsxstudy_back.controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.study.tsxstudy_back.dto.Board;
import com.study.tsxstudy_back.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    // 게시글 목록
    @RequestMapping("/boardList")
    public List<Board> getBoardList(){
        List<Board> boardList = boardService.getBoardList();
        log.info("boardList : {} ", boardList);
        return boardList;
    }

    // 게시글 작성
    @RequestMapping("/boardWrite")
    public int boardWrite(MultipartFile[] multipartFiles, Board board){
        int result = 1;
        String UPLOAD_PATH = "D:\\uploads"; // 업로드 할 위치

        return result;
    }
    
}
