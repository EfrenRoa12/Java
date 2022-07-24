package Entidad;

public class Alumno {
	String matricula;// Key
	String nombre;
	String app;
	String carrera;
	Profesor profesor;// ES UN OBJETO DE LA CLASE PROFESOR DENTRO DEL ALUMNO---UNA VEZ CREADO LA CLASE PROFESOSR
	// CONSTRUCTOR VACIO

	public Alumno() {

	}

	// COMO LO VAMOS A HACER EN HashMap LE PASAMOS EL PARAMETRO
	public Alumno(String matricula) {
		this.matricula = matricula;
	}
	//CLASE CONSTRUCTOR CON PARAMETROS
	public Alumno(String matricula, String nombre, String app, String carrera, Profesor profesor) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.app = app;
		this.carrera = carrera;
		this.profesor = profesor;
	}

	// DEBEMOS CREAR CON CUIDADP EL HASH YA QUE HAY COSAS QUE DEBEN DE PODER INGRESARLO con hash
	@Override
	public String toString() {
		return "Alumno [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", matricula=" + matricula + ", nombre=" + nombre + ", app=" + app + ", carrera=" + carrera
				+ ", profesor=" + profesor + "]";
	}

	// METODO GETTER Y SETTER
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

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}
