package com.example.demo;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PeliculasController {
    private List<Peliculas> peliculas = new ArrayList<>();
    
    public PeliculasController(){
        peliculas.add(new Peliculas(1, "El Padrino", 1972, "Francis Ford Coppola", "Drama", "La historia de la familia Corleone durante la década de 1940 en Nueva York."));
        peliculas.add(new Peliculas(2, "El Señor de los Anillos: La Comunidad del Anillo", 2001, "Peter Jackson", "Fantasía", "Frodo Bolsón se embarca en un viaje para destruir el Anillo Único y derrotar a Sauron."));
        peliculas.add(new Peliculas(3, "Matrix", 1999, "Lana Wachowski, Lilly Wachowski", "Ciencia ficción", "Un programador descubre la verdad sobre su realidad y su papel en la lucha contra las máquinas."));
        peliculas.add(new Peliculas(4, "Interestelar", 2014, "Christopher Nolan", "Ciencia ficción", "Un grupo de exploradores viaja a través de un agujero de gusano en busca de un nuevo hogar para la humanidad."));
        peliculas.add(new Peliculas(5, "El Rey León", 1994, "Roger Allers, Rob Minkoff", "Animación", "Simba, un joven león, se embarca en un viaje para reclamar su lugar como rey después de la muerte de su padre, Mufasa."));



    }
    @GetMapping("/peliculas")
    public List<Peliculas> getPeliculas(){
        return peliculas;
    }
     // Obtener una película por su ID
    @GetMapping("/peliculas/{id}")
    public Peliculas obtenerPeliculaPorId(@PathVariable int id) {
        for (Peliculas pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null; // Si no se encuentra la película
    }
    

}   
