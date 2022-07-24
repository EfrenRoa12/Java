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
	CelularDao dao = null;
	Estatus es = null;
	//http://localhost:9002/MarcaCelulares/marcaCelulares/CelularWS/listar
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public List<Celular> Listar() {
		
		dao = new CelularDao();
		List<Celular> lista = dao.listar();
		System.out.println("lista-->" + lista);
		
		return lista;
	}// cierra listar

	
	//http://localhost:9002/MarcaCelulares/marcaCelulares/CelularWS/guardar
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus guardar(Celular celular) {
		
		dao = new CelularDao();
		es=new Estatus();
		es.setObj(celular);
		String resp=dao.guardar(celular);
		if(resp.equals("1")) {
			es.setMensaje("guardado");
			es.setRespuesta(resp);
		}else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}
		return es;
	}// cierra guardar
	
	
	//http://localhost:9002/MarcaCelulares/marcaCelulares/CelularWS/eliminar
	
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus eliminar(Celular celular) {
		
		dao = new CelularDao();
		es=new Estatus();
		es.setObj(celular);
		String resp=dao.eliminar(celular);
		if(resp.equals("1")) {
			es.setMensaje("eliminado");
			es.setRespuesta(resp);
		}else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}
		return es;
	}// cierra eliminar
	
	//http://localhost:9002/MarcaCelulares/marcaCelulares/CelularWS/buscar
	
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Celular buscar(Celular celular) {
		
		dao = new CelularDao();
		celular = dao.buscar(celular);
		return celular;
	}// cierra eliminar
	
	//http://localhost:9002/MarcaCelulares/marcaCelulares/CelularWS/editar
	
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus editar(Celular celular) {
		dao = new CelularDao();
		es = new Estatus();
		es.setObj(celular);
		
		String resp = dao.editar(celular);
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
