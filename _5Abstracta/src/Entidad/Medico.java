package Entidad;

public class Medico extends Profesionista {// LO HEREDAMOS DE CLASE PROFESIONISTA
	// CREAMOS LOS ATRIBUTOS
	String colorBata;
	String especialidad;

	// OS MARCA ERROR EN IngSistemas COLOCAMOS EL MAUSE Y NOS ARROJA TRABAJAR
	@Override
	public void trabajar() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION
		System.out.println("dando paracetamol");
	}

	public void consultar() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION Y AÑADIENDO MAS
		// FUNCIONES
		System.out.println("el diagnostico es: si eres positivo de covid");
	}

	// METODO CONSTRUCTOR VACIO
	public Medico() {

	}

	// CONSTRUCTOR CON PARAMETROS Y AQUI HACEMOS - DIFERENTE COO EN ESTA PARTE YA ES
	// ABSTRACTOR ELIGIMOS EL QUE DICE String String String String String
	public Medico(String nombre, String app, String titulo, String cedula, String universidad, String colorBata,
			String especialidad) {
		super(nombre, app, titulo, cedula, universidad);
		this.colorBata = colorBata;
		this.especialidad = especialidad;
	}

	// CREAMOS EL TOSTRING
	// @ OVERRIDE ES LA SOBRESCRITURA----LA DAMOS INNERET FIELD Y EN DOWN NOS ARROJA
	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", app=" + app + ", titulo=" + titulo + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", colorBata=" + colorBata + ", especialidad=" + especialidad
				+ "]\n";
	}

	// AHORA CREAMOS LOS METODO GETTER Y SETTER QUE ES EL ENCAPSULAMIENTO.
	public String getColorBata() {
		return colorBata;
	}

	public void setColorBata(String colorBata) {
		this.colorBata = colorBata;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
