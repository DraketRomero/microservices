package com.pruebatecnica.pruebatecnica;

import com.pruebatecnica.pruebatecnica.controllers.dto.AuthorDTO;
import com.pruebatecnica.pruebatecnica.controllers.dto.BookDTO;
import com.pruebatecnica.pruebatecnica.entities.Author;
import com.pruebatecnica.pruebatecnica.entities.Book;
import com.pruebatecnica.pruebatecnica.orchestrator.BookStoreOrchestrator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class PruebatecnicaApplicationTests {

    @Autowired
    private BookStoreOrchestrator bookStoreOrchestrator;

    Book book = new Book();
    Author author = new Author();

    @Test
    public void testSaveAuthor() {
        book.setName("Harry Potter");
        book.setPrice(BigDecimal.valueOf(39.00));

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);

        author.setName("Jhon");
        author.setLastname("Doe");
        author.setSecondLastname("Jimenez");

        AuthorDTO authorDTO = new AuthorDTO(author.getName(), author.getLastname(), author.getSecondLastname(), bookList);

        Assertions.assertEquals(200, bookStoreOrchestrator.saveAuthor(authorDTO).getStatusCode().value());
    }

    @Test
    public void testSaveBook() {
        author.setName("Jhon");
        author.setLastname("Doe");
        author.setSecondLastname("Jimenez");

        BookDTO bookDTO = new BookDTO("Harry Potter", BigDecimal.valueOf(39.00), author);

        Assertions.assertEquals(200, bookStoreOrchestrator.saveBook(bookDTO).getStatusCode().value());
    }
}
