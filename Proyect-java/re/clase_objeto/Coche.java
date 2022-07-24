package clase_objeto;

public class Coche {
	//Atributo
	String color;
	String marca;
	int km;
	//Metodo
	public static void main(String [] args) {
		Coche coche1 = new Coche();
		
		coche1.color = "blanco";
		coche1.km = 20;
		coche1.marca = "shelby";
		
		System.out.println("el color del coche es: "+coche1.color);
		System.out.println("el kilometro del coche es: "+coche1.km);
		System.out.println("la marca es: "+coche1.marca);
		
		
		Coche coche2 = new Coche();
		coche2.color = "rojo";
		coche2.km = 2;
		coche2.marca = "challenger";
		System.out.println("el color del coche es: "+coche2.color);
		System.out.println("el kilometro del coche es: "+coche2.km);
		System.out.println("la marca es: "+coche2.marca);
	}
	
	
	
	
	
}
