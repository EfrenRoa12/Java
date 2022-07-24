package Practica9LLista;

public class Celular {
	
	// ATRIBUTOS
	String marca;
	String modelo;
	String tipo;
	int anio_lanzamiento;

	// CONSTRUCTOR POR DEFAULT
	public Celular() {

	}

	// METODO CONSTRUCTOR CON PARAMMETORS
	public Celular(String marca, String modelo, String tipo, int anio_lanzamiento) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.anio_lanzamiento = anio_lanzamiento;
	}

	// TO STRING LOS CONVIERTE EN CADENA Y EN CLASE PRINCIPAL LOS IMPRIME DE MANERA
	// SENCILLA
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", anio_lanzamiento="
				+ anio_lanzamiento + "]";
	}

	// GETTET Y SETTER
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAnio_lanzamiento() {
		return anio_lanzamiento;
	}

	public void setAnio_lanzamiento(int anio_lanzamiento) {
		this.anio_lanzamiento = anio_lanzamiento;
	}

}
