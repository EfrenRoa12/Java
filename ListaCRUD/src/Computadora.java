
public class Computadora {
	String modelo;
	String marca;
	double precio;

	public Computadora() {

	}

	public Computadora(String modelo, String marca, double precio) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}
//imprime los datos de la clase de manera sencilla los convierte en cadena
	@Override
	public String toString() {
		return "Computadora [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + "]\n";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
