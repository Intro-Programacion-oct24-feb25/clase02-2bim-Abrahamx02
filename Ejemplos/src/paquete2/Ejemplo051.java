/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.*;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese el numero de elementos" );
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        int[] arreglo1 = new int[15];
        // Se asigna valores al arreglo
        arreglo1[0] = 10;
        arreglo1[1] = 30;
        arreglo1[2] = 50;
        arreglo1[3] = 70;
        arreglo1[4] = 90;
        System.out.printf("%d\n", arreglo1.length);
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %d\n",
                    i, arreglo1[i]);
        }
        
    }

}
