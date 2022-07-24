package Practica3Encapsulamiento;

public class Medico {
	// CREAMOS LOS ATRIBUTOS
	String nombre;
	String apellido;
	int edad;
	int dni;

	// CREAMOS EL METODO CONSTRUCTOR PORDEFAULT
	public Medico() {

	}

	// CREAMOS CONSTRUCTOR CON PARAMETORS
	public Medico(String nombre, String apellido, int edad, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}

	// CREAMOS LOS METODOS GETTER Y SETTER PARA ESTABLECER Y OBTENER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

}
