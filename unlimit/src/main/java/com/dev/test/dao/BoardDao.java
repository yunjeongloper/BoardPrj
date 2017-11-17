package com.dev.test.dao;

import com.dev.test.dto.Board;

import java.util.List;

public interface BoardDao {

    public List<Board> selectAllContents();
    public Board selectOneContent(Board board);
    public int insertContent(Board board);
    public int updateContent(Board board);
    public int deleteContent(Board board);
}
