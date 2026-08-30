package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/boards")
    public String createBoard(@RequestBody BoardCreateRequest request) {
        Long savedId = boardService.createBoard(request);
        return savedId + "번 게시글이 성공적으로 생성되었습니다!";
    }
}