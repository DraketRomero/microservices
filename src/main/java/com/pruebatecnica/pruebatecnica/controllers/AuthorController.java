package com.pruebatecnica.pruebatecnica.controllers;

import com.pruebatecnica.pruebatecnica.controllers.dto.AuthorDTO;
import com.pruebatecnica.pruebatecnica.orchestrator.BookStoreOrchestrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    private final BookStoreOrchestrator bookStoreOrchestrator;

    @Autowired
    public AuthorController(BookStoreOrchestrator bookStoreOrchestrator) {
        this.bookStoreOrchestrator = bookStoreOrchestrator;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createAuthor(@RequestBody AuthorDTO authorDTO) {
        return this.bookStoreOrchestrator.saveAuthor(authorDTO);
    }
}
