package Practica3Encapsulamiento;

public class Principal {

	public static void main(String[] args) {
		// INSTANCIAMOS LA CLASE MEDICO
		Medico medico1 = new Medico();
		//ESTABLECEMOS LOS VALORES
		medico1.setNombre("ricardo");
		medico1.setApellido("perez");
		medico1.setEdad(29);
		medico1.setDni(49778);
		//IMPRIMIMOS LOS VALORES E IMPRIMIMOS EN PANTALLA
		System.out.println("El nombre del medico es: "+medico1.getNombre());
		System.out.println("El apellido del medico es: "+medico1.getApellido());
		System.out.println("la edad del medico es: "+medico1.getEdad()+" años");
		System.out.println("El DNI del medico es: "+medico1.getDni());
		//PODEMOS CREAR MULTIPLOS MEDICOS   ---------------------- >
		Medico medico2 = new Medico();
		medico2.setNombre("marco");
		medico2.setApellido("gonzalez");
		medico2.setEdad(32);
		medico2.setDni(98558);
		System.out.println("\nEl nombre del medico es: "+medico2.getNombre());
		System.out.println("El apellido del medico es: "+medico2.getApellido());
		System.out.println("la edad del medico es: "+medico2.getEdad()+" años");
		System.out.println("El DNI del medico es: "+medico2.getDni());
	}

}
