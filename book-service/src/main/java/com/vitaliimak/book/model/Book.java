package com.vitaliimak.book.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document
@AllArgsConstructor
@RequiredArgsConstructor
public class Book {

    @Id
    private String id;
    private final String title;
    private final List<String> authors;
    private String description;
    private List<String> genres;
    private String isbn;
    // Might be only year, and additional month and day
    private Date publicationDate;
    private String language;
    // series
    // Image, cover


    @Override
    public String toString() {
        return "Book id = %s, title= %s".formatted(id, title);
    }

}
