package Septima;

import java.util.Scanner;

public class _17eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// LEER POR TECLADO  UNATABLA DE 10 ELEMENTOS NUMERICOS ENTEROS
		//Y UNA POSICION ENTRE 0 Y 9
		//ELIMINAR EL ELEMENTO SITUADO EN LA POSICION DADA SIN DEJAR HUECOS
		
		int arreglo[] = new int[10];
		int posicion=0;
		
		System.out.println("guardando los datos del arreglo ");
		for(int i=0;i<10;i++) {
			System.out.print(i+" digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		//rango de 0 a 9
		do {
				System.out.print(" digite una posicion entre (0-9)");
				posicion = entrada.nextInt();	
			}while(posicion < 0 || posicion > 9);
			
			
			//eliminando
			for(int i=posicion;i<9;i++) {
				arreglo[i] = arreglo[i+1];
				}
			
			
			System.out.print("\n el arreglo queda asi ");
			for(int i=0;i<9;i++) {
				System.out.println(i+" el elemento "+arreglo[i]);
				}
	}

}
