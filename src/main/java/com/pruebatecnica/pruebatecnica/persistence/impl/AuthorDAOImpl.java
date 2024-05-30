package com.pruebatecnica.pruebatecnica.persistence.impl;

import com.pruebatecnica.pruebatecnica.entities.Author;
import com.pruebatecnica.pruebatecnica.persistence.IAuthorDAO;
import com.pruebatecnica.pruebatecnica.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorDAOImpl implements IAuthorDAO {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }
}
