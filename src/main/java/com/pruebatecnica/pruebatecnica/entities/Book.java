package com.pruebatecnica.pruebatecnica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="Libro")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String name;

    @Column(name="precio")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "id_author", nullable = false)
    @JsonIgnore
    private Author author;
}
