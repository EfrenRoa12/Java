package com.mx.WS;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.dao.PerroDao;

import Entidad.Perro;
import General.Estatus;
@Path("Perrows")
public class Perrows {
		PerroDao dao = null;
		Estatus es = null;

		//http://localhost:9002/CrudPerroMavens/crudPerroMavens/Perrows/listar
		@Path("listar")
		@GET
		@Consumes({ MediaType.APPLICATION_JSON })
		@Produces({ MediaType.APPLICATION_JSON })

		public List<Perro> Listar() {
			dao = new PerroDao();
			List<Perro> lista = dao.listar();
			System.out.println("lista-->" + lista);
			return lista;
		}// cierra listar

		@Path("buscar")
		@POST
		@Consumes({ MediaType.APPLICATION_JSON })
		@Produces({ MediaType.APPLICATION_JSON })
		public Perro buscar(Perro perro) {
			dao = new PerroDao();
			perro = dao.buscar(perro);
			return perro;

		}// cierra buscar
		//http://localhost:9002/CrudPerroMavens/crudPerroMavens/Perrows/guardadr

		@Path("guardar")
		@POST
		@Consumes({ MediaType.APPLICATION_JSON })
		@Produces({ MediaType.APPLICATION_JSON })
		public Estatus guardar(Perro perro) {
			dao = new PerroDao();
			es = new Estatus();
			es.setObj(perro);

			String resp = dao.guardar(perro);
			if (resp.equals("1")) {
				es.setMensaje("guardado");
				es.setRespuesta(resp);
			} else {

				es.setMensaje("error");
				es.setRespuesta(resp);

			}
			return es;
		}// cierra listar

		//http://localhost:9002/CrudPerroMavens/crudPerroMavens/Perrows/editar
		@Path("editar")
		@POST
		@Consumes({ MediaType.APPLICATION_JSON })
		@Produces({ MediaType.APPLICATION_JSON })

		public Estatus editar(Perro perro) {
			dao = new PerroDao();
			es = new Estatus();
			es.setObj(perro);
			
			String resp = dao.editar(perro);
			if (resp.equals("1")) {
				es.setMensaje("editar");
				es.setRespuesta(resp);
			} else {

				es.setMensaje("error");
				es.setRespuesta(resp);

			}
			return es;
		}// cierra buscar
		//http://localhost:9002/CrudPerroMavens/crudPerroMavens/Perrows/eliminar
		@Path("eliminar")
		@POST
		@Consumes({ MediaType.APPLICATION_JSON })
		@Produces({ MediaType.APPLICATION_JSON })

		public Estatus eliminar(Perro perro) {
			dao = new PerroDao();
			es = new Estatus();
			es.setObj(perro);

			String resp = dao.eliminar(perro);
			if (resp.equals("1")) {
				es.setMensaje("geliminar");
				es.setRespuesta(resp);
			} else {	

				es.setMensaje("error");
				es.setRespuesta(resp);

			}
			return es;
		}// cierra buscar
}
