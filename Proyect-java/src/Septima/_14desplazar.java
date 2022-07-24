package Septima;

import java.util.Scanner;

public class _14desplazar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CREAR UN PROGRAMA QUE LEA POR TECLADO UNA TABLA DE 10 NUMEROS ENTEROS
		// Y LA DEZPLACE UNA POSICION HACIA ABAJO
		// EL PRIMERO PASA A SER EL SEGUNDO EL SEGUNDO PASA A SER EL TERCEROY
		// SUCESIVAMENTE
		// EL ULTIMO PASA A SER EL PRIMERO
		Scanner entrada = new Scanner(System.in);
		int[] arreglo = new int[10];
		int ultimo, posicion;

		System.out.println("llenar el arreglo ");
		for (int i = 0; i < 8; i++) {
			System.out.print((i + 1) + " digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		ultimo = arreglo[9];// guardamos el ultimo elemento del arreglo
		for (int i = 8; i >= 0; i--) {
			arreglo[i + 1] = arreglo[i + 1];
			arreglo[0] = ultimo;// ponemos el ultimo elementocomo primero
			System.out.println("el nuevo arreglo es ");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "numero: " + arreglo[i]);
		}
	}

}
