package Polimorfismo;

public class Principal {
	
	public static void main(System [] args) {
		
		Vehiculo misVehiculos[] = new Vehiculo[4];

		misVehiculos [0] = new Vehiculo("128GB", "FERRARI", "A8");
		misVehiculos [1] = new VehiculoTurismo("258S", "MIN", "MINIBAN",4);
		misVehiculos [2] = new VehiculoDeportivo("SSW", "LAMBORGINI", "JD7",500);
		misVehiculos [3] = new VehiculoFurgoneta("WR7", "NISSAN", "2E",2000);
		
		for (Vehiculo Vehiculos:misVehiculos) {
			System.out.println(Vehiculos.MostrarDatos());
			System.out.println(" ");
			
		}
	}

}
