package Sexta;

import javax.swing.JOptionPane;

public class _8medida_positivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pedir 10 numeros mostrar la media de los numeros positivos
				//la media de los numeros negativos y la cantidad de ceros
				int numero,suma_pos=0,conteo_pos=0,suma_neg=0,conteo_neg=0,conteo_ceros=0;
				float media_pos,media_neg;
				
				for(int i=1;i<=10;i++) {
					numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
					if(numero==0) {//si el numero es 0
						conteo_ceros++;//aumentamos el 1 el conteo de 0
					}
					else if(numero>0) {//si el numero es positivo
						suma_pos += numero;//suma iterativa de positivos
						conteo_pos++;
						
					}
					else {//si el numero es negativo 
						suma_neg += numero;
						conteo_neg++;
						
					}
				}
				//tratamos con los positivos
				if(conteo_pos == 0) {
					System.out.println("no se puede sacar la media de los positivos ");
				}
				else {
					media_pos = (float)suma_pos/conteo_pos;
					System.out.println("la media de los positivos "+media_pos);
				}
				//tratamos con los negativos
				if(conteo_neg == 0) {
					System.out.println("no se puede sacar la media de los negativos ");
				}
				else {
					media_neg = (float)suma_neg/conteo_neg;
					System.out.println("la media de los negativos es "+media_neg);
				}
				
				System.out.println("la cantidad de 0 es: "+conteo_ceros);
	}

}
