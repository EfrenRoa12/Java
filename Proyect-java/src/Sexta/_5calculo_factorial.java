package Sexta;

import javax.swing.JOptionPane;

public class _5calculo_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pedir un numero y calcular su 
				int numero;
				long factorial =1;
				
				numero =Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));
				
				for(int i=1;i<=numero;i++) {
					factorial*=i;
				}
				
				System.out.println("el numero es: "+numero+" es "+factorial);
	}

}
