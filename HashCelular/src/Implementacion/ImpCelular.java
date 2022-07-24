package Implementacion;

import java.util.HashMap;
import java.util.Map;

import Entidad.Celular;
import Entidad.Marca;
import General.Metodos;

public class ImpCelular implements Metodos{
	HashMap<String, Celular> hash = new HashMap<String, Celular>();
	Celular celular = null;
	@Override
	public void guardar(Object obj) {
		celular = (Celular) obj;
		hash.put(celular.getModelo(), celular);
		
	}
	@Override
	public void editar(Object obj) {
		celular = (Celular) obj;
		hash.put(celular.getModelo(), celular);
		
	}
	@Override
	public void eliminar(Object obj) {
		celular = (Celular) obj;
		hash.remove(celular.getModelo());
		
	}
	@Override
	public Object buscar(Object obj) {
		celular = (Celular) obj;
		return hash.get(celular.getModelo());
	}
	@Override
	public void mostrar() {
		System.out.println(hash);
		
	}
	public void buscarCelularPorMarca(Marca marca) {// CREAREMOS UN METODO QUE SE LLAMA buscarAlumnosProfesor--importamos la clase profesor que esta ENTIDAD
		//VA A BUSCAR EL HASHMAP POR MEDIO DE FOR 
		//entryset--ES EL OBJETO QUE VA A RECORRER
		for (Map.Entry<String, Celular> a : hash.entrySet()) {//
			//VA VIENDO SI SE ENCUANTRA O NO
//  getProfesor SI EL VALOR QUE TIENE ES DEL PROFESOR VA A SER IGUAL  equals A LOQUE ES PROFE.GET MATRICULA
			if (a.getValue().getMarca().getNombre_marca().equals(marca.getNombre_marca())) {
				//EL RESULTADO QUE NOS MUESTRA ES
				System.out.println("Celular Asigando->" + a);//imprimimos lo que tiene el onjeto a
			}
		} // cierra for
	}// cierra clase
}
