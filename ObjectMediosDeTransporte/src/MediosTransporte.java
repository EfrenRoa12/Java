
public class MediosTransporte {
	String nombre;//key
	String tipo;
	double costo;
	int pasajeros;
	
	public MediosTransporte() {
		
	}
	public MediosTransporte(String nombre) {//lo buscamos por nombre---parametro nombre
		this.nombre=nombre;
	}
	public MediosTransporte(String nombre, String tipo, double costo, int pasajeros) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.costo = costo;
		this.pasajeros = pasajeros;
	}
	//to string
	@Override
	public String toString() {
		return "MediosTransporte [nombre=" + nombre + ", tipo=" + tipo + ", costo=" + costo + ", pasajeros=" + pasajeros
				+ "]\n";
	}
	//encapsulamiento
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
