package Tercero;

import java.util.Scanner;

public class _6mil_horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// construir un programa que dado un numero total de horas devuelve el numero de
		// semanas dias horas equivalentes
		// por ejemplo dado un total 1000 horas equivalentes debe mostrar 5 semanas 6
		// dias 16 horas
		Scanner entrada = new Scanner(System.in);

		int horas_totales, semanas, dias, horas;

		System.out.println("digite el numero de horas: ");
		horas_totales = entrada.nextInt();

		semanas = horas_totales / 168;
		dias = horas_totales % 168 / 24;
		horas = horas_totales % 24;

		System.out.println("del resultado es: ");
		System.out.println("semanas: " + semanas);
		System.out.println("dias: " + dias);
		System.out.println("horas: " + horas);
	}

}
