/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razasPerros = new ArrayList();

        String op;

        do {

            System.out.println("Ingrese una raza de perro para guardar en la lista");
            String raza = scan.next();

            razasPerros.add(raza);

            System.out.println("Desea ingresar otro perro? (si) o (no)");
            op = scan.next();

            switch (op) {
                case "no":
                    System.out.println("=======Estos son los perros de su lista=======");
                    razasPerros.forEach((perro) -> {
                        System.out.println(perro);
                    });
                    break;
                case "si":
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (op.equals("si"));

        System.out.println("Ingrese otra raza de perro. Si se encuentra en la lista la raza ingresada automaticamente se eliminara de la lista.");
        String raza2 = scan.next();

        Iterator<String> it = razasPerros.iterator();

        boolean aux = false;

        while (it.hasNext()) {

            if (it.next().equals(raza2)) {
                it.remove();
            } else {
                aux = true;
            }
        }

        if (aux == true) {
            System.out.println("La raza ingresada no se encontro en la lista");
        }

        Collections.sort(razasPerros);

        System.out.println("=======Estos son los perros de su lista ordenada=======");
        razasPerros.forEach((perro) -> {
            System.out.println(perro);
        });

    }

}
