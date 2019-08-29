package edu.cursor.task14_spring_data.repository;

import edu.cursor.task14_spring_data.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
