package com.vitaliimak.book.repository;

import com.vitaliimak.book.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
