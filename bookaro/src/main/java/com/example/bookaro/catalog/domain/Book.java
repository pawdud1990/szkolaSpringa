package com.example.bookaro.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Book {
    private final Long id;
    private final String title;
    private final String author;
    private final Integer year;
}
