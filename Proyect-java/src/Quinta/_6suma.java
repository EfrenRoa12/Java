package Quinta;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _6suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pedir numeros hasta que se teclee un cero mostrar la suma de todos los numeros introducidos
				Scanner entrada = new Scanner(System.in);
				int numero,suma=0;
				
				do {
					numero =Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));
					
					suma += numero;//suma iterativa
				}while(numero != 0);
				System.out.println("la suma es...."+suma);
	}

}
