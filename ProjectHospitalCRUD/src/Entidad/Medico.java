package Entidad;

//EXTENDS ES LO QUE HA HEREDADO
public class Medico extends PersonalHospital {
	// CREAMOS LOS ATRIBUTOS PROPIOS DE MEDICO
	String consulta;
	String especialidad;
	PersonalHospital PersonalHospital;

	@Override
	public void trabajar() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION
		System.out.println("Asiste al paciente ");

	}

	public void sano() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION Y AÑADIENDO MAS
		// FUNCIONES
		System.out.println("el diagnostico es: sano");
	}

	public void enfermo() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION Y AÑADIENDO MAS
		// FUNCIONES
		System.out.println("el diagnostico es: enfermo");
	}

	// METODO CONSTRUCTOR VACIO
	
//CONSTRUCTOR CON PARAMETROS Y AQUI HACEMOS - DIFERENTE COO EN ESTA PARTE YA ES ABSTRACTOR ELIGIMOS EL QUE DICE String String String String String

	public Medico(String nombre, String app, String titulo, String cedula, String universidad, String consulta,
			String especialidad, Entidad.PersonalHospital personalHospital) {
		super(nombre, app, titulo, cedula, universidad);
		this.consulta = consulta;
		this.especialidad = especialidad;
		PersonalHospital = personalHospital;
	}

	public Medico(String especialidad2) {
		// TODO Auto-generated constructor stub
	}

	// CREAMOS EL TOSTRING
	// @ OVERRIDE ES LA SOBRESCRITURA----LA DAMOS INNERET FIELD Y EN DOWN NOS ARROJA
	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", app=" + app + ", titulo=" + titulo + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", consulta=" + consulta + ", especialidad=" + especialidad
				+ ", PersonalHospital=" + PersonalHospital + "]\n";
	}

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public PersonalHospital getPersonalHospital() {
		return PersonalHospital;
	}

	public void setPersonalHospital(PersonalHospital personalHospital) {
		PersonalHospital = personalHospital;
	}

	// AHORA CREAMOS LOS METODO GETTER Y SETTER QUE ES EL ENCAPSULAMIENTO.

}
