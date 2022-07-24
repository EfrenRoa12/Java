package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{

	private int cilindrada;
	
	public VehiculoDeportivo() {
		
	}

	public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
		//SUPER ES PARA COMO SI HEREDADA DE VEHICULO ENTONCES SE UTILIZA LA SUPER
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String MostrarDatos() {
		return "Matricula: " + matricula + "\nMarca" + marca + "\nModelo" + modelo+"\ncilindrada"+cilindrada;
	}
	
}
