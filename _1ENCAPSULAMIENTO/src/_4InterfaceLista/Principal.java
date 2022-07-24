package _4InterfaceLista;

public class Principal {

	public static void main(String[] args) {
		
		//INSTANCIAMOS LA IMPLEMENTACION
		Implemenacion implementacion = new Implemenacion();
		
		
		//AGREGAMOS

		Universo uni1 = new Universo("via lactea","andromeda",100);
		Universo uni2 = new Universo("via derc","sica",1500);
		Universo uni3 = new Universo("via luyoy","noka",1080);
		Universo uni4 = new Universo("via de amor","nova",1600);
		Universo uni5 = new Universo("via adndr","layer",1400);
		Universo uni6 = new Universo("via mens","ana",1020);
		Universo uni7 = new Universo("via vicr","andda",1070);
		Universo uni8 = new Universo("via madr","aomeda",1500);
		Universo uni9 = new Universo("via fer","asdheda",1080);
		
		Universo univ = null;
		
		//GUARDAMOS
		implementacion.guardar(uni1);
		implementacion.guardar(uni2);
		implementacion.guardar(uni3);
		implementacion.guardar(uni4);
		implementacion.guardar(uni5);
		implementacion.guardar(uni6);
		implementacion.guardar(uni7);
		implementacion.guardar(uni8);
		implementacion.guardar(uni9);
		
		
		//MOSTRAMOS TODO ALA CONSOLA
		implementacion.mostrarr();
		
		//BUSCAMOS POR POSICION E IMPRIMIMOS
		System.out.println("se encontro : "+implementacion.buscar(0));
		System.out.println("se encontro : "+implementacion.buscar(2));
		System.out.println("se encontro : "+implementacion.buscar(4));
		System.out.println("se encontro : "+implementacion.buscar(6));
		System.out.println("se encontro : "+implementacion.buscar(8));
		
		
		//BUSCAMOS ANTES DE EDITAR
		univ = implementacion.buscar(6);//BUSCAMOS LA POSICION
		univ.setNombre("marte");//EDITAMOPS EL NOMBRE
		implementacion.editar(6, univ);//EDITAR CON EL METODO
		uni6 = implementacion.buscar(6);//BUSCAMOS
		System.out.println("se edito el nombre: " + uni6);//IMPRIMIMOS
		implementacion.mostrarr();
		
		//ELIMINAR
		implementacion.eliminar(0);//POSICION A ELIMINAR
		System.out.println("se elimino el Universo: " + uni1.getNombre()); //
		implementacion.mostrarr();
	}

}
