/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.servicios;

import ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class AlumnoServicio {

    private final Scanner scan = new Scanner(System.in).useDelimiter("\n");

    private final ArrayList<Alumno> alumnos;
    private final ArrayList<Integer> notas;

    public AlumnoServicio() {
        this.alumnos = new ArrayList();
        this.notas = new ArrayList();
    }

    String op;
    boolean logic;
    String nombre;
    Alumno m;

    public Alumno crearAlumno() {

        do {

            System.out.println("Ingrese el nombre del alumno");
            nombre = scan.next();

            System.out.println("Ingrese la primer nota del alumno");
            notas.add(scan.nextInt());

            System.out.println("Ingrese la segunda nota del alumno");
            notas.add(scan.nextInt());

            System.out.println("Ingrese la tercera nota del alumno");
            notas.add(scan.nextInt());

            System.out.println("Desea ingresar otro alumno? (no) o (si)");
            op = scan.next();

            m = new Alumno(nombre, notas);

            alumnos.add(m);

            if (op.equals("no")) {
                logic = true;
            }

        } while (logic == false);

        return m;

    }

    public void notaFinal() {

        Iterator iterator = alumnos.iterator();

        System.out.println("Ingrese el nombre del alumno para ver el promedio final");
        String resp = scan.next();
        while (iterator.hasNext()) {
            if (iterator.next().equals(resp)) {
                alumnos.forEach((a) -> {
                    System.out.println(a.toString());
                });
            } else {
                System.out.println("El nombre ingresado no se encuentra en la lista");
            }
        }
        alumnos.forEach((a) -> {
            System.out.println(a);
        });

    }

}
