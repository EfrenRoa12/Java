import java.util.ArrayList;
import java.util.List;

public class ImplementacionG implements Metodos{
	List<Alumno> lista = new ArrayList<Alumno>();

	@Override
	public void guardar(Alumno alumno) {
		// TODO Auto-generated method stub
		lista.add(alumno);
	}

	@Override
	public void editar(int index, Alumno alumno) {
		lista.set(index, alumno);
		
	}

	@Override
	public void eliminar(int index){
		lista.remove(index);
		
	}

	@Override
	public Alumno buscar(int index) {
		
		return lista.get(index);
	}

	@Override
	public void mostrar() {
		System.out.println(lista);
		
	}




}
