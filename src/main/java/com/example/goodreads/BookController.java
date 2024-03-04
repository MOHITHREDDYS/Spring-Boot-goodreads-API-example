package com.example.goodreads;

import org.springframework.web.bind.annotation.*;
import com.example.goodreads.BookService;
import com.example.goodreads.Book;
import java.util.*;

@RestController
public class BookController {
    BookService bookService = new BookService();

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBook(@PathVariable("bookId") int bookId) {
        return bookService.getBook(bookId);
    }
}