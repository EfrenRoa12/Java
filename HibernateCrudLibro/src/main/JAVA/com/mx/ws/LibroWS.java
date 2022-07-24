package com.mx.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.dao.LibroDao;
import com.mx.entidad.Libro;
import com.mx.general.Estatus;

@Path("LibroWS")
public class LibroWS {
	Estatus es = null;
	LibroDao dao = null;

	// http://localhost:9002/HibernateCrudLibro/hibernateCrudLibro/LibroWS/listar
	// CREAMOS EL LISTAR
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	// DECLARAMOS EL METODO
	public List<Libro> Listar() {

		dao = new LibroDao();
		List<Libro> lista = dao.listar();// INVOCAMOS AL METODO DE LISTAR
		System.out.println("lista--->" + lista);
		return lista;
	}

	// http://localhost:9002/HibernateCrudLibro/hibernateCrudLibro/LibroWS/guardar
	// CREAMOS EL GUARDAR
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus guardar(Libro libro) {

		dao = new LibroDao();
		es = new Estatus();
		es.setObj(libro);
		String resp = dao.guardar(libro);

		if (resp.equals("1")) {

			es.setMensaje("guardado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	// http://localhost:9002/HibernateCrudLibro/hibernateCrudLibro/LibroWS/eliminar
	// CREAMOS ELIMINAR
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus eliminar(Libro libro) {

		dao = new LibroDao();
		es = new Estatus();
		es.setObj(libro);
		String resp = dao.eliminar(libro);
		if (resp.equals("1")) {

			es.setMensaje("eliminado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	// http://localhost:9002/HibernateCrudLibro/hibernateCrudLibro/LibroWS/editar
	// CREAMOS EDITAR
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus editar(Libro libro) {

		dao = new LibroDao();
		es = new Estatus();
		es.setObj(libro);
		String resp = dao.editar(libro);
		if (resp.equals("1")) {

			es.setMensaje("editado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}
	// http://localhost:9002/HibernateCrudLibro/hibernateCrudLibro/LibroWS/buscar

	// CREAMOS BUSCAR
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Libro buscar(Libro libro) {

		dao = new LibroDao();

		libro = dao.buscar(libro);

		return libro;
	}
}
