package com.mx.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.dao.BibliotecaDao;
import com.mx.entidad.Biblioteca;
import com.mx.general.Estatus;

@Path("BibliotecaWS")
public class BibliotecaWS {
	Estatus es = null;
	BibliotecaDao dao = null;

//http://localhost:9002/HibernateCrudBiblos/hibernateCrudBiblos/BibliotecaWS/listar
	// CREAMOS EL LISTAR
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public List<Biblioteca> Listar() {

		dao = new BibliotecaDao();
		List<Biblioteca> lista = dao.listar();// INVOCAMOS AL METODO DE LISTAR
		System.out.println("lista--->" + lista);
		return lista;
	}


	// CREAMOS EL GUARDAR
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus guardar(Biblioteca biblioteca) {

		dao = new BibliotecaDao();
		es = new Estatus();
		es.setObj(biblioteca);
		String resp = dao.guardar(biblioteca);

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
	public Estatus eliminar(Biblioteca biblioteca) {

		dao = new BibliotecaDao();
		es = new Estatus();
		es.setObj(biblioteca);
		String resp = dao.eliminar(biblioteca);
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
	public Estatus editar(Biblioteca biblioteca) {

		dao = new BibliotecaDao();
		es = new Estatus();
		es.setObj(biblioteca);
		String resp = dao.editar(biblioteca);
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
	public Biblioteca buscar(Biblioteca biblioteca) {

		dao = new BibliotecaDao();

		biblioteca = dao.buscar(biblioteca);

		return biblioteca;
	}
}
