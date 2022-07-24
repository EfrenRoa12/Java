package Practica7ECRUD;

public class Auto {
	// ATRIBUTOS
	String marca;
	String color;
	int km;
	int anio;

	// ESTABLECEMOS EL CONSTRUCTOR VACIO POR DEFAULT
	public Auto() {

	}

	// ESTABLECEMOS EL SETT Y GETT PARA OBTENER EL VALOR
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
