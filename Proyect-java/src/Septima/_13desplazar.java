package Septima;

import java.util.Scanner;

public class _13desplazar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// diseñar una aplicacion que declare una tabla de 10 elementos 	enteros
						//leer mediante el teclado 8 numeros 
						//despues se debe pedir un numero y una posicion insertarlo en la posicion indicada 
						//dezplazando los que esten detras
						
						Scanner entrada = new Scanner(System.in);
						int[] arreglo ={3,0,4,2,1,3};
						int numero = 0,posicion = 0;
						
						
						
						/////////*********///////*******CORRER UNA POSICION DETRAS DEL ARREGLO ********/////////********/////////
						for(int i=6;i>=posicion;i--) {
							arreglo[i+1] = arreglo[i];
						}
						arreglo[posicion] = numero;//insertamos el numero enla posicion requerida
						for(int i=0;i<7;i++) {
							System.out.println("posicion "+" "+arreglo[i]);
				}
	}

}
