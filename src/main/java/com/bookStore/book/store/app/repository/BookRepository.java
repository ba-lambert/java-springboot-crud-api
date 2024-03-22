package com.bookStore.book.store.app.repository;

import com.bookStore.book.store.app.models.BookModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<BookModel,String> {
}
