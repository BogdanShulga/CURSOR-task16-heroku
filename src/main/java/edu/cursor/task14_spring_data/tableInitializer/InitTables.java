package edu.cursor.task14_spring_data.tableInitializer;

import edu.cursor.task14_spring_data.models.Author;
import edu.cursor.task14_spring_data.models.Book;
import edu.cursor.task14_spring_data.service.AuthorService;
import edu.cursor.task14_spring_data.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitTables {
    private AuthorsBooks authorsBooks;
    private AuthorService authorService;
    private BookService bookService;

    @Autowired
    public void setAuthorsBooks(AuthorsBooks authorsBooks) {
        this.authorsBooks = authorsBooks;
    }

    @Autowired
    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public void initiateH2tables() {
        List<Author> authors = authorsBooks.getAuthors();

        for (Author author : authors) {
            authorService.saveAuthor(author);
        }

        List<Book> books = authorsBooks.getBooks();

        for (Book book : books) {
            bookService.saveBook(book);
        }
    }
}
