import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Implementacion implements Metodo{//
	HashMap<String, MediosTransporte> hash = new HashMap<String, MediosTransporte>();
	
	@Override
	public void guardar(MediosTransporte transporte) {
		hash.put(transporte.getNombre(), transporte);
		
	}

	@Override
	public void editar(int index, MediosTransporte transporte) {
		hash.put(transporte.getNombre(),transporte);
		
	}
	//METODO PARA ELIMNINAR
	@Override
	public void eliminar(int index) {
		hash.remove(index);
		
	}
	@Override
	public MediosTransporte buscar(int index) {
		MediosTransporte transporte = hash.get(index);
		return transporte;
	}
	//VIENE DE LA IMPLEMENTACION MOSTRAR
	@Override
	public void mostrar() {
		System.out.println(hash);
		
	}
}
