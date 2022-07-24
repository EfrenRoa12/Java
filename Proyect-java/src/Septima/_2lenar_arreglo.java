package Septima;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _2lenar_arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// llenar arreglo
		int elemento;

		elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "digite la cantidad de elementos"));

		char[] letra = new char[elemento];

		System.out.println(" Digite los elementos del arreglo: ");
		for (int i = 0; i <= elemento; i++) {
			System.out.print((i + 1) + " digite un caracter ");// SEUTILIZA I + 1 PARA NO EMPEZAR DE 0 SI NO APARTIR DE
																// 1
			letra[i] = entrada.next().charAt(0);
		}

		System.out.println(" los caracteres del arreglo son: ");
		for (int i = 0; i < elemento; i++) {
			System.out.print(letra[i] + " ");
		}
	}

}
