package Quinta;

import javax.swing.JOptionPane;

public class _12aprobados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dadas 6 notas escribir la cantidad de alumnos 
				//aprobados condicionados (=4) y suspensos
				float nota;
				int aprobado=0,condicionado=0,suspenso=0;
				
				for(int i=1;i<=6;i++) {
					do {
						nota = Float.parseFloat(JOptionPane.showInputDialog("digite una nota entre 0 a 10: "));
					}while(nota<0 || nota>10);//la nota esta en el intervalo de 0 a 10
					
					if(nota==4) {
						condicionado++;
					}
					else if(nota>=5) {
						aprobado++;
					}
					else {
						suspenso++;
					}
					
				}
				System.out.println("cantidad de aprobados: "+aprobado);
				System.out.println("cantidad de condicionado: "+condicionado);
				System.out.println("cantidad de reprobados: "+suspenso);
	}

}
