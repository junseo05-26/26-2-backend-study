package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Long createBoard(BoardCreateRequest request) {
        Board board = new Board(request.getTitle(), request.getContent());
        Board savedBoard = boardRepository.save(board);
        return savedBoard.getId();
    }
}