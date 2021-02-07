/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaarrays;

import java.util.*;
import static java.util.Arrays.sort;

/**
 *
 * @author gerar
 */
public class ProgramaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*3. Codificar un programa que lea 10 números y los almacene en un
array y después los muestre ordenados de menor a mayor. Hacer
commit para que se guarde en el repositorio local.*/
        Scanner sc = new Scanner(System.in);

        int aux, tamaño, numero;
        do {
            System.out.println("Anota cuantos numeros quieres anotar, maximo 10:");
            tamaño = sc.nextInt();
        } while (tamañoValido(tamaño) == false);
        int numeros[] = new int[tamaño];
        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.println("Anota un numero");
                aux = sc.nextInt();
            } while (numeroValido(numeros, aux) == false);
            numeros[i] = aux;
        }
        sort(numeros);
        System.out.println("anota un numero para saber si esta en el array:");
        numero = sc.nextInt();
        if (buscarNumero(numeros, numero) == false) {
            System.out.println("el numero no esta en el array");
        } else {
            System.out.println("el numero esta en el array");
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

    public static boolean numeroValido(int v[], int numero) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == numero) {
                return false;
            }
        }
        return true;

    }

    public static boolean tamañoValido(int tamaño) { //validacion hecha en el punto 6
        if (tamaño > 10 || tamaño < 1) {
            return false;
        }
        return true;
    }

    public static boolean buscarNumero(int v[], int numero) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == numero) {
                return true;
            }
        }
        return false;
    }

}
