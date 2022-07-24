
public class MediosTransporte {
	// Atributos
	String nombre;
	String tipo;
	double costo;
	int pasajeros;

	// metodo constructor vacio
	public MediosTransporte() {

	}

	// llave
	public MediosTransporte(String nombre) {
		this.nombre = nombre;
	}

	// metodo contructor
	public MediosTransporte(String nombre, String tipo, double costo, int pasajeros) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.costo = costo;
		this.pasajeros = pasajeros;
	}
	//metodo to String
	@Override
	public String toString() {
		return "MediosTransporte [nombre=" + nombre + ", tipo=" + tipo + ", costo=" + costo + ", pasajeros=" + pasajeros
				+ "]\n";
	}
	//metodos getter y setter
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

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

}
