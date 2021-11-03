package com.example.empdemo.service;

import com.example.empdemo.model.Book;

import java.util.List;

public interface BookService{
    List<Book> getAllBooks();
    void saveBook(Book book);
}
