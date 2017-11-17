package com.dev.test;

import com.dev.test.dto.Board;
import com.dev.test.service.BoardService;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/applicationContext.xml")
public class BoardCRUDTest {

    private static Log log = LogFactory.getLog(BoardCRUDTest.class);

    @Autowired
    private BoardService boardService;

    @Test
    public void testSelectAllContent() {

        System.out.print("selectAllContent() testing . . .");

        List<Board> contents = boardService.selectAllContents();

        System.out.println(contents.toString());

        assertNotNull("failure - contents is null", contents);
    }

    @Test
    public void testInsertContent() {

        System.out.print("insertContent(Board) testing . . .");

        String title = "테스트 2";
        String writer = "윤정";
        String memo = "테스트입니다";
        String password = "9954";

        Board content = new Board();
        content.setTitle(title);
        content.setWriter(writer);
        content.setContent(memo);
        content.setPassword(password);

        boardService.insertContent(content);

        testSelectAllContent();
    }

    @Test
    public void testUpdateContent() {

        System.out.print("updateContent(Board) testing . . .");

        String title = "테스트 1";
        String writer = "윤정";
        String memo = "수정 테스트입니다";
        String password = "9954";

        Board content = new Board();
        content.setTitle(title);
        content.setWriter(writer);
        content.setContent(memo);
        content.setPassword(password);

        boardService.updateContent(content);

        testSelectAllContent();
    }

    @Test
    public void testDeleteContent() {

        System.out.print("deleteContent(Board) testing . . .");

        String title = "테스트 2";
        String writer = "윤정";
        String memo = "수정 테스트입니다";
        String password = "9954";

        Board content = new Board();
        content.setTitle(title);
        content.setWriter(writer);
        content.setContent(memo);
        content.setPassword(password);

        boardService.deleteContent(content);

        testSelectAllContent();
    }

}