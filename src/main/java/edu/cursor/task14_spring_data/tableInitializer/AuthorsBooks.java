package edu.cursor.task14_spring_data.tableInitializer;

import edu.cursor.task14_spring_data.models.Author;
import edu.cursor.task14_spring_data.models.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class AuthorsBooks {
    private List<Author> authors;
    private List<Book> books;
}
