package Septima;

import java.util.Scanner;

public class _12elemento {

	public static void main(String[] args) {
//	 	LEER 10 NUMEROS ENTEROS EN UNA TABLA 
			//GUARDAR EN OTRA TABLA LOS ELEMENTOS PARES DE LA PRIMERA 
			//Y A CONTINUACION LOS ELEMENTOS IMPARES
			Scanner entrada = new Scanner(System.in);
			
			int arreglo[] = new int[10];
			int conteo_par = 0,conteo_impar = 0;
			
			System.out.println("llenar el arreglo ");
			for(int i=0;i<10;i++) {
				System.out.print(i+" digite un numero: ");
				arreglo[i] = entrada.nextInt();
				if(arreglo[i] % 2==0) {
					conteo_par++;
				}
				else {
					conteo_impar++;
				}
			}
			//crear arreglo
			int par[] = new int[conteo_par];//almacena par
			int impar[] = new int[conteo_impar];//almacena impar
			
			conteo_par = 0;
			conteo_impar = 0;
			//almacenamos pares e impares
			for(int i=0;i<10;i++) {//iterador par e impar lo mismo para i
				if(arreglo[i] % 2==0) {
					par[conteo_par] = arreglo[i];
					conteo_par++;
				}
				else {//si el numero es impar
					impar[conteo_impar]=arreglo[i];
					conteo_impar++;
				}
			}
			System.out.println("\n arreglo pares ");
			for(int i=0;i<conteo_par;i++) {//iterador par e impar lo mismo para i
				System.out.println(par[i]+" - ");
				
				}
			System.out.println(" ");
			
			System.out.println("\n arreglo impares ");
			for(int i=0;i<conteo_impar;i++) {//iterador par e impar lo mismo para i
				System.out.println(impar[i]+" - ");
				
				}
			System.out.println(" ");
	}

}
