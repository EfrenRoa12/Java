package Entidad;

public class Paramedico extends PersonalHospital {
	// CREAMOS LOS ATRIBUTOS PROPIOS DE MEDICO
	String cursos;
	String tipo_ambulancia;
	PersonalHospital PersonalHospital;

	@Override
	public void trabajar() {
		System.out.println("Brindando atencion medica urgente ");

	}

	public void traslado_si() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION Y AÑADIENDO MAS
		// FUNCIONES
		System.out.println("diagnostico : requiere traslado urgente");
	}

	public void traslado_no() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION Y AÑADIENDO MAS
		// FUNCIONES
		System.out.println("diagnostico : no requiere traslado urgente");
	}

	// METODO CONSTRUCTOR VACIO
	public Paramedico() {

	}

	// CONSTRUCTOR CON PARAMETROS Y AQUI HACEMOS - DIFERENTE COO EN ESTA PARTE YA ES
	// ABSTRACTOR ELIGIMOS EL QUE DICE String String String String String
	public Paramedico(String nombre, String app, String titulo, String cedula, String universidad, String cursos,
			String tipo_ambulancia, Entidad.PersonalHospital personalHospital) {
		super(nombre, app, titulo, cedula, universidad);
		this.cursos = cursos;
		this.tipo_ambulancia = tipo_ambulancia;
		PersonalHospital = personalHospital;
	}

	// CREAMOS EL TOSTRING
	// @ OVERRIDE ES LA SOBRESCRITURA----LA DAMOS INNERET FIELD Y EN DOWN NOS ARROJA

	@Override
	public String toString() {
		return "Paramedico [nombre=" + nombre + ", app=" + app + ", titulo=" + titulo + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", cursos=" + cursos + ", tipo_ambulancia=" + tipo_ambulancia
				+ ", PersonalHospital=" + PersonalHospital + "]";
	}

	// AHORA CREAMOS LOS METODO GETTER Y SETTER QUE ES EL ENCAPSULAMIENTO.
	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public String getTipo_ambulancia() {
		return tipo_ambulancia;
	}

	public void setTipo_ambulancia(String tipo_ambulancia) {
		this.tipo_ambulancia = tipo_ambulancia;
	}

	public PersonalHospital getPersonalHospital() {
		return PersonalHospital;
	}

	public void setPersonalHospital(PersonalHospital personalHospital) {
		PersonalHospital = personalHospital;
	}

}
