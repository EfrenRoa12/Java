package com.mx.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mx.Entidad.Pokemon;
import com.mx.General.Metodos;

public class PokemonDao implements Metodos {
	// CARGA DE LOS OBJETOS DEL PERSISTENCE
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");
	// CARGA DEL JPA em es ENTIDADMANAGER
	EntityManager em = emf.createEntityManager();

	@Override
	public String guardar(Pokemon pokemon) {
		em.getTransaction().begin();
		String r=null;
		try {
			em.persist(pokemon);
			em.getTransaction().commit();// SIGNIFICA QUE VAMOS A CONFIRMAR LA TRANSACCION CON COMMIT SI SE GENERA BIEN
			System.out.println("se guardo el objeto " + pokemon);// concat
			r="1";// ES PARA CONFIRMAR QUE SE HIZO EL RESULTADO

		} catch (Exception e) {
			System.out.println("Error al guardar " + e);
			em.getTransaction().rollback();// SI NO SALE BUEN LA TRANSACCION DESHACE LA OPERACION CON ROLLBACK
			
		}
		return r;
	}

	@Override
	public String eliminar(Pokemon pokemon) {
		em.getTransaction().begin();
		String r = null;
		try {
			// A FRUTA VA A SER IGUAL A EM FIND VA A ENCONTRAR FRUTA LA CLASE Y CLASS
			pokemon = em.find(Pokemon.class, pokemon.getId());// BUSCA POR PRIMARY KEYQUE ES EL ID FRYTA.CLASS REPRESENTA LA
														// ENTIDAD FRUTA EN LA BASE
			em.remove(pokemon);// ELIMINAOS EL OBJETO FRUTA
			em.getTransaction().commit();// SIGNIFICA QUE VAMOS A CONFIRMAR LA TRANSACCION CON COMMIT SI SE GENERA BIEN
											// LA TRANSACCION

			r = "1";// ES PARA CONFIRMAR QUE SE HIZO EL RESULTADO

		} catch (Exception e) {
			System.out.println("Error al eliminar " + e);
			em.getTransaction().rollback();// SI NO SALE BUEN LA TRANSACCION DESHACE LA OPERACION CON ROLLBACK
			r = e.getMessage();// PARA QUE LANCE EL MENSAJE DE EDITAR
		}
		return r;
	}

	@Override
	public String editar(Pokemon pokemon) {
		em.getTransaction().begin();
		String r = null;
		try {

			em.merge(pokemon);// FUNCION PARA EDITAR EL HIBERNET
			em.getTransaction().commit();// SIGNIFICA QUE VAMOS A CONFIRMAR LA TRANSACCION CON COMMIT SI SE GENERA BIEN
											// LA TRANSACCION
			System.out.println("se edito -->" + pokemon);
			r = "1";// ES PARA CONFIRMAR QUE SE HIZO EL RESULTADO

		} catch (Exception e) {
			System.out.println("Error al editar " + e);
			em.getTransaction().rollback();// SI NO SALE BUEN LA TRANSACCION DESHACE LA OPERACION CON ROLLBACK
			r = e.getMessage();// PARA QUE LANCE EL MENSAJE DE EDITAR
		}
		return r;
	}

	@Override
	public Pokemon buscar(Pokemon pokemon) {
		pokemon = em.find(Pokemon.class, pokemon.getId());// busque de clase fruta id
		// CUAMDO LO ENCUENTRE QUE REGRESE EL OBJETO FRUTA
		return pokemon;
	}

	@Override
	public List<Pokemon> listar() {
		// OBTENEMOS EL RESULTADO DE LA LISTA
		List<Pokemon> lista = em.createQuery("from Pokemon order by id").getResultList();
		return lista;
	}

}
