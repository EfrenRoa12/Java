package Implementacion;

import java.util.HashMap;
import java.util.Map;

import Entidad.Cantante;
import Entidad.Disco;
import General.Metodo;

public class ImpCantante implements Metodo {//AGREGAMOS LA IMPLEMENTACION Metodo
	
	HashMap<String, Cantante> hash = new HashMap<String, Cantante>();
	Cantante canta = null;
	@Override
	public void guardar(Object obj) {
		canta = (Cantante) obj;
		hash.put(canta.getNombre_cantante(), canta);
		
	}
	@Override
	public void editar(Object obj) {
		canta = (Cantante) obj;
		hash.put(canta.getNombre_cantante(), canta);
		
	}
	@Override
	public void eliminar(Object obj) {
		canta = (Cantante) obj;
		hash.remove(canta.getNombre_cantante(), canta);
	}
	@Override
	public Object buscar(Object obj) {
		canta = (Cantante) obj;
		return hash.get(canta.getNombre_cantante());
	}
	@Override
	public void mostrar() {
		System.out.println(hash);
		
	}
	public void buscarCantantePorDisco(Disco discp) {// CREAREMOS UN METODO QUE SE LLAMA buscarAlumnosProfesor--importamos la clase profesor que esta ENTIDAD
		//VA A BUSCAR EL HASHMAP POR MEDIO DE FOR 
		//entryset--ES EL OBJETO QUE VA A RECORRER
		for (Map.Entry<String, Cantante> a : hash.entrySet()) {//
			//VA VIENDO SI SE ENCUANTRA O NO
			//  getDisco SI EL VALOR QUE TIENE ES DEL Disco VA A SER IGUAL  equals A LOQUE ES disco.GET TITULO DEL DISCO
			if (a.getValue().getDisco().getTitulo_disco().equals(discp.getTitulo_disco()));
				//EL RESULTADO QUE NOS MUESTRA ES
				System.out.println("Cantante Asigando->" + a);//imprimimos lo que tiene el onjeto a
			
		} // CIERRA FOR
	}// CIERRA CLASE
}

