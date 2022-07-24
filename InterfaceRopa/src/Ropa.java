
public class Ropa {
	// Atributo
	String nombre;
	String tipo;
	double precio;
	String color;

	//Metodos
	//metodo constructor vacio
	public Ropa() {

	}
	//metodo constructor con parametros
	public Ropa(String nombre, String tipo, double precio, String color) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.color = color;
	}
	//metodo to string
	@Override
	public String toString() {
		return "Ropa [nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", color=" + color + "]\n";
	}
	//metodos get y set
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
