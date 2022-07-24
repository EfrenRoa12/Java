
public class IngSistemas extends Profesionista {//IngSistemas VA A HEREDAR DE PROFESIONISTA
	//CREAMOS LOS ATRIBUTOS
	String tipo;
	String lenguaje;
	String framework;
	//NOS MARCA ERROR EN IngSistemas COLOCAMOS EL MAUSE Y NOS ARROJA TRABAJAR
	@Override
	public void trabajar() {
		//PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION
		System.out.println("haciendo hola mundo para el cliente");

	}
	//CREAMOS NUEVOS METODS QUE ES LO QUE VA A REALIZAR
	public void explorando() {
		//PERSONALIZAMOS QUE ES LO QUE VA A HACER EN ESTA ABSTRACCION
		System.out.println("viendo tutorial en youtube	");
	}
	//METODO CONSTRUCTOR SIN PARAMETROS
	public IngSistemas() {

	}
	//CONSTRUCTOR CON PARAMETROS Y AQUI HACEMOS - DIFERENTE COO EN ESTA PARTE YA ES ABSTRACTOR ELIGIMOS EL QUE DICE String String String String String 
	public IngSistemas(String nombre, String app, String titulo, String cedula, String universidad, String tipo,
			String lenguaje, String framework) {
		super(nombre, app, titulo, cedula, universidad);//DONDE NOS TRAE LOS ATRIBUTOS DEL PROFESIONISTA CON SUPER
		this.tipo = tipo;
		this.lenguaje = lenguaje;
		this.framework = framework;
	}
	//CREAMOS EL TOSTRING
	//@ OVERRIDE ES LA SOBRESCRITURA----LA DAMOS INNERET FIELD Y EN DOWN NOS ARROJA
	@Override
	public String toString() {
		return "IngSistemas [nombre=" + nombre + ", app=" + app + ", titulo=" + titulo + ", cedula=" + cedula
				+ ", universidad=" + universidad + ", tipo=" + tipo + ", lenguaje=" + lenguaje + ", framework="
				+ framework + "]";
	}
	//AHORA CREAMOS LOS METODO GETTER Y SETTER QUE ES EL ENCAPSULAMIENTO.
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

}
