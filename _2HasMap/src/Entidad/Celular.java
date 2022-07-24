package Entidad;

public class Celular {
	// ATRIBUTOS
	String modelo;// CLAVE-KEY
	String si;
	double precio;
	// ES UN OBJETO DE LA CLASE PROFESOR DENTRO DEL ALUMNO---UNA VEZ CREADO LA CLASE
	Marca marca;
	//CREAMOS EL CONSTRUCTOR PARA INICIALIZAR LOS ATRIBUTOS DEL OBJETO
	public Celular() {

	}

	//CREAMOS LA LLAVE SERA EL VALOR
	public Celular(String modelo) {
		this.modelo = modelo;
	}

	// CLASE CONSTRUCTOR CON PARAMETROS
	public Celular(String modelo, String si, double precio, Marca marca) {
		this.modelo = modelo;
		this.si = si;
		this.precio = precio;
		this.marca = marca;
	}

	// DEBEMOS CREAR CON CUIDADO EL HASH YA QUE HAY COSAS QUE DEBEN DE PODER
	// INGRESARLO
	@Override
	public String toString() {
		return "Celular [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", modelo=" + modelo + ", si=" + si + ", precio=" + precio + ", marca=" + marca + "]\n";
	}

	// METODO GETTER Y SETTER
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSi() {
		return si;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
}
