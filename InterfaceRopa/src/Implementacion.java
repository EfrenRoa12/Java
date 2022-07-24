import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodo {
	List<Ropa> lista = new ArrayList<Ropa>();

	@Override
	public void guardar(Ropa ropa) {
		// TODO Auto-generated method stub
		lista.add(ropa);
	}

	@Override
	public void editar(int index, Ropa ropa) {
		// TODO Auto-generated method stub
		lista.set(index, ropa);
	}

	@Override
	public void eliminar(int index) {
		// TODO Auto-generated method stub
		lista.remove(index);
	}

	@Override
	public Ropa buscar(int index) {
		Ropa ropa = lista.get(index);
		return ropa;
	}
	@Override
	public void mostrar() {
		System.out.println(lista);
	}
	
	public void contar()
	{
		int contador = lista.size();
		System.out.println("La lista tiene "+contador+" ropas");
	}
	
	public void buscarNombre(Ropa ropa)
	{
		for(Ropa s : lista)
		{
			if(s.getNombre().equals(ropa.getNombre()))
			{
				System.out.println("Ropa encontrada->"+s);
				break;
			}
		}
	}
}
