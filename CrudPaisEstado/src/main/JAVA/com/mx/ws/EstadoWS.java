package com.mx.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.Dao.EstadoDao;
import com.mx.Entidad.Estado;
import com.mx.General.Estatus;

@Path("EstadoWS")
public class EstadoWS {
	EstadoDao dao = null;
	Estatus es = null;
	//http://localhost:9002/CrudPaisEstado/crudPaisEstado/PaisWS/listar
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public List<Estado> Listar() {
		
		dao = new EstadoDao();
		List<Estado> lista = dao.listar();
		System.out.println("lista-->" + lista);
		
		return lista;
	}// cierra listar

	
	//http://localhost:9002/CrudPaisEstado/crudPaisEstado/PaisWS/guardar
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus guardar(Estado estado) {
		
		dao = new EstadoDao();
		es=new Estatus();
		es.setObj(estado);
		String resp=dao.guardar(estado);
		if(resp.equals("1")) {
			es.setMensaje("guardado");
			es.setRespuesta(resp);
		}else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}
		return es;
	}// cierra guardar
	
	
	//http://localhost:9002/CrudPaisEstado/crudPaisEstado/PaisWS/eliminar
	
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus eliminar(Estado estado) {
		
		dao = new EstadoDao();
		es=new Estatus();
		es.setObj(estado);
		String resp=dao.eliminar(estado);
		if(resp.equals("1")) {
			es.setMensaje("eliminado");
			es.setRespuesta(resp);
		}else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}
		return es;
	}// cierra eliminar
	
	//http://localhost:9002/CrudPaisEstado/crudPaisEstado/PaisWS/buscar
	
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estado buscar(Estado estado) {
		
		dao = new EstadoDao();
		estado = dao.buscar(estado);
		return estado;
	}// cierra eliminar
	
	//http://localhost:9002/CrudPaisEstado/crudPaisEstado/PaisWS/editar
	
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus editar(Estado estado) {
		dao = new EstadoDao();
		es = new Estatus();
		es.setObj(estado);
		
		String resp = dao.editar(estado);
		if (resp.equals("1")) {
			es.setMensaje(" editado");
			es.setRespuesta(resp);
		} else {

			es.setMensaje("error");
			es.setRespuesta(resp);

		}
		return es;
}
}
