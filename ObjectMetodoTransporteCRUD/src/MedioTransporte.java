
public class MedioTransporte {
	// ATRIBUSTOS
	String nombre;// KEY HASHMAO<KEY, VALUE>
	String tipo;
	double costo;
	int pasajeros;

	// CONSTRUCTOR SIN PARAMETROS
	public MedioTransporte() {

	}

	// CONSTRUCTOR CON PARAMETROS
	public MedioTransporte(String nombre) {// KEY VA A PASAR EL PARAMETRO PARA EL NOMBRE
		// A ESTE VARIABLE nombre ASIGNALE EL PARAMETRO nombre
		this.nombre = nombre;
	}

	// METODO CONSTRUCTOR CON PARAMETROS --> N CONSTRUCTORES
	public MedioTransporte(String nombre, String tipo, double costo, int pasajeros) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.costo = costo;
		this.pasajeros = pasajeros;
	}

	// TO STRING--->DEVUELVE OBJETO CADENA DE CARACTERES IMPRIMIMOS SOLO OBJETO
	// MANDA ACCESO A LA MEMORIA
	// QUEREMOS QUE REALMENTE UTILIZAMOS LO SOBREESCRIBIMOS REFERENCIAMOS COMO
	// QUEREMOS
	// LO VA A IMPRIMIR DE TIPO CARACTER
	@Override
	public String toString() {
		return "MedioTransporte [nombre=" + nombre + ", tipo=" + tipo + ", costo=" + costo + ", pasajeros=" + pasajeros
				+ "]";
	}
	// METODO GETTER Y SETTER SET ESTABLECE GET OBTIENE

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
