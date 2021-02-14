/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_2B;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class DigitosPrimos {

    public static void main(String[] args) {
        /*Leer n números enteros,
	almacenarlos en un vector y
	determinar cuántos dígitos primos
	hay en los números leídos.*/
        int n, cde = 0, cp = 0, aux;
        int[] A;
        String num;
        Scanner sc = new Scanner(System.in);
        System.out.println("---Programa Para Contar Dígitos Primos---");
        System.out.print("Ingrese el límite del vector: ");
        n = sc.nextInt();
        A = new int[n];
        System.out.println("Ingrese los elementos del vector...");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            A[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.print("Vector: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            num = String.valueOf(A[i]);
            for (int j = 0; j < num.length(); j++) {
                aux = Integer.parseInt(num.substring(j, j + 1));
                for (int k = 1; k <= aux; k++) {
                    if (aux % k == 0) {
                        cde++;
                    }
                }
                if (cde == 2) {
                    cp++;
                }
                cde = 0;
            }
        }
        System.out.println("");
        if (cp != 0) {
            System.out.println("En total hay " + cp + " dígitos primos ingresados en el vector.");

        } else {
            System.out.println("No hay dígitos primos ingresados en el vector.");
        }
    }
}
