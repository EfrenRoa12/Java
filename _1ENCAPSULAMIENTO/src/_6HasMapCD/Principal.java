package _6HasMapCD;

public class Principal {

	public static void main(String[] args) {

		// COMODIN PARA INSTANCIAR CON EMPLEADO
		Empleado emple1 = null;
		Empleado emple2 = null;

		// INSTANCIAMOS LA IMPLEMENTACION
		Implementacion implementacion = new Implementacion();

		// AGREGAMOS
		Empleado empleado1 = new Empleado("Jose", 20, "tizapa 76");
		Empleado empleado2 = new Empleado("Marco", 23, "benavides 102");
		Empleado empleado3 = new Empleado("Luis", 26, "angeles 45");
		Empleado empleado4 = new Empleado("Fernanda", 25, "zapata 14");
		Empleado empleado5 = new Empleado("Alexa", 22, "carranza 17");
		Empleado empleado6 = new Empleado("Nova", 22, "madero 76");
		Empleado empleado7 = new Empleado("Ricardo", 19, "paz 66");
		Empleado empleado8 = new Empleado("Octavio", 21, "jacaranda 16");
		Empleado empleado9 = new Empleado("Erika", 28, "tomas 26");

		// GUARDAMOS LOS DATOS
		implementacion.guardar(empleado1);
		implementacion.guardar(empleado2);
		implementacion.guardar(empleado3);
		implementacion.guardar(empleado4);
		implementacion.guardar(empleado5);
		implementacion.guardar(empleado6);
		implementacion.guardar(empleado7);
		implementacion.guardar(empleado8);
		implementacion.guardar(empleado9);

		// MOSTRAR
		implementacion.mostrar();

		// NO BUSCAR
		emple1 = new Empleado("Erika", 28, "tomas 26");
		System.out.println("sin buscar "+emple1);
		
		//ENCONTRADO
		emple2 = implementacion.buscar(emple1);
		System.out.println("El empleado encontrado es: "+emple2);
		
		//BUSCAR ANTES DE editar
		empleado1.setNombre("josepth");
		implementacion.editar(empleado1);
		implementacion.mostrar();
		System.out.println("El empleado editado: "+empleado1);
		
		//ELIMINAR
		implementacion.eliminar(empleado9);
		implementacion.mostrar();
		System.out.println("El empleado eliminado: "+empleado9);
	}

}
