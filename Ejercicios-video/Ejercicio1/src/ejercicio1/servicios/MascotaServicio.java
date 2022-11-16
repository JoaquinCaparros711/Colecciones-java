/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.servicios;

import ejercicio1.entidades.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class MascotaServicio {

    private final Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private final ArrayList<Mascota> mascotas;

    public MascotaServicio() {
        this.mascotas = new ArrayList();
    }

    public Mascota crearMascota() {

        System.out.println("Introducir nombre");
        String nombre = scan.next();

        System.out.println("Introducir apodo");
        String apodo = scan.next();

        System.out.println("Introducir tipo");
        String tipo = scan.next();

        return new Mascota(nombre, apodo, tipo);

    }

    public void agregarMascota(Mascota m) {

        mascotas.add(m);

    }

    public void mostrarMascotas() {

        System.out.println("Las mascotas actuales de la lista son: ");

        mascotas.forEach((aux) -> {
            System.out.println(aux.toString());
        });

        System.out.println("Cantidad = " + mascotas.size());

    }

    public void fabricaChiquitos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            mascotas.add(new Mascota("Jerry", "Chiquito", "Salchicha"));

        }

    }

    public void fabricaMascota(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            Mascota mascotaCreada = crearMascota();

            agregarMascota(mascotaCreada);

            System.out.println(mascotaCreada.toString());

        }

    }

//    public void actualizarMascota(int index) {
//
//        Mascota m = mascotas.get(index);
//        m.setApodo("messi");
//
//    }
    public void actualizarMascota(int index) {

        if (index <= (mascotas.size() - 1)) {
            System.out.println("");
            System.out.println("------------ACTUALIZAR------------");

            Mascota m = crearMascota();
            mascotas.set(index, m);
        } else {
            System.out.println("El indice es erroneo");
        }

    }

    public void eliminarMascota(int index) {
        
        mascotas.remove(index);

    }

}
