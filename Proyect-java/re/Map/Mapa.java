package Map;

import java.util.HashMap;

public class Mapa {

	public static void main(String[] args) {
		// la llave va a ser String y entero tipo Integer
		/**
		 * Short
		 * Integer
		 * Long
		 * Float
		 * Double
		 * Character
		 * Boolean
		 */
		HashMap<String, Integer> idEmpleado = new HashMap<>();
		//creamos key y value
		idEmpleado.put("Efren", 12354);
		idEmpleado.put("jose", 56321);
		idEmpleado.put("marco", 3698);
		
		System.out.println(idEmpleado);
		//imprimimos
		System.out.println(idEmpleado.get("Efren"));
		//verificamos si existe cierta clave en nuestro mapa --- si jerry tiene una identificacion de clave
		//si hay este nombre true si no no existe
		System.out.println(idEmpleado.containsKey("Efren")+" Efren existe");
		//si hay este nombre true si no no existe
		System.out.println(idEmpleado.containsKey("hector")+" hector no existe");
		//rempazamos un valor
		idEmpleado.replace("jose", 777);
		System.out.println(idEmpleado);
		idEmpleado.remove("steve");
		System.out.println(idEmpleado);
	}

}
