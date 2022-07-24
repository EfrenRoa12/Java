package Arrys;

import java.util.Scanner;

public class _2llenarArreglo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// declaramos la variable
		int Nelementos;
		System.out.println("digite la cantidad de elementos del arreglo: ");//pedimso el usuario
		Nelementos = entrada.nextInt();
		
		//funcion a digitar elementos
		char[] letras = new char[Nelementos];
		System.out.println("digite la elementos de elementos del arreglo: ");//vamos a llenar los elementos
		for(int i=0; i<Nelementos;i++) {
			System.out.println((i+1)+". digite un caracter: ");//i+1 comienza desde 1
			letras[i]= entrada.next().charAt(0);
		}
		
		//imprime
		System.out.println("los caracteres del arreglo son: ");
		for(int i=0; i<Nelementos;i++) {
			System.out.println(letras[i]+" ");//

		}
		
	}

}
