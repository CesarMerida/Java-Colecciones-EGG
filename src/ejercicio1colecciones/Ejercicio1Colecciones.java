/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1colecciones;

/**
 *
 * @author chech
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        ArrayList<String> razaArrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese Raza de Perros: ");
            razaArrayList.add(leer.nextLine());
            System.out.print("¿Quiere agregar otro perro? (s/n): ");
            String respuesta = leer.nextLine();
            // mostrar razas guardadas opcion1
            if (respuesta.toLowerCase().equals("n")) {
                //System.out.println(" Se guardaron " + razaArrayList.size() + " razas de perros y son " + razaArrayList);
                break;
            }
            System.out.println("");
        }
       // mostrar razas guardadas opcion 2
        System.out.println("");
        System.out.println("Son " +razaArrayList.size()+ " Raza de Perros guardados:" );
          for (String razaArrayList1 : razaArrayList) {
            System.out.println(razaArrayList1);
        }
    }
}
