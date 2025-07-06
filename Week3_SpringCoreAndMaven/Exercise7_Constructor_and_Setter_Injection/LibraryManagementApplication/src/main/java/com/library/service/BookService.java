package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private final String serviceName;
    private BookRepository bookRepository;

    public BookService(String serviceName) {
        this.serviceName = serviceName;
        System.out.println("Constructor Injection: serviceName = " + serviceName);
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection: BookRepository set.");
    }

    public void displayServiceDetails() {
        System.out.println("Service Name: " + serviceName);
        bookRepository.displayRepositoryDetails();
    }
}
