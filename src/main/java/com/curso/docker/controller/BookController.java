package com.curso.docker.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping
    public List<Book> getBooks() {
        log.info("Inicio la petición de libros");
        return List.of(
                new Book("Cien años de soledad", "Gabriel García Márquez"),
                new Book("Don Quijote de la Mancha", "Miguel de Cervantes"),
                new Book("1984", "George Orwell"),
                new Book("El principito", "Antoine de Saint-Exupéry"),
                new Book("Orgullo y prejuicio", "Jane Austen")
        );
    }

    public record Book(String title, String author) {
    }
}
