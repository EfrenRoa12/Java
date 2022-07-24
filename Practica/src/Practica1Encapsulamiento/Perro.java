package Practica1Encapsulamiento;

public class Perro {
	// ATRIBUTOS
	String nombre;
	String color;
	String raza;
	int edad;

	//CREAMOS EL METODO CONSTRUCTOR VACIO--es por default
	public Perro() {
		
	}
	// CREAMOS LOS METODOS ACCESORES GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	

}
