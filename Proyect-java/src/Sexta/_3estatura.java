package Sexta;

import javax.swing.JOptionPane;

public class _3estatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dadas las edades y alturas de alumnos mostrar la edad y la estatura media la
				//cantidad de alumnos mayores de 18 años y la cantidad de alumnos que miden mas de 1.75
				
				int edad,sumaedad=0,conteomayor18=0,contadormayor175=0;
				float altura,sumaaltura=0,mediaedad=0,mediaaltura=0;
				
				for(int i=0;i<=5;i++) {
					edad = Integer.parseInt(JOptionPane.showInputDialog("alumno: "+i+" digite su edad"));
					altura =Float.parseFloat(JOptionPane.showInputDialog("alumno: "+i+" digite su altura"));
					
					sumaedad +=edad;	
					sumaaltura+=altura;
					
					if(edad>18) {
						conteomayor18++;//si la edad es mayor de 18 es 
					}
					if(altura > 1.75) {
						contadormayor175++;
					}
				}
				
				mediaedad = (float)  sumaedad/5;
				mediaaltura = (float) sumaaltura/5;
				System.out.println("edad promedio es: "+mediaedad);
				System.out.println("estatura promedio es: "+mediaaltura);
				System.out.println("cantidad de alumnos mayores a 18 es : "+conteomayor18);
				System.out.println("edcantidad de alumnos que mide mas de 1.75: "+contadormayor175);
	}

}
