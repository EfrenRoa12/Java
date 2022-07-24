package Implementacion;

import java.util.HashMap;
import java.util.Map;

import Entidad.Alumno;
import Entidad.Profesor;
import General.Metodos;

public class ImpAlumnos implements Metodos {

	HashMap<String, Alumno> hash = new HashMap<String, Alumno>();
	Alumno alu = null;//instanciamos el alumno

	@Override
	public void guardar(Object obj) {
		alu = (Alumno) obj;
		hash.put(alu.getMatricula(), alu);
	}

	@Override
	public void editar(Object obj) {
		alu = (Alumno) obj;
		hash.put(alu.getMatricula(), alu);
	}

	@Override
	public void eliminar(Object obj) {
		alu = (Alumno) obj;
		hash.remove(alu.getMatricula());
	}

	@Override
	public Object buscar(Object obj) {
		alu = (Alumno) obj;
		return hash.get(alu.getMatricula());
	}

	@Override
	public void mostrar() {
		System.out.println(hash);
	}

	public void buscarAlumnosProfesor(Profesor profe) {// CREAREMOS UN METODO QUE SE LLAMA buscarAlumnosProfesor--importamos la clase profesor que esta ENTIDAD
		//VA A BUSCAR EL HASHMAP POR MEDIO DE FOR 
		//entryset--ES EL OBJETO QUE VA A RECORRER
		for (Map.Entry<String, Alumno> a : hash.entrySet()) {//
			//VA VIENDO SI SE ENCUANTRA O NO
//  getProfesor SI EL VALOR QUE TIENE ES DEL PROFESOR VA A SER IGUAL  equals A LOQUE ES PROFE.GET MATRICULA
			if (a.getValue().getProfesor().getMatricula().equals(profe.getMatricula())) {
				//EL RESULTADO QUE NOS MUESTRA ES
				System.out.println("Alumno Asigando->" + a);//imprimimos lo que tiene el onjeto a
			}
		} // cierra for
	}// cierra clase
}