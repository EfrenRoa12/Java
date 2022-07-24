package Septima;

import java.util.Scanner;

public class _8aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leer por teclado una serie de 10 numeros enteros
		// la aplicacion debe indicarnos si los numeros estan desordenados de forma
		// creciente
		// o si estan desordenados
		Scanner entrada = new Scanner(System.in);
		int[] arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };// CREAMOS EL ARREGLO DE 10 ELEMENTOS
		boolean creciente = false, decreciente = false;

		// sabemos cuales son los elementos del arreglo-----*****-----
		System.out.println("llenar el arreglo ");
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + " digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}

		System.out.println("llenar el arreglo ");
		for (int i = 0; i < 9; i++) {
			if (arreglo[i] < arreglo[i + 1]) {// forma creciente
				creciente = true;
			}
			if (arreglo[i] > arreglo[i + 1]) {// forma decreciente
				decreciente = true;
			}
		}

		if (creciente == true && decreciente == false) {
			System.out.println("el arreglo esta en forma creciente");
		} else if (creciente == false && decreciente == true) {
			System.out.println("el arreglo esta en forma decreciente");
		} else if (creciente == true && decreciente == true) {
			System.out.println("el arreglo esta en forma desordenado");
		} else if (creciente == false && decreciente == false) {
			System.out.println("todos los numeros del arreglo son iguales: ");
		}
	}

}
