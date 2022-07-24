package Practica10Lista;

public class Auto {
	// ATRIBUTO
	String marca;
	String modelo;
	String color;
	int anio;

	// CONSTRUCTOR POR DEFAULT
	public Auto() {

	}

	// CONSTRUCTOR CON PARAMETROS
	public Auto(String marca, String modelo, String color, int anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
	}

	// TO STRING ES PARA IMPRIMIRLO EN CADENA LOS ATRIBUTOS Y LO BUSCAMOS DESDE
	// PRINCIPAL FACILMENTE
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anio=" + anio + "]";
	}

	// METODO SETER-ESTABLECER Y GETER-OBTIENE
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
