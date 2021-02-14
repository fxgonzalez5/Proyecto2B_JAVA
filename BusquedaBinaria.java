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
public class BusquedaBinaria {

    public static void main(String[] args) {
        /*Dise˜ne un algoritmo que reciba como datos de 
	entrada un número entero n, n números enteros, 
	que serán los elementos de un vector de tama˜no 
	n y un número entero x. Este algoritmo debe 
	regresar como dato de salida la posición 
	dentro del vector en la que se encuentra x. 
	Esta posición debe ser determinada usando el 
	método de búsqueda Binaria.
	Entrada: n = 6, A = [4, 2, 6, 3, 7, 2], x = 4.
	Salida: El número SI se encuentra en el arreglo.*/
        int n, aux, x, inferior, centro, superior;
        int[] A;
        boolean band = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("--Programa Para Encontrar La Posición De Un Número En Método Binario---");
        System.out.print("Ingrese el límite del vector: ");
        n = sc.nextInt();
        A = new int[n];
        System.out.print("Ingrese el número que desea buscar: ");
        x = sc.nextInt();
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
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if (A[j] > A[j + 1]) {
                    aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
            }
        }
        System.out.print("Vector Ordenado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        inferior = 0; superior = n - 1;
        while (inferior <= superior && band == false) {
            centro = (superior + inferior) / 2;
            if (A[centro] == x) {
                System.out.println("El número buscado está en la posición " + centro);
                band = true;
            } else {
                if (x > A[centro]) {
                    inferior = centro + 1;
                } else {
                    superior = centro - 1;
                }
            }
        }
        if (band == false) {
            System.out.println("El número " + x + " no se encuentra en el vector.");
        }
    }
}
