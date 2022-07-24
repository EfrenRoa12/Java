package Sexta;

import javax.swing.JOptionPane;

public class _7medidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pide un numero
				//que debe mostrar entre 0 y 10
				//mostrar la tabla de mulltiplicar de dicho numero
				int numero;
				//ES EL MENU DE SELECCION DE NUMEROS
				do {
				numero =Integer.parseInt(JOptionPane.showInputDialog("digite un elemento para ver multipliicacion de 1-10: "));
				}while(numero<0||numero>10);//si el numero es menor a 0 se repite el numero los mismo el numero mayor a 10
				
				//OPERACION MATEMATICA
				System.out.println("la tabla de multiplicar del numero es: "+numero);
				for(int i=1;i<12;i++) {
					System.out.println(numero+" * "+" "+numero*i);//se hace la multiplicacion
				}
	}

}
