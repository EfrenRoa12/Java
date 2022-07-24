package com.mx.WS;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.Dao.CelularDao;
import com.mx.Entidad.Celular;
import com.mx.General.Estatus;

@Path("CelularWS")
public class CelularWS {
	Estatus es = null;
	CelularDao dao = null;
	//http://localhost:9002/HibernateCrudCelular/hibernateCrudCelular/CelularWS/listar
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public List<Celular> Listar() {

		dao = new CelularDao();
		List<Celular> lista = dao.listar();// INVOCAMOS AL METODO DE LISTAR
		System.out.println("lista--->" + lista);
		return lista;
	}


	// CREAMOS EL GUARDAR
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus guardar(Celular celular) {

		dao = new CelularDao();
		es = new Estatus();
		es.setObj(celular);
		String resp = dao.guardar(celular);

		if (resp.equals("1")) {

			es.setMensaje("guardado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}



	// CREAMOS ELIMINAR
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus eliminar(Celular celular) {

		dao = new CelularDao();
		es = new Estatus();
		es.setObj(celular);
		String resp = dao.eliminar(celular);
		if (resp.equals("1")) {

			es.setMensaje("eliminado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}


	// CREAMOS EDITAR
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus editar(Celular celular) {

		dao = new CelularDao();
		es = new Estatus();
		es.setObj(celular);
		String resp = dao.editar(celular);
		if (resp.equals("1")) {

			es.setMensaje("editado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}


	// CREAMOS BUSCAR
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Celular buscar(Celular celular) {

		dao = new CelularDao();

		celular = dao.buscar(celular);

		return celular;
	}

}
