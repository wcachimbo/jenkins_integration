package com.curso.docker;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@SpringBootApplication
public class LambdaRecord {
    public static void main(String[] arg) {

        Function<Persona, String> presentacion = (persona) -> "Hola soy " + persona.nombre() + " y tengo " + persona.edad + "años ";
        var p = new Persona(" Carlos", 30);
        p = modificarPersona(p);
        System.out.println(presentacion.apply(p));

        Consumer<String> dd = nombre -> System.out.println("Hola mundo "+ nombre );
        dd.accept("Robert");
    }

    private static Persona modificarPersona(Persona p) {
        var nombre = p.nombre().toUpperCase().substring(0, 4) + "los";
        var edad = p.edad() + 10;
        return new Persona(nombre, edad);

    }

    record Persona(String nombre, int edad) {
        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Edad: " + edad;
        }

    }

}

