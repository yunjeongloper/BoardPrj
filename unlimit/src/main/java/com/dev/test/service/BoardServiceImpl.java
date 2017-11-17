package com.dev.test.service;

import com.dev.test.dao.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dev.test.dto.Board;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDao boardDao;

    @Override
    public List<Board> selectAllContents() {
        return boardDao.selectAllContents();
    }

    @Override
    public Board selectOneContent(Board board) {
        return boardDao.selectOneContent(board);
    }

    @Override
    public int insertContent(Board board) {
        return boardDao.insertContent(board);
    }

    @Override
    public int updateContent(Board board) {
        return boardDao.updateContent(board);
    }

    @Override
    public int deleteContent(Board board) {
        return boardDao.deleteContent(board);
    }
}
