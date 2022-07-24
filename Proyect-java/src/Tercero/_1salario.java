package Tercero;

import java.util.Scanner;

public class _1salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * hacer un programa que calcule e imprima el salario semanal de un empleado a
		 * partir de sus horas semanales trabajadas y de su salario por hoora
		 */
		Scanner entrada = new Scanner(System.in);

		int hora_semanal;
		float salario_hora, salario_total;

		System.out.println("digite las horas semanales trabajadas: ");
		hora_semanal = entrada.nextInt();

		System.out.println("digite el salario por dia: ");
		salario_hora = entrada.nextFloat();

		salario_total = hora_semanal * salario_hora;

		System.out.println("el salario semanal es: " + salario_total);
	}

}
