package Entidad;

public class Paises {
	String nombre;
	String capital;
	String tradicion;
	Continente continente;

	public Paises() {

	}

	public Paises(String nombre) {
		this.nombre = nombre;
	}

	public Paises(String nombre, String capital, String tradicion, Continente continente) {
		this.nombre = nombre;
		this.capital = capital;
		this.tradicion = tradicion;
		this.continente = continente;
	}

	@Override
	public String toString() {
		return "Paises [nombre=" + nombre + ", capital=" + capital + ", tradición=" + tradicion + ", continente="
				+ continente + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getTradicion() {
		return tradicion;
	}

	public void setTradicion(String tradicion) {
		this.tradicion = tradicion;
	}

	public Continente getContinente() {
		return continente;
	}

	public void setContinente(Continente continente) {
		this.continente = continente;
	}

}
