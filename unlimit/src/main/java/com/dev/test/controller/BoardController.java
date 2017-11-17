package com.dev.test.controller;

import com.dev.test.dto.Board;
import com.dev.test.service.BoardService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BoardController {

    protected Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private BoardService boardService;

    @RequestMapping("/")
    public String Index(Model model) throws Exception {

        logger.info("index.....");
        return "main";

    }

    @RequestMapping("/main.do")
    public String main(Model model) throws Exception {

        logger.info("main.....");

        List<Board> contents = boardService.selectAllContents();

        model.addAttribute("contents",contents);

        System.out.println(contents.toString());

        return "main";
    }

    @RequestMapping("/write.do")
    public String write(Model model) throws Exception {

        logger.info("write.....");

        return "write";
    }

    @RequestMapping("/insert.do")
    public String insert(@ModelAttribute Board board) throws Exception {

        logger.info("insert.....");

        boardService.insertContent(board);

        return "redirect:main.do";
    }

    @RequestMapping("/view.do")
    public String view(@ModelAttribute Board board, Model model) throws Exception {

        logger.info("view.....");

        Board content = boardService.selectOneContent(board);

        model.addAttribute("content",content);

        System.out.println(content.toString());

        return "view";
    }


    @RequestMapping("/update.do")
    public String update(@ModelAttribute Board board) throws Exception {

        logger.info("update.....");

        boardService.updateContent(board);

        return "redirect:main.do";
    }


    @RequestMapping("/delete.do")
    public String delete(@ModelAttribute Board board) throws Exception {

        logger.info("delete.....");

        boardService.deleteContent(board);

        return "redirect:main.do";
    }

}