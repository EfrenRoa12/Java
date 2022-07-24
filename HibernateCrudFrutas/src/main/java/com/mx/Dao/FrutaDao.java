package com.mx.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mx.Entidad.Fruta;
import com.mx.General.Metodos;

public class FrutaDao implements Metodos {
	// CARGA DE LOS OBJETOS DEL PERSISTENCE
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");
	// CARGA DEL JPA em es ENTIDADMANAGER
	EntityManager em = emf.createEntityManager();

	@Override
	public String guardar(Fruta fruta) {
		em.getTransaction().begin();
		String r = null;
		try {
			em.persist(fruta);
			em.getTransaction().commit();// SIGNIFICA QUE VAMOS A CONFIRMAR LA TRANSACCION CON COMMIT SI SE GENERA BIEN
			System.out.println("se guardo el objeto " + fruta);// concat
			r = "1";// ES PARA CONFIRMAR QUE SE HIZO EL RESULTADO

		} catch (Exception e) {
			System.out.println("Error al guardar " + e);
			em.getTransaction().rollback();// SI NO SALE BUEN LA TRANSACCION DESHACE LA OPERACION CON ROLLBACK

		}
		return r;
	}

	@Override
	public String eliminar(Fruta fruta) {
		em.getTransaction().begin();
		String r = null;
		try {
			// A FRUTA VA A SER IGUAL A EM FIND VA A ENCONTRAR FRUTA LA CLASE Y CLASS
			fruta = em.find(Fruta.class, fruta.getId());// BUSCA POR PRIMARY KEYQUE ES EL ID FRYTA.CLASS REPRESENTA LA
														// ENTIDAD FRUTA EN LA BASE
			em.remove(fruta);// ELIMINAOS EL OBJETO FRUTA
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
	public String editar(Fruta fruta) {
		em.getTransaction().begin();
		String r = null;
		try {

			em.merge(fruta);// FUNCION PARA EDITAR EL HIBERNET
			em.getTransaction().commit();// SIGNIFICA QUE VAMOS A CONFIRMAR LA TRANSACCION CON COMMIT SI SE GENERA BIEN
											// LA TRANSACCION
			System.out.println("se edito -->" + fruta);
			r = "1";// ES PARA CONFIRMAR QUE SE HIZO EL RESULTADO

		} catch (Exception e) {
			System.out.println("Error al editar " + e);
			em.getTransaction().rollback();// SI NO SALE BUEN LA TRANSACCION DESHACE LA OPERACION CON ROLLBACK
			r = e.getMessage();// PARA QUE LANCE EL MENSAJE DE EDITAR
		}
		return r;
	}

	@Override
	public Fruta buscar(Fruta fruta) {
		fruta = em.find(Fruta.class, fruta.getId());// busque de clase fruta id
		// CUAMDO LO ENCUENTRE QUE REGRESE EL OBJETO FRUTA
		return fruta;
	}

	@Override
	public List<Fruta> listar() {
		// OBTENEMOS EL RESULTADO DE LA LISTA
		List<Fruta> lista = em.createQuery("from Fruta order by id").getResultList();
		return lista;
	}

}
