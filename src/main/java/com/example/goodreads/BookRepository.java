package com.example.goodreads;

import java.util.*;
import com.example.goodreads.Book;

public interface BookRepository {
    ArrayList<Book> getBooks();

    Book getBook(int bookId);
}