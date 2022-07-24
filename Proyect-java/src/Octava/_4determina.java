package Octava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _4determina {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//crear y cargar una matriz de tamaño n *m y decir si es simetrica o no
		//simetricas es = a numero de fila y numero de coumna ejemplo 4*4
		boolean simetrica = true;
		int matriz [][],fila,columna;
		fila =Integer.parseInt(JOptionPane.showInputDialog(null,"digite el numero de filas"));
		columna =Integer.parseInt(JOptionPane.showInputDialog(null,"digite el numero de columna"));
		
		
		
		matriz = new int [fila][columna];
		//elementod de la  matriz fundamental--------------
		System.out.println("digite la matriz:");
		for(int i=0;i<fila;i++) { //numero de filas
			for(int j=0;j<columna;j++) { //numero de- columnas
				System.out.print("matriz ["+i+"]["+j+"]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		//simetrica o no
		if(fila == columna) {
			int i,j;
			i=0;
			while(i<fila && simetrica==true) {
				j=0;
				while(j<i&& simetrica==true) {
					if(matriz [i][j] != matriz [j][i]) {
						simetrica = false;
					}
					j++;
				}
				j++;
			}
			if(simetrica == true) {
				JOptionPane.showMessageDialog(null, "la matriz es simetrica");
			}
			else {
				JOptionPane.showMessageDialog(null, "la matriz no es simetrica");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "la matrizn es simetrica");
		}
	}

}
