package edu.cursor.task14_spring_data.service;

import edu.cursor.task14_spring_data.models.Book;

public interface BookService {
    void saveBook(Book book);

    Book findBook(Long bookID);

    void deleteBook(Long bookID);

    void updateBook(Book oldBook, Book newBook);
}
