package _4constructor;

public class Persona {
	//ATRIBUTOS
	String nombre;
	int edad;
	//METODO CONSTRUCTOR---LE PASAMOS LOS PARAMETROS
	public Persona(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	//METODO DE MOSTRAR LOS DATOS---LO MOSTRAMOS EN PRINCIPAL DONDE LO ENVIAMOS PARA QUEEJECUTE
	public void mostrarDatos() {
		System.out.println("el nombre es: "+nombre+" \nla edad es: "+edad);
	}
	
}
