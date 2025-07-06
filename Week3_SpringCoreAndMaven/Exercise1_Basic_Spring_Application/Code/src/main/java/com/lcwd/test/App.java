package com.lcwd.test;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookservice = (BookService) context.getBean("bookService");

        bookservice.displayBooks();

    }
}