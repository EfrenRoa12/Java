package Septima;

import java.util.Scanner;

public class _6inverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leer 5 numeros guardarlos en un arregloy mostrarlos en el orden inverso
		// introducido
		Scanner entrada = new Scanner(System.in);

		float numero[] = new float[5];

		System.out.println("guardando los datos del arreglo ");

		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + " digite un numero");
			numero[i] = entrada.nextFloat();
		}

		System.out.println("los elementos del arreglo en orde inverso son");

		for (int i = 4; i > 0; i--) {

			System.out.println(numero[5]);
			numero[i] = entrada.nextFloat();
		}
	}

}
