/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.servicios;

import ejercicio4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class PeliculaSercicio {

    private final Scanner scan = new Scanner(System.in).useDelimiter("\n");

    private final ArrayList<Pelicula> peliculas;

    public PeliculaSercicio() {
        this.peliculas = new ArrayList();
    }

    public void crearPelicula() {

        String op;
        boolean logic = false;

        do {

            System.out.println("Ingrese el nombre de la pelicula");
            String titulo = scan.next();

            System.out.println("Ingrese el nombre del director de la pelicula");
            String director = scan.next();

            System.out.println("Ingrese la duracion de la pelicula en horas");

            int horas = scan.nextInt();
            Date duracion = new Date();
            duracion.setHours(horas);

            Pelicula pelicula = new Pelicula(titulo, director, duracion);

            peliculas.add(pelicula);

            System.out.println("Desea ingresar otra pelicula? (si) o (no)");
            op = scan.next();

            if ("no".equals(op)) {
                System.out.println("MUCHAS GRACIAS!!");
                logic = true;
            }

        } while (logic == false);

    }

    public void mostrarPelicula() {

        System.out.println("----------PELICULAS----------");
        for (int i = 0; i < peliculas.size(); i++) {

            System.out.println("Pelicula " + i + ": " + peliculas.get(i));

        }

    }

    public void mostrarPeliculaUnaHora() {

        System.out.println("----------PELICULAS MAYOR A UNA HORA----------");

        for (int i = 0; i < peliculas.size(); i++) {

            Pelicula pelicula = peliculas.get(i);

            if (pelicula.getDuracion().getHours() > 1) {
                System.out.println(peliculas.get(i));
            }

        }

    }

    public void ordenarPelicula() {

        System.out.println("----------PELICULAS ORDENADAS DE MAYOR A MENOR SEGUN HORAS----------");

        for (int i = 0; i < peliculas.size(); i++) {

            peliculas.sort(Pelicula.compararDuracion);

            System.out.println(peliculas.get(i));
        }

    }

    public void ordenarPeliculaMenorMayor() {

        System.out.println("----------PELICULAS ORDENADAS DE MENOR A MAYOR SEGUN HORAS----------");

        for (int i = 0; i < peliculas.size(); i++) {

            peliculas.sort(Pelicula.compararDuracionMenorMayor);

            System.out.println(peliculas.get(i));
        }

    }

    public void ordenarPeliculaTitulo() {

        System.out.println("----------PELICULAS ORDENADAS POR TITULO----------");

        for (int i = 0; i < peliculas.size(); i++) {

            peliculas.sort(Pelicula.compararTitulo);

            System.out.println(peliculas.get(i));
        }

    }

    public void ordenarPeliculaDirector() {

        System.out.println("----------PELICULAS ORDENADAS POR DIRECTOR----------");

        for (int i = 0; i < peliculas.size(); i++) {

            peliculas.sort(Pelicula.compararDirector);

            System.out.println(peliculas.get(i));
        }

    }

}
