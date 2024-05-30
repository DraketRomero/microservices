package com.pruebatecnica.pruebatecnica.controllers.dto;

import com.pruebatecnica.pruebatecnica.entities.Book;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDTO {
    private String name;
    private String lastname;
    private String secondLastname;
    private List<Book> bookList = new ArrayList<>();
}
