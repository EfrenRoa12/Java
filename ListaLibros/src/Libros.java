
public class Libros {
	int id;
	String nombre;
	String genero;
	double precio;

	public Libros() {

	}

	public Libros(int id, String nombre, String genero, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libros [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", precio=" + precio + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
