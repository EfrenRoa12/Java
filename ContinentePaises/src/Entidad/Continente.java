package Entidad;

public class Continente {
	String nombre; // key
	double extension;

	public Continente() {

	}

	public Continente(String nombre) {
		this.nombre = nombre;
	}

	public Continente(String nombre, double extension) {
		this.nombre = nombre;
		this.extension = extension;
	}

	@Override
	public String toString() {
		return "Continente [nombre=" + nombre + ", extensión=" + extension + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getExtension() {
		return extension;
	}

	public void setExtension(double extension) {
		this.extension = extension;
	}

}
