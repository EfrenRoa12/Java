package ImplementacionG;

import java.util.HashMap;

import Entidad.Continente;
import General.Metodo;

public class ImpContinente implements Metodo {
	
	HashMap<String, Continente> hash = new HashMap<String, Continente>();
	Continente conti = null;

	@Override
	public void guardar(Object obj) {
		conti = (Continente) obj;//casteo
		hash.put(conti.getNombre(), conti);

	}

	@Override
	public void editar(Object obj) {
		conti = (Continente) obj;
		hash.put(conti.getNombre(), conti);
	}

	@Override
	public void eliminar(Object obj) {
		conti = (Continente) obj;
		hash.remove(conti.getNombre());
	}

	@Override
	public Object buscar(Object obj) {
		conti = (Continente) obj;
		
		return hash.get(conti.getNombre());
	}

	@Override
	public void mostrar() {
		System.out.println(hash);

	}

}
