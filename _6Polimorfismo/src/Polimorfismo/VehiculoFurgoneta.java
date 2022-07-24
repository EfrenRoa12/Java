package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
	
	private int carga;
	
	public VehiculoFurgoneta() {
		
	}

	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		//SUPER ES PARA COMO SI HEREDADA DE VEHICULO ENTONCES SE UTILIZA LA SUPER
		super(matricula, marca, modelo);
		this.carga = carga;
	}


	public int getCarga() {
		return carga;
	}

	@Override
	public String MostrarDatos() {
		return "Matricula: " + matricula + "\nMarca" + marca + "\nModelo" + modelo+"\ncarga"+carga;
	}
	
}
