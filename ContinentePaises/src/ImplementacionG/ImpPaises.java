package ImplementacionG;

import java.util.HashMap;
import java.util.Map;

import Entidad.Continente;
import Entidad.Paises;
import General.Metodo;

public class ImpPaises implements Metodo {
	HashMap<String, Paises> hash = new HashMap<String, Paises>();
	Paises pais = null;

	@Override
	public void guardar(Object obj) {
		pais = (Paises) obj;
		hash.put(pais.getNombre(), pais);

	}

	@Override
	public void editar(Object obj) {
		pais = (Paises) obj;
		hash.put(pais.getNombre(), pais);
	}

	@Override
	public void eliminar(Object obj) {
		pais = (Paises) obj;
		hash.remove(pais.getNombre(), pais);
	}

	@Override
	public Object buscar(Object obj) {
		pais = (Paises) obj;
		return hash.get(pais.getNombre());

	}

	@Override
	public void mostrar() {
		System.out.println(hash);

	}

	public void buscarPaisesPorContinente(Continente continente) {
		for (Paises a : hash.values()) {

			if (a.getContinente().getNombre().equals(continente.getNombre())) {
				System.out.println("Pais Asigando->" + a.getNombre()+" - "+a.getCapital());
			}
		} // cierra for
	}// cierra clase

}
