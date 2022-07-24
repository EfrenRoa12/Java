package Implementacion;

import java.util.HashMap;

import Entidad.Alumno;
import Entidad.Profesor;
import General.Metodos;

public class ImProfesor implements Metodos{
	//implementamos en hashmap
		//llave nombre tipo string a que dato va a mapear
	HashMap<String, Profesor> hash = new HashMap<String, Profesor>();
	Profesor profe = null;
	//GETNombe lo obtiene de la clase postre-como si lo instanciara
	@Override
	public void guardar(Object obj) {
		profe = (Profesor) obj;
		hash.put(profe.getMatricula(), profe);
	}
	// lo edita automaticamente con el hash lo reconoce ya lo tengo lo edito
	@Override
	public void editar(Object obj) {
		profe = (Profesor) obj;
		hash.put(profe.getMatricula(), profe);
	}
	// en lugar de elinar por indice por nombre mejor
	@Override
	public void eliminar(Object obj) {
		profe = (Profesor) obj;
		hash.remove(profe.getMatricula());
	}
	@Override
	public Object buscar(Object obj) {
		profe = (Profesor) obj;
		return hash.get(profe.getMatricula());
	}
	//mostramos la lista--lo muestra
	@Override
	public void mostrar() {
		System.out.println(hash);
	}

}