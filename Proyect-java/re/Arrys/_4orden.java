package Arrys;

import java.util.Scanner;

public class _4orden {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// leer 5 numeros guardarlos en un arreglo y mostrarlos en el mismo orden
		float numeros[] = new float[5];//inicializamos
		
		System.out.println("guardando los arreglo: ");//pedimso el usuario
		for(int i=0; i<5;i++) {
			System.out.print((i+1)+". digite un numero: ");//i+1 comienza desde 1
			numeros[i] = entrada.nextFloat();
		}
		
		//imprime
		System.out.println("los elemento del arreglo son: ");
		for(float i: numeros) {//nos cuenta automaticamente todo
			System.out.println(i+" ");//muestra todo
		
		
		
		
		
		}
		
	}

}
