
public class Animal extends SerVivo {
	String raza;
	String color;
	String comida;

	// OS MARCA ERROR EN IngSistemas COLOCAMOS EL MAUSE Y NOS ARROJA TRABAJAR
	@Override
	public void dormic() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION
		System.out.println("esta durmiendo ");

	}

	public void veterinario() {
		// PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION Y AÑADIENDO MAS
		// FUNCIONES
		System.out.println("el diagnostico es: esta vacunado ");
	}

	// METODO CONSTRUCTOR VACIO
	public Animal() {

	}

	// CONSTRUCTOR CON PARAMETROS Y AQUI HACEMOS - DIFERENTE COO EN ESTA PARTE YA ES
	// ABSTRACTOR ELIGIMOS EL QUE DICE String String String String String
	public Animal(String nombre, String tipo_ser_vivo, String alimentacion, String genero, String raza, String color,
			String comida) {
		super(nombre, tipo_ser_vivo, alimentacion, genero);
		this.raza = raza;
		this.color = color;
		this.comida = comida;
	}

	// CREAMOS EL TOSTRING
	// @ OVERRIDE ES LA SOBRESCRITURA----LA DAMOS INNERET FIELD Y EN DOWN NOS ARROJA
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo_ser_vivo=" + tipo_ser_vivo + ", Alimentacion=" + Alimentacion
				+ ", genero=" + genero + ", raza=" + raza + ", color=" + color + ", comida=" + comida + "]\n";
	}

	// AHORA CREAMOS LOS METODO GETTER Y SETTER QUE ES EL ENCAPSULAMIENTO.
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

}
