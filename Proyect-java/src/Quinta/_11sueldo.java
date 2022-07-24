package Quinta;

import javax.swing.JOptionPane;

public class _11sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tpedir 10 sueldos mostrar su suma y cuantos hay mayores de 1000
				float sueldo=0,suma=0;
				int contador=0;
				
				for(int i=1;i<=10;i++) {
					sueldo =Float.parseFloat(JOptionPane.showInputDialog("digite su sueldo: "));
					if(sueldo>100) {//si elsueldo supera a 1000
						contador++;//aumentamos 1 a contador
					}
					suma += sueldo;//suma iterativa de sueldo
				}
				System.out.println("la suma de todos los sueldoa es:"+suma);
				System.out.println("la cantidad de sueldos  mayores a 1000 es:"+contador);
			
	}

}
