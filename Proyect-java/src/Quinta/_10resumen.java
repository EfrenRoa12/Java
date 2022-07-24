package Quinta;

import javax.swing.JOptionPane;

public class _10resumen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// una empresa que se dedica a la venta de desinfectantesnecesita un programa para gestionar las facturas 
		
				//en cada factura figura el codigo del articulo 
				//la cantidad vendida en litros y el precio por litro
				//se pide de 5 facturas introducidos 
				//factura total-----cantidad en litros vendidos del articulo1-----cuantas facturas se emitieron de mas de $600
				int codigo,litros,litroarticulo1=0,conteomas600=0;
				float preciolitro=0,importefactura,facturaciontotal=0;
				
				for(int i=1;i<5;i++) {
					do {
						codigo =Integer.parseInt(JOptionPane.showInputDialog("articulo N: "+i+" digite el codigo"));
					}while(codigo<1 || codigo>3);
					
					litros =Integer.parseInt(JOptionPane.showInputDialog("articulo N: "+i+" digite el articulo"));
					
					switch(codigo) {
					case 1: preciolitro=0.6f; break;
					case 2: preciolitro=3; break;
					case 3: preciolitro=1.25f; break;
					}
					
					importefactura = (float)litros*preciolitro;
					facturaciontotal+=importefactura;
					
					if(codigo==1) {
						litroarticulo1+=litros;
					}
					if(importefactura>600) {
						conteomas600++;
					}
				}
				System.out.println("resumen ventas ");
				System.out.println("facturacion total "+facturaciontotal);
				System.out.println("cantidad de litros vendidos en articulo 1: "+litroarticulo1);
				System.out.println("cantidad de facturas mayores  a $600 "+conteomas600);
				
			
	}

}
