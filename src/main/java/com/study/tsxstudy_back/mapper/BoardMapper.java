package com.study.tsxstudy_back.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.tsxstudy_back.dto.Board;

@Mapper
public interface BoardMapper {
    
    // 게시글 목록
    List<Board> getBoardList();
    
}
