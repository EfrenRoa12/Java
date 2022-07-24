package Practica15Object;

public class Principal {

	public static void main(String[] args) {

		// aqui trata de cambiar el "hola " por el 20
		Animal a1 = new Animal("Hola"); // instanciamos el objeto a1 y le pasamos el "Hola" al constructor

		Persona p1 = new Persona(20); // instanciamos el objeto p1 y le pasamos el numero 20
		System.out.println(a1); // imprimimos el objeto y nos devuelve caracteres gracias al toString()
		System.out.println(p1); // imprimimos el objeto y nos devuelve un entero gracias al toString()
	}

}
