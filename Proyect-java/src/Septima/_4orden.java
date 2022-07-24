package Septima;

import java.util.Scanner;

public class _4orden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		// LEER 5 ELEMENTOS NUMERICOS QUE SE INTRODUCIRAN ORDENADOS DE FORMA CRECIENTE
		// ESTOS LOS GUARDAREMOS EN UNA TABLA DE TAMAÑO 10 LEER UN NUMERO N
		// E INSERTARLO EN EL LUGAR ADECUADO PARA QUE LA TABLA CONTINUE ORDENADO
		// CREAMOS EL ARREGLO DE 10 ELEMENTOS

		int arreglo[] = new int[10];
		boolean creciente = true;// los numeros deben esta ordenado al menos que se demuestren lo contrario
		int numero, sitio_numero = 0, j = 0;

		System.out.println("llenar el arreglo ");
		do {
			for (int i = 0; i < 5; i++) {
				System.out.print((i + 1) + " digite un numero");
				arreglo[i] = entrada.nextInt();
			}

			// comprovas si el arreglo esta ordenado en orden creciente
			for (int i = 0; i < 4; i++) {
				if (arreglo[i] < arreglo[i + 1]) {// creciente
					creciente = true;
				}

				if (arreglo[i] > arreglo[i + 1]) {
					creciente = false;
					break;// salimos delbucle para que no aga tantas vueltas
				}
			}

			if (creciente == false) {
				System.out.print("\n el arreglo no esta ordenado en forma creciente vuelva a digitar : \n");
			}

		} while (creciente == false);

		System.out.print(" digite un elemento a insertar: ");
		numero = entrada.nextInt();
		// en que posicion va el numero
		while (arreglo[j] < numero && j < 5) {
			sitio_numero++;// aumenta
			j++;// el iterador aumenta
		}

		// trasladamos una posicion del arreglo que van detras del numero
		for (int i = 4; i >= sitio_numero; i--) {
			arreglo[i + 1] = arreglo[i];
		}

		// insertamos el numero que puso el usuario
		arreglo[sitio_numero] = numero;
		System.out.print(" el arreglo queda: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(arreglo[i] + " - ");
		}
		System.out.println(" : ");
	}

}
