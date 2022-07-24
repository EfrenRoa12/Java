
public class Perro {
	// Atributo
	String nombre;
	String genero;
	String color;
	int edad;

	// Metodo constructor default
	public Perro() {

	}

	// constructor con parametros
	public Perro(String nombre, String genero, String color, int edad) {
		this.nombre = nombre;
		this.genero = genero;
		this.color = color;
		this.edad = edad;
	}

	// toString
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", genero=" + genero + ", color=" + color + ", edad=" + edad + "\n]";
	}

	//setter y getter
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
