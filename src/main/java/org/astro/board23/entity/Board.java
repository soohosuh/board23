package org.astro.board23.entity;

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_board23")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long bno;
    String title;
    String contents;
    String writers;
    @CreatedDate
    LocalDate dueDate;
}
