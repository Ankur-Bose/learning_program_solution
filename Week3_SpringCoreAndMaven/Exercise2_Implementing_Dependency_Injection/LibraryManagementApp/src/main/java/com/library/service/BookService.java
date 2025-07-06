package com.library.service;

import com.library.repository.BookRepository;

public class BookService {


    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("Books from repository:");
        bookRepository.getAllBooks().forEach(System.out::println);
    }
}
