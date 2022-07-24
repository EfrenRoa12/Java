package Tercero;

import java.util.Scanner;

public class _2salario_vendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UNA COMPANI DE VENTA DE CARRO USADOS PAGA A SU PERSONAL DE VENTAS UN SALARIO
		// DE $ 1000MENSUALES
		// MAS UNA COMISION DE $150POR CADA CARRO VENDIDO MAS EL 5%DEL VALOR DE LA VENTA
		// POR CARRO
		// CADA MES EL CAPTURISTA DE LA EMPRESA INGRESA EN LA COMPUTADORA LOS DATOS
		// PERTINENTES
		// HACER UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO MENSUAL DE UN VENDEDOR DE
		// CARRO
		Scanner entrada = new Scanner(System.in);

		final int salario = 1000;
		int numero_carros_vendido;
		float precio_carro, salario_total;

		System.out.println("digite el total de carros vendidos: ");
		numero_carros_vendido = entrada.nextInt();

		System.out.println("digite el coste del carro: ");
		precio_carro = entrada.nextFloat();

		salario_total = salario + (numero_carros_vendido * 150) + (0.05f * precio_carro * numero_carros_vendido);

		System.out.println("el salario del empleado es: " + salario_total);
	}

}
