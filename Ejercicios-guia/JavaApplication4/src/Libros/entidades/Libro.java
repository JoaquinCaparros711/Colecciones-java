/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros.entidades;

/**
 *
 * @author WIN11
 */
public class Libro {
    
    private String libro;

    public Libro() {
    }

    public Libro(String libro) {
        this.libro = libro;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Libro{" + "libro=" + libro + '}';
    }
    
    
    
}
