
public class Celular {
	String modelo;
	String marca;
	double precio;
	String color;
	int ram;

	// constructor 
	public Celular() {

	}
	//constructores
	public Celular(String modelo, String marca, double precio, String color, int ram) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.ram = ram;
	}
	//metodo tostring
	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", color=" + color + ", ram="
				+ ram + "\n]";
	}
	//metodo getter y setter

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

}
