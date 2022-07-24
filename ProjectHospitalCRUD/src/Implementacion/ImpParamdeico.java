package Implementacion;

import java.util.HashMap;
import java.util.Map;

import Entidad.Enfermera;
import Entidad.Paramedico;
import Entidad.PersonalHospital;
import General.Metodo;

public class ImpParamdeico implements Metodo{
	//lo realizaremos con el metodo hash
		HashMap<String, Paramedico> hash = new HashMap<String, Paramedico>();
		//LO INSTANCIAMOS CON LA ENFERMERA PARA QUE PUEDA EJECUTAR LAS ACCONES
		Paramedico paramedico = null;
		@Override
		public void guardar(Object obj) {
			paramedico =(Paramedico)obj;
			hash.put(paramedico.getNombre(), paramedico);
		}
		@Override
		public void editar(Object obj) {
			paramedico =(Paramedico)obj;
			hash.put(paramedico.getNombre(), paramedico);
		}
		@Override
		public void eliminar(Object obj) {
			paramedico =(Paramedico)obj;
			hash.remove(paramedico.getNombre());
		}
		@Override
		public Object buscar(Object obj) {
			paramedico =(Paramedico)obj;
			return hash.get(paramedico.getNombre());
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
		public void buscarAlumnosProfesor(PersonalHospital PersonalHospital) {// CREAREMOS UN METODO QUE SE LLAMA buscarAlumnosProfesor--importamos la clase profesor que esta ENTIDAD
			//VA A BUSCAR EL HASHMAP POR MEDIO DE FOR 
			//entryset--ES EL OBJETO QUE VA A RECORRER
			for (Map.Entry<String, Paramedico> a : hash.entrySet()) {//
				//VA VIENDO SI SE ENCUANTRA O NO
	//  getProfesor SI EL VALOR QUE TIENE ES DEL PROFESOR VA A SER IGUAL  equals A LOQUE ES PROFE.GET MATRICULA
				if (a.getValue().getPersonalHospital().getNombre().equals(PersonalHospital.getNombre())) {
					//EL RESULTADO QUE NOS MUESTRA ES
					System.out.println("Paramedico Asigando->" + a);//imprimimos lo que tiene el onjeto a
				}
			} // cierra for
		}// cierra clase
}
