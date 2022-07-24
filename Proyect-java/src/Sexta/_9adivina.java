package Sexta;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _9adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// REALIZAR UN JUEGO PARA PARA ADIVINAR UN NUMERO PARA ELLO GENERAR UN NUMERO ALEATORIO ENTRE 0-100
		//Y LUEGO IR PIDIENDO NUMEROS INDICANDO ES MAYOR O ES MENOR SEGUN SEA MAYOR O MENOR RESPECTO A LA N
		//EL PROCESO TERMINA CUANDO EL USUARIO ACIERTA Y MOSTRAR EL NUMERO DE INTENTOS
		
		int numero,aleatorio,contador=0;
		
		aleatorio = (int) (Math.random()*100);//genera un numero aleatorio entre 0-100
		
		do {
			numero =Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));
			
			if(aleatorio>numero) {
				System.out.println("digite un numero mayor");
			}
			else {
				System.out.println("digite un numero menor");
			}
			contador++;//aumenta en uno el contador
			
		}while(numero != aleatorio);
		System.out.println("yea adivinaste el numero");
	}

}
