package com.example.herokumaven.service;

import com.example.herokumaven.dto.BookDto;
import com.example.herokumaven.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getBookById(Long[] id);

    List<Book> getBookBySortAndSearch(String filter, String sort);

    Book addBook(BookDto bookDto);
}