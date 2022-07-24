package _1ENCAPSULAMIENTO;

public class Animal {
	// CREAMOS LOS ATRIBUTOS
	private String nombre;
	private int edad;
	private String genero;
	
	//REALIZAMOS LA SOBRECARGA DEMETODOS PARA PODER AGREGARLE OTROS PARAMETOR AL CONSTRUCTOR

	// CREAMOS EL CONSTRUCTOR DE LA CLASE PARA INICIALIZARLO
	public Animal() {

	}
	// CREAMOS EL CONSTRUCTOR PARA ESTABLECER LOS ATRIBUTOS DEL OBJETO

	public Animal(String nombre, int edad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	// CREAMOS EL METODO TO STRING PARA CONVERTIR DE CARACTER A CADENA

	@Override
	public String toString() {

		return "Animal [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]\n";
	}

	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public int getEdad() {

		return edad;
	}

	public void setEdad(int edad) {

		this.edad = edad;
	}

	public String getGenero() {

		return genero;
	}

	public void setGenero(String genero) {

		this.genero = genero;
	}

	// CREAMOS EL ENCAPSULAMIENTO PARA ACCEDER A LOS ATRIBUTS

}
