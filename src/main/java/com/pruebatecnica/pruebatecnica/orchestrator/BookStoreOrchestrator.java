package com.pruebatecnica.pruebatecnica.orchestrator;

import com.pruebatecnica.pruebatecnica.controllers.dto.AuthorDTO;
import com.pruebatecnica.pruebatecnica.controllers.dto.BookDTO;
import com.pruebatecnica.pruebatecnica.service.IAuthorService;
import com.pruebatecnica.pruebatecnica.service.IBookService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class BookStoreOrchestrator {
    private final IBookService iBookService;
    private final IAuthorService iAuthorService;

    @Autowired
    public BookStoreOrchestrator(IBookService iBookService, IAuthorService iAuthorService) {
        this.iBookService = iBookService;
        this.iAuthorService = iAuthorService;
    }

    @Transactional
    public ResponseEntity<?> saveBook(BookDTO bookDTO) {
        try {
            iBookService.save(bookDTO);
            return ResponseEntity.status(HttpStatus.OK).body("Libro guardado correctamente.");
        }catch (HttpClientErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear libro. " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error inesperado en el servidor." + e.getMessage());
        }
    }

    @Transactional
    public ResponseEntity<?> saveAuthor(AuthorDTO authorDTO){
        try {
            iAuthorService.save(authorDTO);
            return ResponseEntity.status(HttpStatus.OK).body("Autor guardado correctamente.");
        }catch (HttpClientErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear autor. " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error inesperado en el servidor." + e.getMessage());
        }
    }
}
