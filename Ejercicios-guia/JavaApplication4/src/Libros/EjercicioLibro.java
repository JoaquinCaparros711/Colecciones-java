/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

import Libros.entidades.Libro;
import java.util.ArrayList;

/**
 *
 * @author WIN11
 */
public class EjercicioLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Libro> libros;
        libros = new ArrayList();
        
        Libro libro = new Libro();
        
        libro.setLibro("El principito");
        
        libros.add(libro);
        
        
    }
    
}
