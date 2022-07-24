
public abstract class SerVivo {// DECLARAMOS LA CLASE DE TIPO ABSTRACTA
	// CREAMOS LOS ATRIBUTOS
	String nombre;
	String tipo_ser_vivo;
	String Alimentacion;
	String genero;

	// METODO NO ABTRACTO --> METODO NORMAL
	// CUANTO ES LO QUE VA A PERCIBIR
	// DE QUE FORMA COME Y CANTIDAD DE COMIDA A INGERIR
	public void comer(String tipo_comida, double cantidad_comida) {
		System.out.println("come  " + tipo_comida + " la canidad de " + cantidad_comida);
	}

	// METODO NO ABTRACTO---> SE PUEDE IR ADECUANDO A CADA CLASE
	public abstract void dormic();

	// CONSTRUCTOR SIN PARAMETROS
	public SerVivo() {

	}
	// CONSTRUCTOR CON PARAMETROS

	public SerVivo(String nombre, String tipo_ser_vivo, String alimentacion, String genero) {
		this.nombre = nombre;
		this.tipo_ser_vivo = tipo_ser_vivo;
		Alimentacion = alimentacion;
		this.genero = genero;
	}
	// NO OCUPAMOS EL METODO TO STRING
	// METODOS GETTER Y SETTER

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo_ser_vivo() {
		return tipo_ser_vivo;
	}

	public void setTipo_ser_vivo(String tipo_ser_vivo) {
		this.tipo_ser_vivo = tipo_ser_vivo;
	}

	public String getAlimentacion() {
		return Alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		Alimentacion = alimentacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
