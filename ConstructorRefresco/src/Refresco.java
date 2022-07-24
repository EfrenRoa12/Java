
public class Refresco {
	String nombre;
	String marca;
	double precio;
	int contenido_neto;

	public Refresco() {

	}

	public Refresco(String nombre, String marca, double precio, int contenido_neto) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.contenido_neto = contenido_neto;
	}

	@Override
	public String toString() {
		return "Refresco [nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", contenido_neto="
				+ contenido_neto + "\n]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getContenido_neto() {
		return contenido_neto;
	}

	public void setContenido_neto(int contenido_neto) {
		this.contenido_neto = contenido_neto;
	}

}
