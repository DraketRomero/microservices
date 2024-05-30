package com.pruebatecnica.pruebatecnica.repository;

import com.pruebatecnica.pruebatecnica.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
