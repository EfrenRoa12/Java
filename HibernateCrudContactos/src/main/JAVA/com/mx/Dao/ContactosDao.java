package com.mx.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mx.Entidad.Contactos;
import com.mx.General.Metodo;

public class ContactosDao implements Metodo {
	// CARGA DE LOS OBJETOS DEL PERSISTENCE
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");
	// CARGA DEL JPA em es ENTIDADMANAGER
	EntityManager em = emf.createEntityManager();

	@Override
	public String guardar(Contactos contacto) {
		em.getTransaction().begin();
		String r = null;
		try {
			em.persist(contacto);
			em.getTransaction().commit();// SIGNIFICA QUE VAMOS A CONFIRMAR LA TRANSACCION CON COMMIT SI SE GENERA BIEN
			System.out.println("se guardo el objeto " + contacto);// concat
			r = "1";// ES PARA CONFIRMAR QUE SE HIZO EL RESULTADO

		} catch (Exception e) {
			System.out.println("Error al guardar " + e);
			em.getTransaction().rollback();// SI NO SALE BUEN LA TRANSACCION DESHACE LA OPERACION CON ROLLBACK

		}
		return r;
	}

	@Override
	public String eliminar(Contactos contacto) {
		em.getTransaction().begin();
		String r = null;
		try {
			// A FRUTA VA A SER IGUAL A EM FIND VA A ENCONTRAR FRUTA LA CLASE Y CLASS
			contacto = em.find(Contactos.class, contacto.getId());// BUSCA POR PRIMARY KEYQUE ES EL ID FRYTA.CLASS
																	// REPRESENTA LA
			// ENTIDAD FRUTA EN LA BASE
			em.remove(contacto);// ELIMINAOS EL OBJETO FRUTA
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
	public String editar(Contactos contacto) {
		em.getTransaction().begin();
		String r = null;
		try {

			em.merge(contacto);// FUNCION PARA EDITAR EL HIBERNET
			em.getTransaction().commit();// SIGNIFICA QUE VAMOS A CONFIRMAR LA TRANSACCION CON COMMIT SI SE GENERA BIEN
											// LA TRANSACCION
			System.out.println("se edito -->" + contacto);
			r = "1";// ES PARA CONFIRMAR QUE SE HIZO EL RESULTADO

		} catch (Exception e) {
			System.out.println("Error al editar " + e);
			em.getTransaction().rollback();// SI NO SALE BUEN LA TRANSACCION DESHACE LA OPERACION CON ROLLBACK
			r = e.getMessage();// PARA QUE LANCE EL MENSAJE DE EDITAR
		}
		return r;
	}

	@Override
	public Contactos buscar(Contactos contacto) {
		contacto = em.find(Contactos.class, contacto.getId());// busque de clase fruta id
		// CUAMDO LO ENCUENTRE QUE REGRESE EL OBJETO FRUTA
		return contacto;
	}

	@Override
	public List<Contactos> listar() {
		// OBTENEMOS EL RESULTADO DE LA LISTA4
		// Contactos es la clase contactos
		List<Contactos> lista = em.createQuery("from Contactos order by id").getResultList();
		return lista;
	}

}
