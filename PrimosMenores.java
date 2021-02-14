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
public class PrimosMenores {

    public static void main(String[] args) {
        /*Leer una matriz 4x6 entera y determinar
	en qué posiciones están los menores
	primos por fila.*/
        int primo = 0, cde = 0;
        int[][] A = new int[4][6];
        boolean band = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("---Programa Para Encontrar El Menor Primo Por Fila---");
        System.out.println("Ingrese los elementos de la matriz...");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("La matriz queda así:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 1; k <= A[i][j]; k++) {
                    if (A[i][j] % k == 0) {
                        cde++;
                    }
                }
                if (cde == 2) {
                    if (primo == 0) {
                        primo = A[i][j];
                    } else {
                        if (A[i][j] < primo) {
                            primo = A[i][j];
                        }
                    }
                }
                cde = 0;
            }
            for (int j = 0; j < 6; j++) {
                if ((primo == A[i][j]) && (primo != 0)) {
                    if (band == false) {
                        System.out.print("El menor número primo de la fila " + i + " se encuentra en la posición: ");
                        band = true;
                    }
                    System.out.print("[" + i + "," + j + "] ");
                }
            }
            if (band == false) {
                System.out.print("No se ha encontrado ningún número primo en la fila " + i);
            }
            System.out.println("");
            band = false;
            primo = 0;
        }
    }
}
