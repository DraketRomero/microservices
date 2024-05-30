package com.pruebatecnica.pruebatecnica.controllers.dto;
import com.pruebatecnica.pruebatecnica.entities.Author;
import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO {
    private String name;
    private BigDecimal price;
    private Author author;
}
