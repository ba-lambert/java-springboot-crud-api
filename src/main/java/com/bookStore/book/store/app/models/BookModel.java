package com.bookStore.book.store.app.models;

import lombok.NonNull;
import org.springframework.data.annotation.Id;

public class BookModel {
    @Id
    private Long id;
    @NonNull
    private String bookName;
    @NonNull
    private String author;
    @NonNull
    private String publisher;
    private Number pages;

}
