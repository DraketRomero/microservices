package com.pruebatecnica.pruebatecnica.controllers;

import com.pruebatecnica.pruebatecnica.controllers.dto.BookDTO;
import com.pruebatecnica.pruebatecnica.orchestrator.BookStoreOrchestrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/book")
public class BookController {
    private final BookStoreOrchestrator bookStoreOrchestrator;

    @Autowired
    public BookController(BookStoreOrchestrator bookStoreOrchestrator) {
        this.bookStoreOrchestrator = bookStoreOrchestrator;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createBook(@RequestBody BookDTO bookDTO) {
        return this.bookStoreOrchestrator.saveBook(bookDTO);
    }
}
