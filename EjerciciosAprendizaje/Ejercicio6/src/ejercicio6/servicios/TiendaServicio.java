/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author WIN11
 */
public class TiendaServicio {

    private final Scanner scan = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> productos = new HashMap();

    public void crearProducto() {

        String op;
        boolean logic = false;

        do {

            System.out.println("Ingrese nombre del producto que desea registrar");
            String producto = scan.next();

            System.out.println("Ingrese el precio de ese producto");
            int precio = scan.nextInt();

            productos.put(producto, precio);

            System.out.println("Desea ingresar otro producto? (si) o (no)");
            op = scan.next();

            if ("no".equals(op)) {
                System.out.println("MUCHAS GRACIAS!!");
                logic = true;
            }

        } while (logic == false);

    }

    public void mostrarProductos() {

        System.out.println("----------PRODUCTOS----------");
        productos.entrySet().forEach((entry) -> {
            System.out.println("Producto: " + entry.getKey() + " precio: $" + entry.getValue());
        });

    }

    public void ordenarProductos() {

        TreeMap<String, Integer> productosTree = new TreeMap();

    }

    public void eliminarProducto() {

        String op;
        boolean logic = false;

        do {

            System.out.println("Ingrese el nombre del elemento que desea borrar");
            String producto = scan.next();

            System.out.println("Desea borrar otro producto? (si) o (no)");
            op = scan.next();
            
            productos.remove(producto);

            if ("no".equals(op)) {
                System.out.println("MUCHAS GRACIAS!!");
                logic = true;
            }

        } while (logic == false);

    }

}
