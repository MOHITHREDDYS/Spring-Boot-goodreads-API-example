package com.example.goodreads;

import java.util.*;
import com.example.goodreads.Book;
import com.example.goodreads.BookRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BookService implements BookRepository {
    private HashMap<Integer, Book> hmap = new HashMap<>();

    public BookService() {
        Book b1 = new Book(1, "Harry Porter", "harry_porter.jpg");
        Book b2 = new Book(2, "After Life", "after_life.jpg");
        hmap.put(b1.getId(), b1);
        hmap.put(b2.getId(), b2);
    }

    @Override
    public ArrayList<Book> getBooks() {
        Collection<Book> bookCollection = hmap.values();
        ArrayList<Book> books = new ArrayList<>(bookCollection);
        return books;
    }

    @Override
    public Book getBook(int bookId) {
        Book book = hmap.get(bookId);
        if (book == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return book;
    }
}