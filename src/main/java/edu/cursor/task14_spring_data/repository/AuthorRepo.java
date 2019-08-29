package edu.cursor.task14_spring_data.repository;

import edu.cursor.task14_spring_data.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
