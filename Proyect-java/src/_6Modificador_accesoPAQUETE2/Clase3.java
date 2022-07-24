package _6Modificador_accesoPAQUETE2;

import _6Modificador_accesoPAQUETE1.Clase1;

public class Clase3 {
public static void main(String[] args) {
	Clase1 objeto1 = new Clase1();
	//LO IMPRIME
	
	//SI LE COLOCAMOS EL MODIFICADOR DE ACCESO Publico---> si lo ponemos en private muestra error----acceden clases de mismo paquete 
	//si lo colocamos como public bien protected mal private mal
	objeto1.atributo1 = 10;
	//
	}
}
