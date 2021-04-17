package com.example.bookaro.catalog.domain;

import java.util.Collection;

public interface CatalogRepository {
    Collection<Book> findAll();
}
