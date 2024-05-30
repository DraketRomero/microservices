package com.pruebatecnica.pruebatecnica.service.impl;

import com.pruebatecnica.pruebatecnica.controllers.dto.BookDTO;
import com.pruebatecnica.pruebatecnica.entities.Book;
import com.pruebatecnica.pruebatecnica.persistence.IBookDAO;
import com.pruebatecnica.pruebatecnica.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookDAO iBookDAO;

    @Override
    public void save(BookDTO bookDTO) {
        if (!bookDTO.getName().isBlank() || bookDTO.getPrice() != null || bookDTO.getAuthor() != null) {
            Book book = Book.builder()
                    .name(bookDTO.getName())
                    .price(bookDTO.getPrice())
                    .author(bookDTO.getAuthor())
                    .build();

            iBookDAO.save(book);
        }
    }
}
