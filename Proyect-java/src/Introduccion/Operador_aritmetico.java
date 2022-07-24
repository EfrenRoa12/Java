package Introduccion;

import java.util.Scanner;

public class Operador_aritmetico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float numero1, numero2, suma, resta, multiplicacion, division, residuo;

		System.out.println("digite un numero");
		numero1 = entrada.nextFloat();

		System.out.println("digite otro numero");
		numero2 = entrada.nextFloat();

		suma = numero1 + numero2;

		resta = numero1 - numero2;

		multiplicacion = numero1 * numero2;

		division = numero1 / numero2;

		residuo = numero1 % numero2;

		System.out.println("el resultado de la suma es " + suma);
		System.out.println("el resultado de la resta es " + resta);
		System.out.println("el resultado de la multiplicacion es " + multiplicacion);
		System.out.println("el resultado de la division es " + division);
		System.out.println("el resultado de la residuio es " + residuo);

	}

}
