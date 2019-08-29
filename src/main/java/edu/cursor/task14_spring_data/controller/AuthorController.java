package edu.cursor.task14_spring_data.controller;

import edu.cursor.task14_spring_data.models.Author;
import edu.cursor.task14_spring_data.models.TwoAuthors;
import edu.cursor.task14_spring_data.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class AuthorController {
    private AuthorService authorService;

    @PostMapping("/saveAuthor")
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }

    @GetMapping("/find_author/{authorID}")
    public Author findAuthor(@PathVariable("authorID") Long authorID) {
        return authorService.findAuthor(authorID);
    }

    @DeleteMapping("/delete_author/{authorID}")
    public void deleteAuthor(@PathVariable("authorID") Long authorID) {
        authorService.deleteAuthor(authorID);
    }

    @PutMapping("/update_author")
    public void updateAuthor(@RequestBody TwoAuthors twoAuthors) {
        authorService.updateAuthor(twoAuthors.getOldAuthor(), twoAuthors.getNewAuthor());
    }
}
