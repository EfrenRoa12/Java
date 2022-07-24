package com.mx.WS;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.Dao.MarcaDao;
import com.mx.Entidad.Marca;
import com.mx.General.Estatus;

@Path("MarcaWS")
public class MarcaWS {
	MarcaDao dao = null;
	Estatus es = null;

	//http://localhost:9002/MarcaCelulares/marcaCelulares/MarcaWS/listar
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })	
	@Produces({ MediaType.APPLICATION_JSON })

	public List<Marca> Listar() {
		
		dao = new MarcaDao();
		List<Marca> lista = dao.listar();
		System.out.println("lista-->" + lista);
		
		return lista;
	}// cierra listar

	
	
	//http://localhost:9002/MarcaCelulares/marcaCelulares/MarcaWS/guardar
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus guardar(Marca marca) {
		
		dao = new MarcaDao();
		es=new Estatus();
		es.setObj(marca);
		String resp=dao.guardar(marca);
		if(resp.equals("1")) {
			es.setMensaje("guardado");
			es.setRespuesta(resp);
		}else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}
		return es;
	}// cierra guardar
	
	
	//http://localhost:9002/MarcaCelulares/marcaCelulares/MarcaWS/eliminar
	
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus eliminar(Marca marca) {
		
		dao = new MarcaDao();
		es=new Estatus();
		es.setObj(marca);
		String resp=dao.eliminar(marca);
		if(resp.equals("1")) {
			es.setMensaje("eliminado");
			es.setRespuesta(resp);
		}else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}
		return es;
	}// cierra eliminar
	
	//http://localhost:9002/MarcaCelulares/marcaCelulares/MarcaWS/buscar
	
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Marca buscar(Marca marca) {
		
		dao = new MarcaDao();
		marca = dao.buscar(marca);
		return marca;
	}// cierra eliminar
	
	//http://localhost:9002/MarcaCelulares/marcaCelulares/MarcaWS/editar
	
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus editar(Marca marca) {
		dao = new MarcaDao();
		es = new Estatus();
		es.setObj(marca);
		
		String resp = dao.editar(marca);
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
