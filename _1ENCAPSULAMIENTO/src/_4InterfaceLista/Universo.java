package _4InterfaceLista;

public class Universo {
	// CREAMOS LOS ATRIBUTOS DELA CLASE
	String nombre;
	String tipo;
	int numero_planeta;

	// CREAMOS LA SOBRECARGA DE METODOS
	// CREAMOS EL CONSTRUCTOR PARA INICIALIZAR EL OBJETO
	public Universo() {

	}

	// CREAMOS EL CONSTRUCTOR PARA PODER INICIALIZAR LOS ATRIBUTOS DE LA CLASE
	public Universo(String nombre, String tipo, int numero_planeta) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.numero_planeta = numero_planeta;
	}

	// CREAMOS EL TO STRING PARA PODER CAMBIAR DE CARACTER ACADENA
	@Override
	public String toString() {
		return "Universo [nombre=" + nombre + ", tipo=" + tipo + ", numero_planeta=" + numero_planeta + "]\n";
	}

	// CREAMOS EL ENCAPSULAMIENTO PARA PODER ACCEDER A LOS ATRIBUTOS
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

	public int getNumero_planeta() {
		return numero_planeta;
	}

	public void setNumero_planeta(int numero_planeta) {
		this.numero_planeta = numero_planeta;
	}

}