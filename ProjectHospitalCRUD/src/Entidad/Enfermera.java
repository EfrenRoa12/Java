package Entidad;

public class Enfermera extends PersonalHospital {
	String observacion;
	String id_clinico;
	PersonalHospital PersonalHospital;

	@Override
	public void trabajar() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION
		System.out.println("Toma historial clinico ");
	}

	public void historial_bueno() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION Y AÑADIENDO MAS
		// FUNCIONES
		System.out.println("el diagnostico es: bueno");
	}

	public void historial_melo() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION Y AÑADIENDO MAS
		// FUNCIONES
		System.out.println("el diagnostico es: malo");
	}

	// METODO CONSTRUCTOR VACIO
	public Enfermera() {

	}

//CONSTRUCTOR CON PARAMETROS Y AQUI HACEMOS - DIFERENTE COO EN ESTA PARTE YA ES ABSTRACTOR ELIGIMOS EL QUE DICE String String String String String
	public Enfermera(String nombre, String app, String titulo, String cedula, String universidad, String observacion,
			String id_clinico, Entidad.PersonalHospital personalHospital) {
		super(nombre, app, titulo, cedula, universidad);
		this.observacion = observacion;
		this.id_clinico = id_clinico;
		PersonalHospital = personalHospital;
	}

	// CREAMOS EL TOSTRING
	// @ OVERRIDE ES LA SOBRESCRITURA----LA DAMOS INNERET FIELD Y EN DOWN NOS ARROJA
	@Override
	public String toString() {
		return "Enfermera [nombre=" + nombre + ", app=" + app + ", titulo=" + titulo + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", observacion=" + observacion + ", id_clinico=" + id_clinico
				+ ", PersonalHospital=" + PersonalHospital + "]\n";
	}
	// AHORA CREAMOS LOS METODO GETTER Y SETTER QUE ES EL ENCAPSULAMIENTO.
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getId_clinico() {
		return id_clinico;
	}

	public void setId_clinico(String id_clinico) {
		this.id_clinico = id_clinico;
	}

	public PersonalHospital getPersonalHospital() {
		return PersonalHospital;
	}

	public void setPersonalHospital(PersonalHospital personalHospital) {
		PersonalHospital = personalHospital;
	}

	

	
	

}
