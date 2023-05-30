package com.study.tsxstudy_back.dto;

import java.util.Date;

import lombok.Data;

@Data

public class Board {
    private int boardNum;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private String boardAttach;
    private Date boardRegDate;
    private Date boardMdfDate;

}
