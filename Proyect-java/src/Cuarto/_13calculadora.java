package Cuarto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _13calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatrooperaciones aritmeticas 
				//suma resta multiplicacion division con los valores enteros 
				//el usuario debe especificar con el caracter parametro de linea de comandos 
				//s suma r resta p multiplicacion d division
				Scanner entrada = new Scanner(System.in);
				int numero1,numero2,suma,resta,multiplicacion,division;
				int operacion;
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero: "));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero: "));
				
				operacion = JOptionPane.showInputDialog("seleccione la operacion a realizar: ").charAt(0);
				
				switch(operacion) {
				case 's':
				case 'S': suma = numero1 + numero2;
					JOptionPane.showMessageDialog(null, "la suma es: "+suma);
					break;
				case 'r':
				case 'R': resta = numero1 - numero2;
					JOptionPane.showMessageDialog(null, "la resta es: "+resta);
					break;	
				case 'm':
				case 'M': multiplicacion = numero1 * numero2;
					JOptionPane.showMessageDialog(null, "la multiplicacion es: "+multiplicacion);
					break;	
				case 'd':
				case 'D': division = numero1 / numero2;
					JOptionPane.showMessageDialog(null, "la division es: "+division);
					break;	
				default : 	JOptionPane.showMessageDialog(null, "la operacion no existe: ");
					
					
				}
	}

}
