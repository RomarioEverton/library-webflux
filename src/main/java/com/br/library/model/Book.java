package com.br.library.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = {"id","title","author"})
@Data
@Document(value = "books")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private Boolean available;
    private Double value;
}