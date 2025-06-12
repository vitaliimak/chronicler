package com.vitaliimak.book.service;

import com.vitaliimak.book.model.Book;
import com.vitaliimak.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book save(Book book) {
//        book.getAuthors().stream()
//                .

        return bookRepository.save(book);
    }
}
