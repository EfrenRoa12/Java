package Entidad;

public class Profesor {
	//ATRIBUTOS
	String matricula;
	String nombre;
	String app;
	int edad;
	//METODO CONSTRUCTOR VACIO
	public Profesor() {

	}
	//CONSTRUCTOR CON LA MATRICULA
	public Profesor(String matricula) {
		this.matricula = matricula;
	}
	//CONSTRUCTOR CON PARAMETROS
	public Profesor(String matricula, String nombre, String app, int edad) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
	}
	//CONSTRUCTOR CON ToString
	@Override
	public String toString() {
		return "Profesor [matricula=" + matricula + ", nombre=" + nombre + ", app=" + app + ", edad=" + edad + "]\n";
	}
	//METODO GETTER Y SETTER
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
