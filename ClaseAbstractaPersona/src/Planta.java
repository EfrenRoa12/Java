
public class Planta extends SerVivo {// Planta VA A HEREDAR DE SERVIVO
	String genero;
	String calidad;

	// NOS MARCA ERROR EN IngSistemas COLOCAMOS EL MAUSE Y NOS ARROJA TRABAJAR
	@Override
	public void dormic() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION
		System.out.println("esta durmiendo en el sofa");

	}

	// CREAMOS NUEVOS METODS QUE ES LO QUE VA A REALIZAR
	public void ladra() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION
		System.out.println("esta guardado ");
	}

	// METODO CONSTRUCTOR SIN PARAMETROS
	public Planta() {

	}

//CONSTRUCTOR CON PARAMETROS Y AQUI HACEMOS - DIFERENTE COO EN ESTA PARTE YA ES ABSTRACTOR ELIGIMOS EL QUE DICE String String String String String
	public Planta(String nombre, String tipo_ser_vivo, String alimentacion, String genero, String genero2,
			String calidad) {
		super(nombre, tipo_ser_vivo, alimentacion, genero);
		genero = genero2;
		this.calidad = calidad;
	}

	// CREAMOS EL TOSTRING
	// @ OVERRIDE ES LA SOBRESCRITURA----LA DAMOS INNERET FIELD Y EN DOWN NOS ARROJA
	@Override
	public String toString() {
		return "Planta [nombre=" + nombre + ", tipo_ser_vivo=" + tipo_ser_vivo + ", Alimentacion=" + Alimentacion
				+ ", genero=" + genero + ", calidad=" + calidad + "\n]";
	}

	// AHORA CREAMOS LOS METODO GETTER Y SETTER QUE ES EL ENCAPSULAMIENTO.
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

}
