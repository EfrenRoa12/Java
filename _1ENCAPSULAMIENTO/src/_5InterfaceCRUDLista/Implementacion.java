package _5InterfaceCRUDLista;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos{
	
	List<Celular> lista = new ArrayList<Celular>();

	@Override
	public void guardar(Celular celular) {
		lista.add(celular);
	}

	@Override
	public void editar(int indice, Celular celular) {
		lista.set(indice, celular);
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
	}

	@Override
	public Celular buscar(int indice) {
		Celular cel = lista.get(indice);
		return cel;
	}

	@Override
	public void mostrar() {
		System.out.println(lista);
	}
	
	public void contar()
	{//List<Sopa> lista = new ArrayList<Sopa>();
		int contador = lista.size();
		System.out.println("La lista tiene "+contador+" sopas");
	}
	
	public void buscarNombre(Celular celular)
	{
		for(Celular s : lista)
		{
			if(s.getNombre().equals(celular.getNombre()))
			{
				System.out.println("Celular encontrada->"+s);
				break;
			}
		}
	}

	public void clear() {
		lista.remove(0);
		
	}

}
