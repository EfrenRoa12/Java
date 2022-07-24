package _3Lista;

public class Restaurante {
	// CREAMOS LOS ATRIBUTOS DE LA CLASE
	String nombre;
	String bebida;
	String tipo;
	int porcion;
	int precio;

	// CREAMOS LA SOBRECARGA DE METODOS
	// CREAMOS EL CONSTRUCTOR PARA INICIALIZAR EL OBJETO
	public Restaurante() {

	}

	public Restaurante(String nombre, String bebida, String tipo, int porcion, int precio) {
		this.nombre = nombre;
		this.bebida = bebida;
		this.tipo = tipo;
		this.porcion = porcion;
		this.precio = precio;
	}

	// CREAMOS EL TO STRING
	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + ", bebida=" + bebida + ", tipo=" + tipo + ", porcion=" + porcion
				+ ", precio=" + precio + "]\n";
	}

	// CREAMOS EL ENCAPSULAMIENTO
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPorcion() {
		return porcion;
	}

	public void setPorcion(int porcion) {
		this.porcion = porcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
