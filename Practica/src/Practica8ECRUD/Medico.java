package Practica8ECRUD;

public class Medico {
	// CREAMO LOS ATRIBUTOS
	String nombre_m;
	String apellido;
	int edad;
	String especialidad;
	String universidad;

	// CREAMOS EL CONSTRUCTOR POR DEFAULT
	public Medico() {

	}

	// CREAMOS EL SETER Y GETTER
	public String getNombre_m() {
		return nombre_m;
	}

	public void setNombre_m(String nombre_m) {
		this.nombre_m = nombre_m;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

}
