package com.pruebatecnica.pruebatecnica.persistence.impl;

import com.pruebatecnica.pruebatecnica.entities.Book;
import com.pruebatecnica.pruebatecnica.persistence.IBookDAO;
import com.pruebatecnica.pruebatecnica.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDAOImpl implements IBookDAO {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }
}
