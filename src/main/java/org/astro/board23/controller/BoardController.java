package org.astro.board23.controller;

import java.util.List;

import org.astro.board23.dto.BoardDTO;
import org.astro.board23.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("index")
    public void index(){
        log.info("index로 잘 들어옴");
    }

    @GetMapping("list")
    public void list(Model model){



        log.info("list로 잘 들어옴");

        List<BoardDTO> boardDTO = boardService.getList();

        model.addAttribute("list", boardDTO);

        log.info(boardDTO);



    }
    
}
