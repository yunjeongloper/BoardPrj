
package com.dev.test;

import com.dev.test.dto.Board;
import com.dev.test.service.BoardService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class BoardCRUD
{
    private static Log log = LogFactory.getLog(BoardCRUD.class);

    public static void main( String[] args )
    {

        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");
        BoardService service = (BoardService) cxt.getBean("service");

        log.info("Running App...");

        //( R ) SELECT ALL CONTENTS
        System.out.println("( R ) selectAllParent()");
        List<Board> contents = service.selectAllContents();
        System.out.println("-> "+contents);
        System.out.println("****************************************************");

        //( C ) INSERT CONTENT
        System.out.println("( U ) insertContent(Board)");
        Board content = new Board();
        content.setTitle("테스트 1");
        content.setWriter("윤정");
        content.setContent("테스트입니다");
        content.setPassword("1234");
        service.insertContent(content);
        System.out.println("-> insert "+content);
        System.out.println("****************************************************");

        //( U ) UPDATE CONTENT
        System.out.println("( U ) update()");
        content = new Board();
        content.setTitle("테스트 1");
        content.setWriter("윤정");
        content.setContent("테스트 수정입니다");
        content.setPassword("1234");
        service.updateContent(content);
        System.out.println("-> update "+content);
        System.out.println("****************************************************");

        //( D ) DELETE CONTENT
        System.out.println("( U ) update()");
        content = new Board();
        content.setTitle("테스트 1");
        content.setWriter("윤정");
        content.setContent("테스트 수정입니다");
        content.setPassword("1234");
        service.deleteContent(content);
        System.out.println("-> delete "+content);
        System.out.println("****************************************************");


    }
}
