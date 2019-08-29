package edu.cursor.task14_spring_data.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TwoAuthors {
    private Author oldAuthor;
    private Author newAuthor;
}
