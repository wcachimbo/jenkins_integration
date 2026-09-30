package com.curso.docker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @GetMapping
    public List<Movie> getMovies() {
        return List.of(
                new Movie("El padrino", "Francis Ford Coppola"),
                new Movie("El caballero oscuro", "Christopher Nolan"),
                new Movie("Pulp Fiction", "Quentin Tarantino"),
                new Movie("El señor de los anillos: El retorno del rey", "Peter Jackson"),
                new Movie("Parásitos", "Bong Joon-ho")
        );
    }

    public record Movie(String title, String director) {
    }
}
