package org.astro.board23.service;

import java.util.List;
import java.util.stream.Collectors;

import org.astro.board23.dto.BoardDTO;
import org.astro.board23.entity.Board;
import org.astro.board23.repository.BoardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<BoardDTO> getList() {
    
    List<Board> entityList = boardRepository.findAll();

    List<BoardDTO> dtoList = entityList.stream()
        .map(entity -> modelMapper.map(entity, BoardDTO.class))
        .collect(Collectors.toList());

    return dtoList;

    }
    
}
