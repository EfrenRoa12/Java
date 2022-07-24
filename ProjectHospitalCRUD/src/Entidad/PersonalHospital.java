package Entidad;

public abstract class PersonalHospital {// CREAMOS LA ABSTRACCION
	// CREAMOS LOS ATRIBUTOS GENERALES PARAEL PERSONAL QUE TRABAJA EN EL HOSPITAL
	//EL NOMBRE VA A SER LA KEY
	String nombre;
	String app;
	String titulo;
	String cedula;
	String universidad;

	// METODO NO ABTRACTO --> METODO NORMAL
	// CUANTO ES LO QUE VA A PERCIBIR
	// DE QUE FORMA---> QUE TIPO DE TRABAJO HACE Y DE QUE TURNO TRABAJA
	public void medicar(String medicamento, String cantidad) {
		System.out.println("suministra medicamento " + medicamento + " la cantidad de " + cantidad);
	}

	// METODO NO ABTRACTO---> SE PUEDE IR ADECUANDO A CADA CLASE
	public abstract void trabajar();

	// CREAMOS EL CONSTRUCTOR SIN PARAMETROS
	public PersonalHospital() {

	}
	// CONSTRUCTOR CON PARAMETROS

	public PersonalHospital(String nombre, String app, String titulo, String cedula, String universidad) {
		this.nombre = nombre;
		this.app = app;
		this.titulo = titulo;
		this.cedula = cedula;
		this.universidad = universidad;
	}
	// NO OCUPAMOS EL METODO TO STRING YA QUE ESTA CLASE ES ABSTRACTA Y SE USA DE
	// MANERA GENERAL
	// METODOS GETTER Y SETTER

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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

}
