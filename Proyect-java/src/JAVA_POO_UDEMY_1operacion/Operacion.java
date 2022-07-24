package JAVA_POO_UDEMY_1operacion;

import java.util.Scanner;

public class Operacion {
	Scanner entrada = new Scanner(System.in);
	// ATRIBUTOS
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	int resultado;

	// METODOS
	// EL METODO ES PEDIRLE AL USUARIO QUE NOS DIGITE 2 NUMEROS
	public void leerNumeros() {
		System.out.println("digite un numero: ");
		numero1 = entrada.nextInt();
		System.out.println("digite otro numero: ");
		numero2 = entrada.nextInt();
	}

	// METODO OPERACIONES AMBIOS NUMEROS
	public void sumar() {
		suma = numero1 + numero2;
	}

	public void restar() {
		resta = numero1 - numero2;
	}

	public void multiplicarr() {
		multiplicacion = numero1 * numero2;
	}

	public void dividir() {
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
