package Sexta;

import javax.swing.JOptionPane;

public class _6no_mostrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pedir un numero N y mostrar todo los numeros de 1 al N
				int numero,i;
				numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
				
				i = 1;
				while(i<=numero) {
					System.out.println(i);
					i++;
					
					
				}
	}

}
