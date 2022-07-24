package _2parametro_argumento;

import java.util.Scanner;

import JAVA_POO_UDEMY_1operacion.Operacion;

public class Operac {
	Scanner entrada = new Scanner(System.in);
	// ATRIBUTOS--globales
	
	int suma;
	int resta;
	int multiplicacion;
	int division;
	int resultado;

	// METODOS
	// EL METODO ES PEDIRLE AL USUARIO QUE NOS DIGITE 2 NUMEROS
	
	// METODO PARAMETRO ARGUMENTO--->en variables localos
	public void sumar(int numero1, int numero2) {
		suma = numero1 + numero2;
	}

	public void restar(int numero1, int numero2) {
		resta = numero1 - numero2;
	}

	public void multiplicarr(int numero1, int numero2) {
		multiplicacion = numero1 * numero2;
	}

	public void dividir(int numero1, int numero2) {
		division = numero1 / numero2;
	}
	// CREAMOS LA OPERACION DE RESULTADO
		public void mostrar_resultado() {
			System.out.println("la suma es: " + suma);
			System.out.println("la resta es: " + resta);
			System.out.println("la multiplicacion es: " + multiplicacion);
			System.out.println("la division es: " + division);
		}

}
