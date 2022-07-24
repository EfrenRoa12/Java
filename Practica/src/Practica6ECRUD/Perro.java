package Practica6ECRUD;

public class Perro {
	// CREAMOS LOS ATRIBUTOS
	String nombre;
	int edad;
	String color;
	int peso;

	// CREAMOS CONSTRUCTOR POR DEFAULT
	public Perro() {

	}

	// CREAMOS EL METODO SETTERY GETTER PARA ESTABLECER EL VALOR Y PARA TOMAR EL
	// VALOR
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
