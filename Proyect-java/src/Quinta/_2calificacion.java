package Quinta;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _2calificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner entrada = new Scanner(System.in);
				
				int nota;
				nota = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero: "));
				
				switch(nota) {
				
				case 0:
				case 1:
				case 2:
				case 3:
				case 4: JOptionPane.showMessageDialog(null, "insuficiente: "); break;
				case 5: JOptionPane.showMessageDialog(null, "suficiente: "); break;
				case 6: JOptionPane.showMessageDialog(null, "bien: "); break;
				case 7: JOptionPane.showMessageDialog(null, "muy bien: "); break;
				case 8: JOptionPane.showMessageDialog(null, " notable: "); break;
				case 9: JOptionPane.showMessageDialog(null, "excelente: "); break;
				case 10: JOptionPane.showMessageDialog(null, "super: "); break;
				
				default : 	JOptionPane.showMessageDialog(null, "la operacion no existe: ");
					
					
				}
	}

}
