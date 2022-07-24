package Septima;

import java.util.Scanner;

public class _7promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LEER 5 NUMEROS POR TECLADO ALMACENARLOS EN UN ARREGLO
		// Y A CONTINUACION REALIZAR LA MEDIDA DE LOS NUMEROS POSITIVOS
		// LA MEDIDA DE LOS NEGATIVOS Y CONTAR EL NUMERO DE CEROS

		Scanner entrada = new Scanner(System.in);
		float[] numero = new float[5];

		float suma_positivo = 0, suma_nega = 0, media, median;
		int conteo_pos = 0, conteo_neg = 0, conteo_cero = 0;

		System.out.println("guardando los numeros del arreglo ");
		// PIDE LOS DATOS DEL CONDICIONAL BUCLE
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + " digite un numero:");
			numero[i] = entrada.nextFloat();
			// SUMA DE LOS
			// NUMEROS*************************************************************************************************
			if (numero[i] == 0) {// si el numero digitado == aumenta en 1
				conteo_cero++;
			} else if (numero[i] > 0) {
				suma_positivo += numero[i];
				conteo_pos++;
			} else {
				suma_nega += numero[i];
				conteo_neg++;
			}
		}
		// SE REALIZA LA OPERACION LA MEDIA DE LOS POSITIVOS
		if (conteo_pos == 0) {
			System.out.println("no se puede sacar los cnteos de los positivos");
		} else {
			media = suma_positivo / conteo_pos;
			System.out.println("la media de los numeros positivos es: " + media);
		}
		// SE REALIZA LA OPERACION LA MEDIA DE LOS NEGATIVOS
		if (conteo_pos == 0) {
			System.out.println("no se puede sacar los conteos de los negativos");
		} else {
			median = suma_nega / conteo_neg;
			System.out.println("la media de los numeros positivos es: " + median);
		}
	}

}
