package _7Encapsulamiento;

public class Principal {

	public static void main(String[] args) {
		// 
		Clase1 clase1 = new Clase1();
		//COMO ESTA ENCAPSULADO EN CLASE1 POR MEDIO DE LOS ODIFICADORES DE ACCESO PODEMOS ESTABLECER LA EDAD
		clase1.SetEdad(8);
		System.out.println("la edad es: "+clase1.GetEdad()+" años");
		

	}

}
