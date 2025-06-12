package com.vitaliimak.book.service;

import com.vitaliimak.book.model.Author;
import com.vitaliimak.book.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public Author save(Author author) {
        Optional<Author> existedAuthor = authorRepository.findByFullName(author.getFullName());
        return existedAuthor.orElseGet(() -> authorRepository.save(author));
    }

    public List<Author> getAllAuthors() {
        // Sorting, pagination
        return authorRepository.findAll();
    }

    // TODO I don't like it. Might return Author instead. To not make additional DB call
    public boolean isAuthorExist(Author author) {
        Optional<Author> existedAuthor = authorRepository.findByFullName(author.getFullName());
        if (existedAuthor.isPresent()) {
            return true;
        }
        return authorRepository.existsById(author.getId());
    }
}
