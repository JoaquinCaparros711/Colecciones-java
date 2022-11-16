/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.servicios.TiendaServicio;

/**
 *
 * @author WIN11
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TiendaServicio producto = new TiendaServicio();
        
        producto.crearProducto();
        producto.ordenarProductos();
        producto.mostrarProductos();
        
        producto.eliminarProducto();
        producto.mostrarProductos();
        
        
    }
    
}
