package Practica4Encapsulamiento;

public class Celular {
	// CREAMOS LOS ATRIBUTOS DEL CELULAR
	String nombre;
	String marcaa;
	String pais;
	String modelo;
	String tipo;

	// CREAMOS EL CONSTRUCTOR POR DEFAULT
	public Celular() {

	}

	// CREAMOS EL CONSTRUCTOR CON PARAMETROS
	public Celular(String nombre, String marcaa, String pais, String modelo, String tipo) {
		this.nombre = nombre;
		this.marcaa = marcaa;
		this.pais = pais;
		this.modelo = modelo;
		this.tipo = tipo;
	}

	// CREAMOS EL METODO ACCESOR GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarcaa() {
		return marcaa;
	}

	public void setMarcaa(String marcaa) {
		this.marcaa = marcaa;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
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

}
