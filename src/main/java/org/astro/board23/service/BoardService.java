package org.astro.board23.service;

import java.util.List;

import org.astro.board23.dto.BoardDTO;

import jakarta.transaction.Transactional;

@Transactional
public interface BoardService {
    
    List<BoardDTO> getList();

}
