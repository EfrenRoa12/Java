package _3retorno_valores;

public class Principal {

	public static void main(String[] args) {
		//CREAMOS LA INSTANCIACION PARA IMPRIMIR
		OperacionReturn opera = new OperacionReturn();
		//Ejecutamos el resultado
		System.out.println("la suma es: "+opera.sumar(8, 6));
		System.out.println("la resta es: "+opera.restar(8, 6));
		System.out.println("la multiplicacion es: "+opera.multiplicar(8, 6));
		System.out.println("la division es: "+opera.dividir(8, 6));

	}

}
