package Practica2Encapsulamiento;

public class Auto {
	// ATRIBUTO
	String nombre;
	String marca;
	int modelo;

	// CONSTRUCTOR POR DEFAULT
	public Auto() {

	}

	// CONSTRUCTOR CON PARAMETROS
	public Auto(String nombre, String marca, int modelo) {
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
	}

	// CREAMOS LOS METODOS QUE ESTABLECEMOS Y OBTENEMOS--METODOS ACCESORES
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

}
