package Implementacion;

import java.util.HashMap;

import Entidad.Disco;
import General.Metodo;

public class ImpDisco implements Metodo {
	HashMap<String, Disco> hash = new HashMap<String, Disco>();
	Disco disco = null;

	@Override
	public void guardar(Object obj) {
		disco = (Disco) obj;
		hash.put(disco.getTitulo_disco(), disco);
	}

	@Override
	public void editar(Object obj) {
		disco = (Disco) obj;
		hash.put(disco.getTitulo_disco(), disco);

	}

	@Override
	public void eliminar(Object obj) {
		disco = (Disco) obj;
		hash.remove(disco.getTitulo_disco());
	}

	@Override
	public Object buscar(Object obj) {
		disco = (Disco) obj;
		return hash.get(disco.getTitulo_disco());
	}

	@Override
	public void mostrar() {
		System.out.println(hash);

	}

}
