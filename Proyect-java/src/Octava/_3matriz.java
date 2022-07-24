package Octava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _3matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
		
		int matriz [][],fila,columna;
		
		fila =Integer.parseInt(JOptionPane.showInputDialog(null,"digite el numero de filas"));
		columna =Integer.parseInt(JOptionPane.showInputDialog(null,"digite el numero de columna"));
		
		matriz = new int [fila][columna];
		
		System.out.println("digite la matriz:");
		for(int i=0;i<fila;i++) { //numero de filas
			for(int j=0;j<columna;j++) { //numero de- columnas
				System.out.print("matriz ["+i+"]["+j+"]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("la matriz es: ");
		for(int i=0;i<fila;i++) { //numero de filas
			for(int j=0;j<columna;j++) { //numero de columnas
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}

}
