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
public class NumeroMayorMatriz {

    public static void main(String[] args) {
        /*Construir una función que reciba como
	parámetro una matriz 4x4 entera y
	retorne el número de la fila en donde se
	encuentre por primera vez el número
	mayor de la matriz.*/
        int fila;
        int[][] A = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("---Programa Para Localizar La Fila En Donde Se Encuentra El Mayor Número De La Matriz---");
        System.out.println("Ingrese los elementos de la matriz...");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("La matriz queda así:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        fila = NumeroMayor(A);
        if (fila != 16) {
            System.out.println("El mayor número de la matriz se encuentra por primera vez en la fila " + fila);
        } else {
            System.out.println("No hay número mayor, porque la matriz está igualada a " + A[0][0]);
        }
    }

    public static int NumeroMayor(int[][] B) {
        int n, fil = 0, ci = 0;
        n = B[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (B[i][j] > n) {
                    n = B[i][j];
                    fil = i;
                } else {
                    if (n == B[i][i]) {
                        ci++;
                    }
                }
            }
        }
        if (ci == 16) {
            return ci;
        } else {
            return fil;
        }
    }
}
