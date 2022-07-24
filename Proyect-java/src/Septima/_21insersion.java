package Septima;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _21insersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//un numero pasa al otro numero
		//ordena el numero de menor a ayor 
		
			
		Scanner entrada = new Scanner (System.in);
			
		int arreglo[] ,elemento,aux;
		
		elemento = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad del numero de elemenos "));
			
		arreglo = new int [elemento];//le asignamos el numero de elementos de del arreglo
		
		for(int i=0;i<elemento;i++) {
			System.out.print((i+1)+"digite un numero:");
			arreglo[i] = entrada.nextInt();
		}
		//UTILIZAREMOS EL METODO BURBUJA
		
		for(int i=0;i<(elemento-1);i++) {
			for(int j=0;j<(elemento-1);j++) {
				if(arreglo[j]>arreglo[j+1]) {//si numero actual > numero siguiente
					aux = arreglo [j];
					arreglo[j] = arreglo[j+1];
					arreglo [j+1] = aux;
					
					
				}
			}
			
		}//----------------------------------------TAMBIEN SE PUEDE HACER DE FORMA EN SIXXA DE DOS EN DOS
		
		//MOSTRAR EL ARREGLO DE FORMA CRECIENTE 
		System.out.print("arreglo ordenado en forma creciente:");
		
		for(int i=0;i<elemento;i++) {
			System.out.println(arreglo[i]+" ");
		}
		//ARREGLO DE FORMA DECRECIETE 
		System.out.println("arreglo ordenado en forma decreciente: ");
		for(int i=(elemento-1);i>0;i--) {
			System.out.println(arreglo[i]+" ");
			}
		System.out.println(" ");
	}

}
