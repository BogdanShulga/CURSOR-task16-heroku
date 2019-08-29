package edu.cursor.task14_spring_data.service;

import edu.cursor.task14_spring_data.models.Book;
import edu.cursor.task14_spring_data.repository.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;

    @Override
    public void saveBook(Book book) {
        bookRepo.save(book);
    }


    @Override
    public Book findBook(Long bookID) {
        return bookRepo.findById(bookID).orElse(new Book());
    }

    @Override
    public void deleteBook(Long bookID) {
        bookRepo.deleteById(bookID);
    }

    @Override
    public void updateBook(Book oldBook, Book newBook) {
        if (bookRepo.existsById(oldBook.getId())) {
            this.deleteBook(oldBook.getId());
            this.saveBook(newBook);
        } else {
            this.saveBook(newBook);
        }
    }
}
