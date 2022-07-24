package Entidad;

public class Disco {
	// ATRIBUTOS
	//PROFESOR DISCO
	String titulo_disco;
	int anio;
	int num_pistas;
//titulo_disco--anio--num_pista
	// METODO CONSTRUCTOR VACIO
	public Disco() {

	}

	// CONSTRUCTOR CON titulo_disco
	public Disco(String titulo_disco) {
		this.titulo_disco = titulo_disco;
	}

	// CONSTRUCTOR CON PARAMETROS
	public Disco(String titulo_disco, int anio, int num_pistas) {
		this.titulo_disco = titulo_disco;
		this.anio = anio;
		this.num_pistas = num_pistas;
	}
	// CONSTRUCTOR ToString

	@Override
	public String toString() {
		return "Disco [titulo_disco=" + titulo_disco + ", anio=" + anio + ", num_pistas=" + num_pistas + "]\n";
	}
	// METODO GETTER Y SETTER

	public String getTitulo_disco() {
		return titulo_disco;
	}

	public void setTitulo_disco(String titulo_disco) {
		this.titulo_disco = titulo_disco;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getNum_pistas() {
		return num_pistas;
	}

	public void setNum_pistas(int num_pistas) {
		this.num_pistas = num_pistas;
	}

}
