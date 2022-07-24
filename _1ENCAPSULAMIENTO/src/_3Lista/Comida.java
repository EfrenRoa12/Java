package _3Lista;

public class Comida {
	// CREAMIS LOS ATRIBUTOS DE LA CLASE
	String nombre;
	String tipo;
	String bebida;
	int porcion;

	// CREAMOS LOS LA SOBRECARGA DE METOSOS
	// CREMOS EL CONTRUCTOR PARA INCICIALIZAR CON EL OBJETO DE LA CLASE
	public Comida() {

	}

	// CREAMOS EL CONSTRUCTOR SOBRECARGANDO PARA INICIALIZAR LOS ATRIBUTOS DE LA
	// CLASE
	public Comida(String nombre, String tipo, String bebida, int porcion) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.bebida = bebida;
		this.porcion = porcion;
	}

	// CREAMOS EL METODO TO STRING PARA CONVERTIR DE CARACTER A CADENA
	@Override
	public String toString() {
		return "Comida [nombre=" + nombre + ", tipo=" + tipo + ", bebida=" + bebida + ", porcion=" + porcion + "]\n";
	}

	// CREAMOS EL ENCAPSULAMIENTO PARA ACCEDER LOS ATRIBUTOS DE LA CLASE
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

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public int getPorcion() {
		return porcion;
	}

	public void setPorcion(int porcion) {
		this.porcion = porcion;
	}

}
