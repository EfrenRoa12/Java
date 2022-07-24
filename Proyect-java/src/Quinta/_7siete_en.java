package Quinta;

import javax.swing.JOptionPane;

public class _7siete_en {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ESCRIBIR TODOS LOS NUMEROS DELL 100 AL DE 7 EN 7
				int numero,i;
				numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
				
				i = 1;
				while(i<=numero) {
					System.out.println(i);
					i+=7;
					
					
				}
	}

}
