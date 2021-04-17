package com.example.bookaro.catalog.application;

import com.example.bookaro.catalog.domain.Book;
import com.example.bookaro.catalog.domain.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CatalogController {
    private final CatalogService catalogService;

    public List<Book> findByTitle(String title) {
        return catalogService.findByTitle(title);
    }
}
