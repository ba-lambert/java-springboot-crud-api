package com.bookStore.book.store.app.controllers;

import com.bookStore.book.store.app.models.BookModel;
import com.bookStore.book.store.app.repository.BookRepository;
import com.bookStore.book.store.app.services.ApiResponse;
import com.bookStore.book.store.app.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {
    @Autowired
    private BookService bookService;
    public ResponseEntity<ApiResponse<List<BookModel>>> getAllBooks(){
        List<BookModel> books = bookService.getAllBooksAvailable();
        ApiResponse<List<BookModel>> response = new ApiResponse<>(HttpStatus.OK.value(),"Available books",books);
        return ResponseEntity.ok().body(response);
    }
}
