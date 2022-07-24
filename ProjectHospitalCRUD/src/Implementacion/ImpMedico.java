package Implementacion;

import java.util.HashMap;
import java.util.Map;

import Entidad.Enfermera;
import Entidad.Medico;
import Entidad.PersonalHospital;
import General.Metodo;

public class ImpMedico implements Metodo{
	HashMap<String, Medico> hash = new HashMap<String, Medico>();
	//LO INSTANCIAMOS CON LA ENFERMERA PARA QUE PUEDA EJECUTAR LAS ACCONES
	Medico medico = null;
	@Override
	public void guardar(Object obj) {
		medico = (Medico) medico;
		hash.put(medico.getNombre(), medico);
		
	}

	@Override
	public void editar(Object obj) {
		medico = (Medico) medico;
		hash.put(medico.getNombre(), medico);
	}

	@Override
	public void eliminar(Object obj) {
		medico = (Medico) medico;
		hash.remove(medico.getNombre());
	}

	@Override
	public Object buscar(Object obj) {
		medico = (Medico) medico;
		return hash.remove(medico.getNombre());
	}

	@Override
	public Enfermera buscar(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mostrar() {
		System.out.println(hash);
		
	}

	@Override
	public void registrar(Object obj) {
		
		
	}
	
	public void buscarMedicoPorPersonalHospitalNombre(PersonalHospital PersonalHospital) {// CREAREMOS UN METODO QUE SE LLAMA buscarAlumnosProfesor--importamos la clase profesor que esta ENTIDAD
		//VA A BUSCAR EL HASHMAP POR MEDIO DE FOR 
		//entryset--ES EL OBJETO QUE VA A RECORRER
		for (Map.Entry<String, Medico> a : hash.entrySet()) {//
			//VA VIENDO SI SE ENCUANTRA O NO
//  getProfesor SI EL VALOR QUE TIENE ES DEL PROFESOR VA A SER IGUAL  equals A LOQUE ES PROFE.GET MATRICULA
			if (a.getValue().getPersonalHospital().getNombre().equals(PersonalHospital.getNombre())) {
				//EL RESULTADO QUE NOS MUESTRA ES.ge
				System.out.println("Alumno Asigando->" + a);//imprimimos lo que tiene el onjeto a
			}
		} // cierra for
	}// cierra clase
	

}
