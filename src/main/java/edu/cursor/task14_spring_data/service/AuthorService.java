package edu.cursor.task14_spring_data.service;

import edu.cursor.task14_spring_data.models.Author;

public interface AuthorService {
    void saveAuthor(Author author);

    Author findAuthor(Long authorID);

    void deleteAuthor(Long authorID);

    void updateAuthor(Author oldAuthor, Author newAuthor);
}
