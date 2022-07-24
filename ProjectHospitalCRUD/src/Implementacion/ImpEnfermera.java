package Implementacion;

import java.util.HashMap;
import java.util.Map;

import Entidad.Enfermera;
import Entidad.PersonalHospital;

import General.Metodo;

public class ImpEnfermera implements Metodo{
//lo realizaremos con el metodo hash
	HashMap<String, Enfermera> hash = new HashMap<String, Enfermera>();
	//LO INSTANCIAMOS CON LA ENFERMERA PARA QUE PUEDA EJECUTAR LAS ACCONES
	Enfermera enfermera = null;
	@Override
	public void registrar(Object obj) {
		
	}

	@Override
	public void guardar(Object obj) {
		enfermera =(Enfermera)obj;
		hash.put(enfermera.getNombre(), enfermera);
	}

	@Override
	public void editar(Object obj) {
		enfermera =(Enfermera)obj;
		hash.put(enfermera.getNombre(), enfermera);
	}

	@Override
	public void eliminar(Object obj) {
		enfermera =(Enfermera)obj;
		hash.remove(enfermera.getNombre());
	}

	@Override
	public Object buscar(Object obj) {
		enfermera =(Enfermera)obj;
		return hash.get(enfermera.getNombre());
	}

	@Override
	public void mostrar() {
		System.out.println(hash);
	}
	public void buscarEnfermeraPorPersonalHospitalNombre(PersonalHospital PersonalHospital) {// CREAREMOS UN METODO QUE SE LLAMA buscarAlumnosProfesor--importamos la clase profesor que esta ENTIDAD
		//VA A BUSCAR EL HASHMAP POR MEDIO DE FOR 
		//entryset--ES EL OBJETO QUE VA A RECORRER
		for (Map.Entry<String, Enfermera> a : hash.entrySet()) {//
			//VA VIENDO SI SE ENCUANTRA O NO
//  getProfesor SI EL VALOR QUE TIENE ES DEL PROFESOR VA A SER IGUAL  equals A LOQUE ES PROFE.GET MATRICULA
			if (a.getValue().getPersonalHospital().getNombre().equals(PersonalHospital.getNombre())) {
				//EL RESULTADO QUE NOS MUESTRA ES
				System.out.println("Enfermera Asigando->" + a);//imprimimos lo que tiene el onjeto a
			}
		} // cierra for
	}// cierra clase

	@Override
	public Enfermera buscar(int index) {
		Enfermera enfermera = hash.get(index);
		return enfermera;
	}

}
