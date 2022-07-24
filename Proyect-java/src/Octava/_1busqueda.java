package Octava;

import javax.swing.JOptionPane;

public class _1busqueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// busqueda binaria
				int arreglo[]= {1,2,3,4,5};		
				int dato,inferior,superior,mitad,i;
				boolean bandera = false;
				dato = Integer.parseInt(JOptionPane.showInputDialog("digite el numero a buscar: "));
				
				//busqueda binaria
				inferior =0;
				superior =5;
				i=0;
				
				mitad = (inferior+superior)/2;
				while(inferior<=superior&&i<5) {
					if(arreglo[mitad]==dato) {
						bandera=true;
						break;
					}
					if(arreglo[mitad]>dato) {
						superior=mitad;
						mitad = (inferior+superior)/2;
						
					}
					if(arreglo[mitad]<dato) {
						inferior = mitad;
						mitad = (inferior+superior)/2;
					}
					i++;
				}
				if(bandera == true) {
					JOptionPane.showMessageDialog(null, "el numero ha sido encontrado en la posicion : "+mitad);
				}
				else {
					JOptionPane.showMessageDialog(null, "el numero no ha sido encontrado en la posicion : ");
				}
	}

}
