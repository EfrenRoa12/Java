package Practica4Encapsulamiento;

public class Principal {

	public static void main(String[] args) {
		// TINTANCIAMOS LAS CLASES
		Celular celular1 = new Celular();
		
		celular1.setNombre("x-force");
		celular1.setMarcaa("xaomi");
		celular1.setModelo("note nite 10 plus");
		celular1.setPais("china");
		celular1.setTipo("gama alta");
		
		//OBTENEMOS LOS VALORES E IMPRIMIMOS
		System.out.println("Los datos del celular son:\n");
		System.out.println("el nombre del celular es:\n"+celular1.getNombre());
		System.out.println("la marca del celular es:\n"+celular1.getMarcaa());
		System.out.println("el modelo es:\n"+celular1.getModelo());
		System.out.println("el pais de origen es:\n"+celular1.getPais());
		System.out.println("el tipo es:\n"+celular1.getTipo());
		
		
	}

}
