package Quinta;

import javax.swing.JOptionPane;

public class _9promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pedir numeros hasta que se introduzca uno negativo y calcular la medida
				int numero,elemento=0,suma=0;
				float media;
				
				numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
				
				while(numero>=0) {
					
					suma = suma + numero; //suma iterativa
					elemento++;// aumentamos 1 a elementos
					
					numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero: "));
					
					
				}
				
				if(elemento==0) {//
					System.out.println("error la division entre 0 no existe ");
				}
				else {
					media = (float)suma/elemento;
					System.out.println("la media el promedio es: "+media);
				}
	}

}
