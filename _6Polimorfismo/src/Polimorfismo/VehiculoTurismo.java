package Polimorfismo;

public class VehiculoTurismo extends Vehiculo{
	//ATRIBUTOS
	private int numeroPuertas;
	
	public VehiculoTurismo() {
		
	}

	public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
		//SUPER ES PARA COMO SI HEREDADA DE VEHICULO ENTONCES SE UTILIZA LA SUPER
		super(matricula, marca, modelo);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	
	@Override
	public String MostrarDatos() {
		return "Matricula: " + matricula + "\nMarca" + marca + "\nModelo" + modelo+"\nnumeroPuertas"+numeroPuertas;
	}
	
}
