
public class Transporte {
	String nombre;
	String tipo;
	double costo;
	int pasajero;

	public Transporte() {

	}

	// busqueda por medio de la key
	public Transporte(String nombre) {
		this.nombre = nombre;
	}
	

	public Transporte(String nombre, String tipo, double costo, int pasajero) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.costo = costo;
		this.pasajero = pasajero;
	}

	@Override
	public String toString() {
		return "Transporte [nombre=" + nombre + ", tipo=" + tipo + ", costo=" + costo + ", pasajero=" + pasajero + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getPasajero() {
		return pasajero;
	}

	public void setPasajero(int pasajero) {
		this.pasajero = pasajero;
	}

}
