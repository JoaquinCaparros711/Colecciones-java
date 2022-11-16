/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

/**
 *
 * @author Joaco
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> listado;
        listado = new ArrayList();

        HashSet<String> arbol;
        arbol = new HashSet();

        HashMap<Integer, String> personas = new HashMap();

        for (int i = 0; i < 5; i++) {
            listado.add(i);
        }

        arbol.add("Padre");
        arbol.add("Madre");
        arbol.add("Hermano1");
        arbol.add("Hermano2");
        arbol.add("Hermano3");

        personas.put(1, "Juan");
        personas.put(2, "Juan");
        personas.put(3, "Pedro");
        personas.put(4, "Juan");
        personas.put(5, "Juan");

//        listado.remove(0);
//
//        arbol.remove("Hermano1");

//        personas.remove(2);

        // Iterator
        Iterator iterator = listado.iterator();
        Iterator iterator2 = arbol.iterator();

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next() + " ");
//        }

        while (iterator2.hasNext()) {
            if (iterator2.next().equals("Hermano2")) {
                iterator2.remove();
            }
        }
        
        //Ordenamos 
        Collections.sort(listado);
        
        ArrayList<String> arbolList = new ArrayList(arbol);
        Collections.sort(arbolList);
        
        TreeMap<Integer, String> personasTree = new TreeMap(personas);
        Collections.sort(arbolList);
        
        
        // Mostramos

        listado.forEach((num) -> {
            System.out.println(num);
        });

        arbolList.forEach((cadena) -> {
            System.out.println(cadena);
        });

        personasTree.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });

    }

}
