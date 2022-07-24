package Practica5Encapsulamiento;

public class Principal {

	public static void main(String[] args) {
		// INSTANCIAMOS LA CLASE ESCUELA
		Escuela escuela1 = new Escuela();
		//ESTABLECEMOS LOS VALORES
		escuela1.setNombre("benito juarez");
		escuela1.setTipo("publica");
		escuela1.setTot_grupos(24);
		escuela1.setTotal_ni(600);
		escuela1.setTotal_pr(30);
		//OBTENEMOS EL VALOR GET Y LO IMPRIMIMOS
		
		System.out.println("Los datos de la escuela son:\n ");
		System.out.println("el nombre de la escuela es: "+escuela1.getNombre());
		System.out.println("el tipo de escuela es: "+escuela1.getTipo());
		System.out.println("el total de grupos de la escuela: "+escuela1.getTot_grupos());
		System.out.println("el total de niños: "+escuela1.getTotal_ni());
		System.out.println("el total de profesores: "+escuela1.getTotal_pr());
		
		
		Escuela escuela2 = new Escuela();
		//ESTABLECEMOS LOS VALORES
		escuela2.setNombre("george washington");
		escuela2.setTipo("privada");
		escuela2.setTot_grupos(16);
		escuela2.setTotal_ni(400);
		escuela2.setTotal_pr(24);
		//OBTENEMOS EL VALOR GET Y LO IMPRIMIMOS
		
		System.out.println("Los datos de la escuela son:\n ");
		System.out.println("el nombre de la escuela es: "+escuela2.getNombre());
		System.out.println("el tipo de escuela es: "+escuela2.getTipo());
		System.out.println("el total de grupos de la escuela: "+escuela2.getTot_grupos());
		System.out.println("el total de niños: "+escuela2.getTotal_ni());
		System.out.println("el total de profesores: "+escuela2.getTotal_pr());
		
		
		
	}

}
