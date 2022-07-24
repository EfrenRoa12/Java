package _5Sobrecarga_Metodos;

public class Principal {

	public static void main(String[] args) {
		//INSTANCIAMOS
		Personas perso1 = new Personas("jose",22);
		perso1.Correr();
		
		//INSTANCIAMOS YA IPRIMIENDO
		Personas perso2 = new Personas("5s5d");
		perso2.Correr(5);
	}

}
