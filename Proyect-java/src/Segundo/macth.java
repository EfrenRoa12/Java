package Segundo;

public class macth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base = 5, exponente = 2;
		double resultado = Math.pow(base, exponente);// es al cuadrado al numero bas al exponente
		System.out.println(resultado);

		// --------------------------------REDONDEAR UN NUMERO-----

		float numero = 4.56f;
		int result = Math.round(numero);// redondea el numero a 6
		System.out.println(result);
		// ----------------------------metodo ramdom

		double resulta = Math.random();// un valor tipo double numero aleatorio
		System.out.println(resulta);
	}

}
