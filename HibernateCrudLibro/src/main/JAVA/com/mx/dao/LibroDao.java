package com.mx.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mx.entidad.Libro;
import com.mx.general.Metodos;

public class LibroDao implements Metodos {
	// CARGA DE LOS OBJETOS DEL PERSISTENCE
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");
	// CARGA DEL JPA em es ENTIDADMANAGER
	EntityManager em = emf.createEntityManager();

	@Override
	public String guardar(Libro libro) {
		em.getTransaction().begin();
		String r = null;
		try {
			em.persist(libro);
			em.getTransaction().commit();// SIGNIFICA QUE VAMOS A CONFIRMAR LA TRANSACCION CON COMMIT SI SE GENERA BIEN
			System.out.println("se guardo el objeto " + libro);// concat
			r = "1";// ES PARA CONFIRMAR QUE SE HIZO EL RESULTADO

		} catch (Exception e) {
			System.out.println("Error al guardar " + e);
			em.getTransaction().rollback();// SI NO SALE BUEN LA TRANSACCION DESHACE LA OPERACION CON ROLLBACK
			r = e.getMessage();// P
		}
		return r;
	}

	@Override
	public String eliminar(Libro libro) {
		//
		em.getTransaction().begin();
		String r = null;
		try {
			// A FRUTA VA A SER IGUAL A EM FIND VA A ENCONTRAR FRUTA LA CLASE Y CLASS
			libro = em.find(Libro.class, libro.getId());// BUSCA POR PRIMARY KEYQUE ES EL ID FRYTA.CLASS REPRESENTA LA
														// ENTIDAD FRUTA EN LA BASE
			em.remove(libro);// ELIMINAOS EL OBJETO FRUTA
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
	public String editar(Libro libro) {
		em.getTransaction().begin();
		String r = null;
		try {

			em.merge(libro);// FUNCION PARA EDITAR EL HIBERNET
			em.getTransaction().commit();// SIGNIFICA QUE VAMOS A CONFIRMAR LA TRANSACCION CON COMMIT SI SE GENERA BIEN
											// LA TRANSACCION
			System.out.println("se edito -->" + libro);
			r = "1";// ES PARA CONFIRMAR QUE SE HIZO EL RESULTADO

		} catch (Exception e) {
			System.out.println("Error al editar " + e);
			em.getTransaction().rollback();// SI NO SALE BUEN LA TRANSACCION DESHACE LA OPERACION CON ROLLBACK
			r = e.getMessage();// PARA QUE LANCE EL MENSAJE DE EDITAR
		}
		return r;
	}

	@Override
	public Libro buscar(Libro libro) {
		libro = em.find(Libro.class, libro.getId());// busque de clase fruta id
		// CUAMDO LO ENCUENTRE QUE REGRESE EL OBJETO FRUTA
		return libro;
	}

	@Override
	public List<Libro> listar() {
		// OBTENEMOS EL RESULTADO DE LA LISTA
		List<Libro> lista = em.createQuery("from Libro order by id").getResultList();
		return lista;
	}

}
