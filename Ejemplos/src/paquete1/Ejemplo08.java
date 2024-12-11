/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        
        int dato;
        int suma = 0;
        String cadenaFinal = "Valores:\n";
        // arreglo de tipo entero
        // se le asigna valores concretos al arreglo cuando se lo
        // inicializa
        int[] arreglo1 = {1000, 2000, 3000, 4003, 5000}; // arreglo de 5 elementos
        int [] sumas = new int [2];                                                                     // posicion 0, almacena la suma de los valores pares
                                                                             //posicion 1, almacena la suma de los impares
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[1]% 2 ==0){
                sumas [0] = sumas [0] + arreglo1 [1];
            }else {
                sumas [1] = sumas [1] + arreglo1 [1];
            }
            // agrego el valor de la posición del arreglo a la variable
            // acumuladora  suma
            suma = suma + arreglo1[i];
            
            // acumula mi cadenaFinal
            cadenaFinal = String.format("%s%d\n", cadenaFinal, arreglo1[i]);
        }
        
        // System.out.printf("La suma de los valores del arreglo es: %d\n", suma);
        // cadenaFinal = String.format("%s%d\n", cadenaFinal, suma);
        System.out.printf("%s\nLa suma de los valores pares e impares es :%d\n"
                + "la suma de pares es : %d\n"
                + "la suma de impares es : %d\n", 
                cadenaFinal, suma, sumas [0],sumas [1]);
        
    }
    /*
    Valores:
    1000
    2000
    3000
    4000
    5000
    La suma de los valores del arreglo es: 15000
    
    */

}
