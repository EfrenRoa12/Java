import java.util.Scanner;

import javax.swing.JOptionPane;

public class _10descuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// <EN MEGA PLAZA SE HACE UN 20 %DEDESCUENTO A LOS CLIENTES CUYA COMPRA SUPERE LOS 300 
			//¿CUAL SERA LA CANTIAD QUE PAGARA UNA PERSONA POR SU COMPRA
			Scanner entrada = new Scanner(System.in);
			
			float precio_compra,descuento;
			
			precio_compra = Float.parseFloat(JOptionPane.showInputDialog("digite el precio: "));
			
			if(precio_compra > 300) {
				descuento = precio_compra * 0.20f;
				precio_compra -= descuento;
				
				JOptionPane.showMessageDialog(null, "el precio de compra es: "+precio_compra);
			}
			else {
				JOptionPane.showMessageDialog(null, "el precio de compra es: "+precio_compra);
			
			}}

}
