import java.util.HashMap;
import java.util.Map;

public class ImpMT implements Metodos {// voy a ocupar la interface metodo --apoyarME DE INTERFACE METODOS Y LOS USARE
	// INSTANCIAMOS PRIMERO PARA DECIRLE UN HASMAP --> INSTANCIO MI HASMAP CON
	// CADENA ---
	HashMap<String, MedioTransporte> hash = new HashMap<String, MedioTransporte>();
	// INICIAMLIZO MI HASMAP PARA EDITAR BUSCAR ETC.
	MedioTransporte mt = null;

	@Override
	public void guardar(Object obj) {
		// MedioTransporte es la implementacion que vamos a darle si fuera ropa u otro
		// objeto simplemente le damos implementacion otra clase
		// y lo mismp --ESTO ES CASTEAR
		mt = (MedioTransporte) obj;
		// put es AGREGAR IR PONIENDO A LA COLECCION--UTILIZANDO HASH OBJETO QUE TIENE
		// PARAMETRO MedioTransporte
		hash.put(mt.getNombre(), mt);
	}

	@Override
	public void editar(Object obj) {
		//
		mt = (MedioTransporte) obj;
		hash.put(mt.getNombre(), mt);
	}

	@Override
	public void eliminar(Object obj) {
		//
		mt = (MedioTransporte) obj;
		// UTILIZAMOS REMOVE PARA ELIMINAR--PORQUE NOMBRE PORQUE ES LA KEY---QUE ELIMINE
		// EL NOMBRE
		hash.remove(mt.getNombre());
	}

	@Override
	public Object buscar(Object obj) {
		// CASTEAMOS
		mt = (MedioTransporte) obj;
		//
		return hash.get(mt.getNombre());
	}

	// MUESTRA TODOS LOS ELEMENTOS QUE TENEMOS EN EL HASH
	@Override
	public void mostrar(Object obj) {
		//

	}

//
	public void contar() {
		// SIZE ES PARA IMPRIMIR EL TOTAL DE ELEMENTOS QUE TIENE NUESTRA BUSQUEDA
		System.out.println("el hash tiene " + hash.size() + " medios de transporte");
	}

	// EN VOID SOLO EJECUTA Y LISTO
	public void eliminarTodo() {
		// funcion elimiar todos los elementos
		hash.clear();
		System.out.println("se eliminaron todos los medios de transporte");
	}

	// EN VOID SOLO EJECUTA Y LISTO
	public void vaciar() {
		// funcion elimiar todos los elementos
		if (hash.isEmpty()) {
			System.out.println("hash vacio");
		} else {
			System.out.println("el hash no esta vacio, tiene " + hash.size() + " medios de transporte");
		} // cierre else
	}// cierra vaciar

	// EN VOID SOLO EJECUTA Y LISTO
	public void buscarTipo(Object obj) {
		//CASTEAMOS
		mt = (MedioTransporte) obj;
		//RECORRER EL HASH--->LLEVANDO LA LLAVE Y DE QUE TIPO ES
		for (Map.Entry<String, MedioTransporte> h : hash.entrySet()) {
			//UNA VEZ OBTENGO EL VALOR--OBTENGO EL TIPO--SI TENGO EL TIPO = AL TIPO OBJETO ENTONCES 
			if (h.getValue().getTipo().equals(mt.getTipo())) {
				System.out.println("medios de transporte encontrado ");
			}
		}
	}// cierra FOR
}
