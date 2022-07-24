package com.mx.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.Dao.PaisDao;
import com.mx.Entidad.Pais;
import com.mx.General.Estatus;

@Path("PaisWS")
public class PaisWS {
	PaisDao dao = null;
	Estatus es = null;
	//http://localhost:9002/CrudPaisEstado/crudPaisEstado/PaisWS/listar
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public List<Pais> Listar() {
		
		dao = new PaisDao();
		List<Pais> lista = dao.listar();
		System.out.println("lista-->" + lista);
		
		return lista;
	}// cierra listar

	
	
	//http://localhost:9002/CrudPaisEstado/crudPaisEstado/PaisWS/guardar
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus guardar(Pais pais) {
		
		dao = new PaisDao();
		es=new Estatus();
		es.setObj(pais);
		String resp=dao.guardar(pais);
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

	public Estatus eliminar(Pais pais) {
		
		dao = new PaisDao();
		es=new Estatus();
		es.setObj(pais);
		String resp=dao.eliminar(pais);
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

	public Pais buscar(Pais pais) {
		
		dao = new PaisDao();
		pais = dao.buscar(pais);
		return pais;
	}// cierra eliminar
	
	//http://localhost:9002/CrudPaisEstado/crudPaisEstado/PaisWS/editar
	
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus editar(Pais pais) {
		dao = new PaisDao();
		es = new Estatus();
		es.setObj(pais);
		
		String resp = dao.editarr(pais);
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