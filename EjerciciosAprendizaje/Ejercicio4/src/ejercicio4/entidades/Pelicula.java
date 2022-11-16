/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.entidades;

import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author WIN11
 */
public class Pelicula {

    private String titulo;
    private String director;
    private Date duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Date duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion.getHours() + " hs" + '}';
    }

    public static Comparator<Pelicula> compararDuracion = (Pelicula p1, Pelicula p2) -> {
        return p2.getDuracion().compareTo(p1.getDuracion());
    };

    public static Comparator<Pelicula> compararDuracionMenorMayor = (Pelicula p1, Pelicula p2) -> {
        return p1.getDuracion().compareTo(p2.getDuracion());
    };

    public static Comparator<Pelicula> compararTitulo = (Pelicula p1, Pelicula p2) -> {
        return p1.getTitulo().compareTo(p2.getTitulo());
    };
    
    public static Comparator<Pelicula> compararDirector = (Pelicula p1, Pelicula p2) -> {
        return p1.getDirector().compareTo(p2.getDirector());
    };
}
