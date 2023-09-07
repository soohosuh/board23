package org.astro.board23.repository;

import org.astro.board23.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board , Long> {
    
}
