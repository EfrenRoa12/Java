package com.mx.WS;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.Dao.ProfesorDao;
import com.mx.Entidad.Profesor;
import com.mx.General.Estatus;

@Path("ProfesorWS")
public class ProfesorWS {

	ProfesorDao dao = null;
	Estatus es = null;
	//http://localhost:9002/CrudAlumnoProfesor/crudAlumnoProfesor/ProfesorWS/listar
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public List<Profesor> Listar() {
		
		dao = new ProfesorDao();
		List<Profesor> lista = dao.listar();
		System.out.println("lista-->" + lista);
		
		return lista;
	}// cierra listar

	
	
	//http://localhost:9002/CrudAlumnoProfesor/crudAlumnoProfesor/ProfesorWS/guardar
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus guardar(Profesor profesor) {
		
		dao = new ProfesorDao();
		es=new Estatus();
		es.setObj(profesor);
		String resp=dao.guardar(profesor);
		if(resp.equals("1")) {
			es.setMensaje("guardado");
			es.setRespuesta(resp);
		}else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}
		return es;
	}// cierra guardar
	
	
	//http://localhost:9002/CrudAlumnoProfesor/crudAlumnoProfesor/ProfesorWS/eliminar
	
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus eliminar(Profesor profesor) {
		
		dao = new ProfesorDao();
		es=new Estatus();
		es.setObj(profesor);
		String resp=dao.eliminar(profesor);
		if(resp.equals("1")) {
			es.setMensaje("eliminado");
			es.setRespuesta(resp);
		}else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}
		return es;
	}// cierra eliminar
	
	//http://localhost:9002/CrudAlumnoProfesor/crudAlumnoProfesor/ProfesorWS/buscar
	
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Profesor buscar(Profesor profesor) {
		
		dao = new ProfesorDao();
		profesor = dao.buscar(profesor);
		return profesor;
	}// cierra eliminar
	
	//http://localhost:9002/CrudAlumnoProfesor/crudAlumnoProfesor/ProfesorWS/editar
	
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus editar(Profesor profesor) {
		dao = new ProfesorDao();
		es = new Estatus();
		es.setObj(profesor);
		
		String resp = dao.editarr(profesor);
		if (resp.equals("1")) {
			es.setMensaje(" editado");
			es.setRespuesta(resp);
		} else {

			es.setMensaje("error");
			es.setRespuesta(resp);

		}
		return es;
}}
