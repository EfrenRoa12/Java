package Practica1Encapsulamiento;

public class Principal {

	public static void main(String[] args) {
		//INSTANCIAMOS LA CLASE PERRO
		Perro perro1 = new Perro();
		perro1.setNombre("firulais");//ESTABLECEMOS LOS VALORES
		perro1.setEdad(2);
		perro1.setColor("miel");
		perro1.setRaza("chihuahueño");
		//OBTENEMOS LOS VALORES PARA IMPRIMIR
		System.out.println("Los datos del perro son: ");
		System.out.println("el nombre es: "+perro1.getNombre());
		System.out.println("La edad es: "+perro1.getEdad());
		System.out.println("el color es: "+perro1.getColor());
		System.out.println("La raza es: "+perro1.getRaza());

	}

}
