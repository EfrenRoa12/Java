import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {

	List<Sopa> lista = new ArrayList<Sopa>();

	@Override
	public void guardar(Sopa sopa) {
		lista.add(sopa);
	}
	@Override
	public void editar(int index, Sopa sopa) {
		lista.set(index, sopa);
	}
	@Override
	public void eliminar(int index) {
		lista.remove(index);
	}
	@Override
	public Sopa buscar(int index) {
		Sopa sopa = lista.get(index);
		return sopa;
	}
	@Override
	public void mostrar() {
		System.out.println(lista);
	}
	
	public void contar()
	{//List<Sopa> lista = new ArrayList<Sopa>();
		int contador = lista.size();
		System.out.println("La lista tiene "+contador+" sopas");
	}
	
	public void buscarNombre(Sopa sopa)
	{
		for(Sopa s : lista)
		{
			if(s.getNombre().equals(sopa.getNombre()))
			{
				System.out.println("Sopa encontrada->"+s);
				break;
			}
		}
	}
}
