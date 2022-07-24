
public class Auto {
	String modelo;
	String marca;
	double precio;

	// metodo constructor vacio
	public Auto() {

	}

	// metodo constructor con parametros
	public Auto(String modelo, String marca, double precio) {
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}

	// toString
	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + "]\n";
	}

	// getter y setter+++++
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
