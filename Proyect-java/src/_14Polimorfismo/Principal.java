package _14Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		//LO GUARDAREMOS EN UN ARRAY
		
		
		Vehiculo miVehiculo[] = new Vehiculo[4];//vaos a colocar en memoria reservr4 
		
		
		
		miVehiculo [0] = new Vehiculo("221ff","ferrari","as");
		miVehiculo [1] = new VehiculoTurismo("221ff","toyota","as",8);
		miVehiculo [2] = new VehiculoDeportivo("221ff","nissan","as",8);
		miVehiculo [3] = new VehiculoForgoneta("221ff","ford","as",8);
		//clase vehiculo _vehiculo y que imprima todos mis vehiculos 
		for(Vehiculo _vehiculo: miVehiculo) {
			System.out.println("mi vehiculo es: "+_vehiculo.mostrarDatos());//mostrar datos de diferentes formas conforma ala clase
		}
		
	}

}
