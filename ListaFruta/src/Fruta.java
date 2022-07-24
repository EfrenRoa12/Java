
public class Fruta {
	String nombre;
	int peso;
	double precio;

	public Fruta() {

	}

	public Fruta(String nombre, int peso, double precio) {
		this.nombre = nombre;
		this.peso = peso;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", peso=" + peso + ", precio=" + precio + "\n]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
