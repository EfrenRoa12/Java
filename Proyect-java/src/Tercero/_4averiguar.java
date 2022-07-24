package Tercero;

import java.util.Scanner;

public class _4averiguar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// GUILLERMO TIENE N CANTIDAD DE DOLARES , LUIS TIENE LA MITAD DE DE LO QUE
		// POSEE GUILLERMO,
		// JUAN TIENE LA MITAD DE LO QUE POSEEN LUIS Y GUILLERMO JUNTOS
		// HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CANTIDAD DE DINERO QUE TIENE ENTRE
		// LOS TRES NUMEROS
		Scanner entrada = new Scanner(System.in);

		float guillermo, luis, juan, total;

		System.out.println("digite la cantidad de dinero que tiene guillermo");
		guillermo = entrada.nextFloat();

		luis = guillermo / 2;// luis tiene la mitad de guillermo
		juan = (guillermo + luis) / 2;

		total = guillermo + luis + juan;

		System.out.println("la cantidad de dinero entre los tres es: " + total);
	}

}
