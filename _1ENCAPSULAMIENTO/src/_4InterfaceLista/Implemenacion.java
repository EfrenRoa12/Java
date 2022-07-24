package _4InterfaceLista;

import java.util.ArrayList;
import java.util.List;

public class Implemenacion implements Metodos{//SE HEREDA DE IMPLEMENTACION
	//CREAMOS LALISTA CON METODOS DE CRUD
	List<Universo> lista = new ArrayList<Universo>();

	@Override
	public void guardar(Universo universo) {
		lista.add(universo);
		
	}

	@Override
	public void editar(int indice, Universo universo) {
		lista.set(indice, universo);
		
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
		
	}

	@Override
	public Universo buscar(int indice) {
		Universo u = lista.get(indice);
		return u;
	}

	@Override
	public void mostrarr() {
		System.out.println(lista);
		
	}
	

}
