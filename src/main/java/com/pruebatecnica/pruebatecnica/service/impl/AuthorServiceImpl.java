package com.pruebatecnica.pruebatecnica.service.impl;

import com.pruebatecnica.pruebatecnica.controllers.dto.AuthorDTO;
import com.pruebatecnica.pruebatecnica.entities.Author;
import com.pruebatecnica.pruebatecnica.persistence.IAuthorDAO;
import com.pruebatecnica.pruebatecnica.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements IAuthorService {

    @Autowired
    private IAuthorDAO iAuthorDAO;

    public void save(AuthorDTO authorDTO) {
        if (!authorDTO.getName().isBlank() || authorDTO.getLastname() != null || authorDTO.getSecondLastname() != null) {
            iAuthorDAO.save(
                    Author.builder()
                            .name(authorDTO.getName())
                            .lastname(authorDTO.getLastname())
                            .secondLastname(authorDTO.getSecondLastname())
                            .build());
        }
    }
}
