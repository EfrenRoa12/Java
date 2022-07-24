package _3Lista;

import java.util.ArrayList;
import java.util.List;

public class COMIDAp {

	public static void main(String[] args) {
		
		//CREAMOS LA LISTA PARA REALIZAR BUSQUEDAS POR INDICE
		List<Comida> lista = new ArrayList<Comida>();
		
		//-------------------------------------------------------------------> AGREGAMOS
		Comida comida = new Comida("chilaquiles","mexicano","cerveza",1);
		lista.add(comida);
		comida = new Comida("Befsteak","EUA","vino",2);
		lista.add(comida);
		comida = new Comida("huevos","mexicano","horchata",1);
		lista.add(comida);
		//------------------------------------------------------------------->MOSTRAMOS
		System.out.println("la lista es:\n"+lista);
		//------------------------------------------------------------------->BUSCAMOS
		comida = lista.get(0);//POSICION DE BUSQUEDA
		System.out.println("la comida encontrada es: "+comida);
		//------------------------------------------------------------------->EDITAMOS
		comida = lista.get(0); //posicion buscado
		comida.setBebida("tamarindo");//editamos con get
		lista.set(0, comida);//mostramos lo que se edito
		System.out.println("se edito la bebida "+comida);
		//-------------------------------------------------------------------->ELIMINAMOS
		comida = lista.get(0);
		lista.remove(0);
		System.out.println("la comida eliminada: "+comida);
		System.out.println(lista);
		
	}

}
