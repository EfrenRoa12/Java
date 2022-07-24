package Practica2Encapsulamiento;

public class Principal {

	public static void main(String[] args) {
		// HACEMOS INSTANCIA
		Auto auto1 = new Auto();
		//Establecemos el setter
		auto1.setNombre("auto deportivo");
		auto1.setMarca("ferrari");
		auto1.setModelo(2019);
		
		//SE CREA LA ENCAPSULACION YA QUE POR MEDIO DE SETTER Y GETTER OBTENEMOS LOS VALORES
		//OBTENEMOS EL VALOR GETTET PARA IMPRIMIRLO
		System.out.println("el tipo de auto es: "+auto1.getNombre());
		System.out.println("la marca del auto es: "+auto1.getMarca());
		System.out.println("el modelo es: "+auto1.getModelo());
		
	}

}
