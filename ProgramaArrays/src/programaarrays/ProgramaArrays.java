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
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Anota un numero");
            numeros[i] = sc.nextInt();
        }
        sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

}