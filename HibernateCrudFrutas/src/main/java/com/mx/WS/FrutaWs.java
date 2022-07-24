package com.mx.WS;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.Dao.FrutaDao;
import com.mx.Entidad.Fruta;
import com.mx.General.Estatus;

@Path("FrutaWs")
public class FrutaWs {

	Estatus es = null;
	FrutaDao dao = null;

	// http://localhost:9002/HibernateCrudFrutas/hibernateCrudFrutas/FrutaWs/listar
	// CREAMOS EL LISTAR
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public List<Fruta> Listar() {

		dao = new FrutaDao();
		List<Fruta> lista = dao.listar();// INVOCAMOS AL METODO DE LISTAR
		System.out.println("lista--->" + lista);
		return lista;
	}

	// http://localhost:9002/HibernateCrudFrutas/hibernateCrudFrutas/FrutaWs/guardar
	// CREAMOS EL GUARDAR
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus guardar(Fruta fruta) {

		dao = new FrutaDao();
		es = new Estatus();
		es.setObj(fruta);
		String resp = dao.guardar(fruta);

		if (resp.equals("1")) {

			es.setMensaje("guardado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	// http://localhost:9002/HibernateCrudFrutas/hibernateCrudFrutas/FrutaWs/eliminar

	// CREAMOS ELIMINAR
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus eliminar(Fruta fruta) {

		dao = new FrutaDao();
		es = new Estatus();
		es.setObj(fruta);
		String resp = dao.eliminar(fruta);
		if (resp.equals("1")) {

			es.setMensaje("eliminado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	// http://localhost:9002/HibernateCrudFrutas/hibernateCrudFrutas/FrutaWs/editar
	// CREAMOS EDITAR
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus editar(Fruta fruta) {

		dao = new FrutaDao();
		es = new Estatus();
		es.setObj(fruta);
		String resp = dao.editar(fruta);
		if (resp.equals("1")) {

			es.setMensaje("editado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	// http://localhost:9002/HibernateCrudFrutas/hibernateCrudFrutas/FrutaWs/buscar
	// CREAMOS BUSCAR
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Fruta buscar(Fruta fruta) {

		dao = new FrutaDao();

		fruta = dao.buscar(fruta);

		return fruta;
	}

}
