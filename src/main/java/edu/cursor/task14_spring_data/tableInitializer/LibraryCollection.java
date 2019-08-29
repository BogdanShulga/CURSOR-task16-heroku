package edu.cursor.task14_spring_data.tableInitializer;

import edu.cursor.task14_spring_data.models.Author;
import edu.cursor.task14_spring_data.models.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class LibraryCollection {
    @Bean
    public AuthorsBooks initiateAuthorBooksMap() {
        List<Author> authors = new ArrayList<>();
        List<Book> books = new ArrayList<>();

        Author author1 = new Author();
        author1.setFirstName("Aditi");
        author1.setLastName("Das Bhowmik");
        author1.setCountry("India");
        author1.setAge(32);

        Book book1 = new Book();
        book1.setDescription("A short fictional story of two friends held in the claws of a ravaging earthquake.");
        book1.setGenre("Short Story");
        book1.setRate(8);
        book1.setTitle("Friends Forever");
        author1.addBook(book1);

        Author author2 = new Author();
        author2.setFirstName("Tom");
        author2.setLastName("Clancy");
        author2.setCountry("USA");
        author2.setAge(72);

        Book book2 = new Book();
        book2.setDescription("A Japanese financier seeks revenge on the United States for the death of his parents during World War II, devising a scheme which threatens to plunge the world into another world war.");
        book2.setGenre("Thriller");
        book2.setRate(6);
        book2.setTitle("Debt of honor");
        author2.addBook(book2);

        Author author3 = new Author();
        author3.setFirstName("Miguel");
        author3.setLastName("de Cervantes Saavedra");
        author3.setCountry("Italy");
        author3.setAge(56);

        Book book3 = new Book();
        book3.setDescription("Wolves of the Calla continues the adventures of Roland, the Last Gunslinger and survivor of a civilized world that has moved on.");
        book3.setGenre("Thriller");
        book3.setRate(5);
        book3.setTitle("Wolves of the Calla");
        author3.addBook(book3);

        Author author4 = new Author();
        author4.setFirstName("Kelly");
        author4.setLastName("Kevin");
        author4.setCountry("England");
        author4.setAge(67);

        Book book4 = new Book();
        book4.setDescription("Don Quijote de la Mancha es una novela escrita por el español Miguel de Cervantes Saavedra.");
        book4.setGenre("History");
        book4.setRate(8);
        book4.setTitle("El ingenioso hidalgo Don Quijote de la Mancha");
        author4.addBook(book4);

        Author author5 = new Author();
        author5.setFirstName("Assata");
        author5.setLastName("Shakur");
        author5.setCountry("USA");
        author5.setAge(72);

        Book book5 = new Book();
        book5.setDescription("A fascinating, innovative, and optimistic look at how humanity and technology join to produce increasing opportunities in the world and how technology can give our lives greater meaning");
        book5.setGenre("Technology");
        book5.setRate(9);
        book5.setTitle("What technology wants");
        author5.addBook(book5);

        Author author6 = new Author();
        author6.setFirstName("Ken");
        author6.setLastName("Follett");
        author6.setCountry("United Kingdom");
        author6.setAge(70);

        Book book6 = new Book();
        book6.setDescription("The new biology of machines, social systems, and the economic world.");
        book6.setGenre("Inventions");
        book6.setRate(7);
        book6.setTitle("Out of control");
        author6.addBook(book6);

        Author author7 = new Author();
        author7.setFirstName("Roald");
        author7.setLastName("Dahl");
        author7.setCountry("England");
        author7.setAge(74);

        Book book7 = new Book();
        book7.setDescription("On May 2, 1973, Black Panther Assata Shakur (aka JoAnne Chesimard) lay in a hospital, close to death, handcuffed to her bed, while local, state, and federal police attempted to question her about the shootout on the New Jersey Turnpike that had claimed the life of a white state trooper.");
        book7.setGenre("Autobiography");
        book7.setRate(10);
        book7.setTitle("Assata");
        author7.addBook(book7);

        Author author8 = new Author();
        author8.setFirstName("Larsson");
        author8.setLastName("Stieg");
        author8.setCountry("USA");
        author8.setAge(65);

        Book book8 = new Book();
        book8.setDescription("A towering tale... A ripping read...");
        book8.setGenre("Novel");
        book8.setRate(7);
        book8.setTitle("The pillars of the earth");
        author8.addBook(book8);

        Author author9 = new Author();
        author9.setFirstName("Bill");
        author9.setLastName("Bryson");
        author9.setCountry("Great Britain");
        author9.setAge(76);

        Book book9 = new Book();
        book9.setDescription("I may be 49 years old, but Roald Dahl is definitely at the top of the list of my favourite authors. His books are different from the movies, be prepared for an even better experience.");
        book9.setGenre("Fiction");
        book9.setRate(6);
        book9.setTitle("The witches");
        author9.addBook(book9);

        Author author10 = new Author();
        author10.setFirstName("David");
        author10.setLastName("Graeber");
        author10.setCountry("Great Britain");
        author10.setAge(58);

        Book book10 = new Book();
        book10.setDescription("Although now best known for his childrens books, Roald Dahl of course wrote many short stories, often with a darkly humorous twist at the end. Herewith dramatisations of five such darkly humorous tales.....");
        book10.setGenre("Drama");
        book10.setRate(4);
        book10.setTitle("Served With A Twist");
        author10.addBook(book10);

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);
        authors.add(author5);
        authors.add(author6);
        authors.add(author7);
        authors.add(author8);
        authors.add(author9);
        authors.add(author10);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        return new AuthorsBooks(authors, books);
    }
}
