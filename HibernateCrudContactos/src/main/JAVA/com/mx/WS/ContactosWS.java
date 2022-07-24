package com.mx.WS;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.Dao.ContactosDao;
import com.mx.Entidad.Contactos;
import com.mx.General.Estatus;

@Path("ContactosWS")
public class ContactosWS {
	Estatus es = null;
	ContactosDao dao = null;

//http://localhost:9002/HibernateCrudContactos/hibernateCrudContactos/ContactosWS/listar
	// CREAMOS EL LISTAR
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public List<Contactos> Listar() {

		dao = new ContactosDao();
		List<Contactos> lista=dao.listar();// INVOCAMOS AL METODO DE LISTAR
		System.out.println("lista--->"+lista);
		return lista;
	}

	//
	// CREAMOS EL GUARDAR
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus guardar(Contactos contacto) {

		dao = new ContactosDao();
		es = new Estatus();
		es.setObj(contacto);
		String resp = dao.guardar(contacto);

		if (resp.equals("1")) {

			es.setMensaje("guardado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	//

	// CREAMOS ELIMINAR
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus eliminar(Contactos contacto) {

		dao = new ContactosDao();
		es = new Estatus();
		es.setObj(contacto);
		String resp = dao.eliminar(contacto);
		if (resp.equals("1")) {

			es.setMensaje("eliminado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	//
	// CREAMOS EDITAR
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus editar(Contactos contacto) {

		dao = new ContactosDao();
		es = new Estatus();
		es.setObj(contacto);
		String resp = dao.editar(contacto);
		if (resp.equals("1")) {

			es.setMensaje("editado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	//
	// CREAMOS BUSCAR
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Contactos buscar(Contactos contacto) {

		dao = new ContactosDao();

		contacto = dao.buscar(contacto);

		return contacto;
	}
}
