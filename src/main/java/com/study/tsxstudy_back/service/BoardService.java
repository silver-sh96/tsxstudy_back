package com.study.tsxstudy_back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.tsxstudy_back.dto.Board;
import com.study.tsxstudy_back.mapper.BoardMapper;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    // 게시글 목록
    public List<Board> getBoardList(){
        List<Board> boardList = boardMapper.getBoardList();
        return boardList;
    }
    
}
