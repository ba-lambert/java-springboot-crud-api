package com.bookStore.book.store.app.services;

import com.bookStore.book.store.app.models.BookModel;
import com.bookStore.book.store.app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<BookModel> getAllBooksAvailable(){
        return bookRepository.findAll();
    }
}
