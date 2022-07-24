import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodo{

		List<Influencer> lista = new ArrayList<Influencer>();

		@Override
		public void guardar(Influencer influencer) {
			// 
			lista.add(influencer);
			
		}

		@Override
		public void editar(int indice, Influencer influencer) {
			// 
			lista.set(indice, influencer);
		}

		@Override
		public void eliminar(int indice) {
			// 
			lista.remove(indice);
		}

		@Override
		public Influencer buscar(int indice) {
			Influencer b = lista.get(indice);
			return b;
		}

		@Override
		public void mostrar() {
			// 
			System.out.println(lista);
		}
}
