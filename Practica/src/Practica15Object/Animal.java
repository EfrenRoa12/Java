package Practica15Object;

public class Animal {
	Object nombre; // declaramos una variable de tipo Objeto

	public Animal(Object nom) { // constructor con parametros

		nombre = nom; // a la variable nombre le asignamos el parametro nom de tipo Object
						// nombre="Hola"

	}

	public String toString() { // nos va a representar el objeto nombre en una cadena de caracteres
								// el metodo toString viene de la clase Object

		return "Nombre :" + nombre; // retorna el objeto nombre="hHola"

	}
}
