import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// Listas son dnamicas su manejo es por medio de indice
		
		List<Perro> lista = new ArrayList<Perro>();
		
		//lo hacemos como el indice
		Perro perroc=new Perro("Scoby","macho","cafe",10);
		//add es para agregar una lista
		lista.add(perroc);
		
		perroc=new Perro("Legolas","macho","miel",10);
		//add es para agregar una lista
		lista.add(perroc);
		
		perroc=new Perro("dolar","macho","miel",10);
		//add es para agregar una lista
		lista.add(perroc);
		
		
		//MOSTRAR
		System.out.println(lista);
		//MOSTRAMOS LA LISTA
		perroc=lista.get(0);//POSICION 0 DE SCOBY
		System.out.println("perro encontrado: "+perroc);
		
		
		
		
		/*-------------EDITAR--------------
		 * antes de editar vamos a buscar
		 */
		//------BUSCAR--------
		
		perroc=lista.get(1);//EN LA POSICION 1 CAMBIAMOS
		//LO LLAMAMOS POR MEDIO DE SET PARA CAMBIARLE LA EDA setEdad-------->
		perroc.setEdad(20);//cambiamos edad
		//------EDITAR-----
		lista.set(1, perroc);//POSICION 1 DE LA LISTA
		System.out.println("lista editada"+perroc);
		
		
		
		//-----ELIMINAMOS------
		//buscar
		perroc=lista.get(0);//posicion 0
		lista.remove(0);//ELIMINAMOS LA POSICION 0-- CON LA FUNCION REMOVE
		//NOS MUESTRA EL PERRO ELIMINADO DE LA LISTA
		System.out.println("perro eliminado es----->"+perroc);
		//IMPRIMIMOS LA LISTA DE COMO QUEDO
		System.out.println(lista);
		
		
		
	}//cierra main

}//cierra clase principal
