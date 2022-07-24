package Practica15Object;

public class Persona {
	int edad; // declaramos una variable de tipo entero

	public Persona(int e) { // constructor con el parametro e de tipo entero

		edad = e; // edad=20

	}

	public String toString() { // nos va a representar el objeto nombre en una cadena de caracteres
								// el metodo toString viene de la clase Object

		return "Edad :" + edad; // retorna edad=20

	}
}
