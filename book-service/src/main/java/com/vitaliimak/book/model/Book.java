package com.vitaliimak.book.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document(collection = "book")
@RequiredArgsConstructor
public class Book {

    @Id
    private String id;
    // Different languages
    private final String title;
    @DBRef(lazy = true)
    private final List<Author> authors;
    private String description;
    private List<String> genres;
    private String isbn;
    // Might be only year, and additional month and day
    private LocalDate publicationDate;
    private String language;
    // series
    // Image, cover


    @Override
    public String toString() {
        return "Book id = %s, title= %s".formatted(id, title);
    }

}
