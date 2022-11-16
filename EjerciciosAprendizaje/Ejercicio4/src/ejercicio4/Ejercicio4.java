/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.servicios.PeliculaSercicio;

/**
 *
 * @author WIN11
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PeliculaSercicio pServ = new PeliculaSercicio();
        
        pServ.crearPelicula();
        pServ.mostrarPelicula();
        pServ.mostrarPeliculaUnaHora();
        pServ.ordenarPelicula();
        pServ.ordenarPeliculaMenorMayor();
        pServ.ordenarPeliculaTitulo();
        pServ.ordenarPeliculaDirector();
        
    }
    
}
