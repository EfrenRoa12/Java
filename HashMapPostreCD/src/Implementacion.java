import java.util.HashMap;

public class Implementacion implements Metodos{
	//implementamos en hashmap
	//llave nombre tipo string a que dato va a mapear
	
		HashMap<String, Postre> hash = new HashMap<String,Postre>();
	
	@Override
	public void guardar(Postre postre) {
		// 
		hash.put(postre.getNombre(),postre);//GETNombe lo obtiene de la clase postre-como si lo instanciara
	}

	@Override
	public void editar(Postre postre) {
		// lo edita automaticamente con el hash lo reconoce ya lo tengo lo edito
		hash.put(postre.getNombre(),postre);
	}

	@Override
	public void eliminar(Postre postre) {
		// en lugar de elinar por indice por nombre mejor
		hash.remove(postre.getNombre());
	}

	@Override
	public Postre buscar(Postre postre) {
		//obtenemos la llave que es el nombre
		return hash.get(postre.getNombre());
	}

	@Override
	public void mostrar() {
		//mostramos la lista--lo muestra
		System.out.println(hash);
		
	}
	
}
