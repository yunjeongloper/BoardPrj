
package com.dev.test.service;

import com.dev.test.dto.Board;

import java.util.List;

public interface BoardService {

    public List<Board> selectAllContents();
    public Board selectOneContent(Board board);
    public int insertContent(Board board);
    public int updateContent(Board board);
    public int deleteContent(Board board);
}

