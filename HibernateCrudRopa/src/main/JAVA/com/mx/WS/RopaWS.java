package com.mx.WS;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.Dao.RopaDao;
import com.mx.Entidad.Ropa;
import com.mx.General.Estatus;

@Path("RopaWS")
public class RopaWS {
	Estatus es = null;
	RopaDao dao = null;

	// http://localhost:9002/HibernateCrudRopa/hibernateCrudRopa/RopaWS/listar
	// CREAMOS EL LISTAR
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public List<Ropa> Listar() {

		dao = new RopaDao();
		List<Ropa> lista = dao.listar();// INVOCAMOS AL METODO DE LISTAR
		System.out.println("lista--->" + lista);
		return lista;
	}

	// http://localhost:9002/HibernateCrudRopa/hibernateCrudRopa/RopaWS/guardar
	// CREAMOS EL GUARDAR
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus guardar(Ropa ropa) {

		dao = new RopaDao();
		es = new Estatus();
		es.setObj(ropa);
		String resp = dao.guardar(ropa);

		if (resp.equals("1")) {

			es.setMensaje("guardado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	// http://localhost:9002/HibernateCrudRopa/hibernateCrudRopa/RopaWS/eliminar

	// CREAMOS ELIMINAR
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus eliminar(Ropa ropa) {

		dao = new RopaDao();
		es = new Estatus();
		es.setObj(ropa);
		String resp = dao.eliminar(ropa);
		if (resp.equals("1")) {

			es.setMensaje("eliminado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	// http://localhost:9002/HibernateCrudRopa/hibernateCrudRopa/RopaWS/editar
	// CREAMOS EDITAR
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus editar(Ropa ropa) {

		dao = new RopaDao();
		es = new Estatus();
		es.setObj(ropa);
		String resp = dao.editar(ropa);
		if (resp.equals("1")) {

			es.setMensaje("editado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	// http://localhost:9002/HibernateCrudRopa/hibernateCrudRopa/RopaWS/buscar
	// CREAMOS BUSCAR
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Ropa buscar(Ropa ropa) {

		dao = new RopaDao();

		ropa = dao.buscar(ropa);

		return ropa;
	}
}
