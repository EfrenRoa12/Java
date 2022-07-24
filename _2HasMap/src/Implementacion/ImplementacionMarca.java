package Implementacion;

import java.util.HashMap;

import Entidad.Marca;
import General.Metodos;

public class ImplementacionMarca implements Metodos{
	//LLAMAMOS LA COLECCION DE HASH
	HashMap<String, Marca> hash = new HashMap<String, Marca>();
	Marca marca = null;
	
	
	@Override
	public void guardar(Object obj) {
		marca = (Marca) obj;
		//para agregarle elementos, use el put()
		hash.put(marca.getNombre_marca(),marca);
		
	}

	@Override
	public void editar(Object obj) {
		marca = (Marca) obj;
		//para agregarle elementos, use el put()---EDITAMOS
		hash.put(marca.getNombre_marca(),marca);
		
	}

	@Override
	public void eliminar(Object obj) {
		marca = (Marca) obj;
		// Para eliminar un elemento, utilice el remove()
		hash.remove(marca.getNombre_marca());
	}

	@Override
	public Object buscar(Object obj) {
		marca = (Marca) obj;
		return hash.put(marca.getNombre_marca(),marca);
	}

	@Override
	public void mostrar() {
		System.out.println(hash);
		
	}

}
