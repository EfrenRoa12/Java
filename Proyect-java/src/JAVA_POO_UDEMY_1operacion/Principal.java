package JAVA_POO_UDEMY_1operacion;

import java.util.Scanner;

import JAVA_POO_UDEMY.Conceptos;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Operacion operacion = new Operacion();
		// utilizaremos la operacion---nos muestra en consola y digitamos los datoa
		operacion.leerNumeros();
		operacion.sumar();
		operacion.restar();
		operacion.dividir();
		operacion.mostrar_resultado();

	}

}
