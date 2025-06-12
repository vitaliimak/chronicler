package com.vitaliimak.book.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document(collection = "author")
@RequiredArgsConstructor
public class Author {

    @Id
    private String id;
    private final String fullName;
    private final LocalDate birthDate;
    private LocalDate deathDate;
    // country, etc
    @DBRef
    private final List<Book> books;
}
