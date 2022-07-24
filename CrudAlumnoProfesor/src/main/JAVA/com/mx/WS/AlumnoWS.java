package com.mx.WS;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.Dao.AlumnoDao;
import com.mx.Entidad.Alumno;
import com.mx.General.Estatus;
@Path("AlumnoWS")
public class AlumnoWS {
	AlumnoDao dao = null;
	Estatus es = null;
//http://localhost:9002/CrudAlumnoProfesor/crudAlumnoProfesor/AlumnoWS/listar
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public List<Alumno> Listar() {
		
		dao = new AlumnoDao();
		List<Alumno> lista = dao.listar();
		System.out.println("lista-->" + lista);
		
		return lista;
	}// cierra listar

	
	//http://localhost:9002/CrudAlumnoProfesor/crudAlumnoProfesor/AlumnoWS/guardar
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus guardar(Alumno alumno) {
		
		dao = new AlumnoDao();
		es=new Estatus();
		es.setObj(alumno);
		String resp=dao.guardar(alumno);
		if(resp.equals("1")) {
			es.setMensaje("guardado");
			es.setRespuesta(resp);
		}else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}
		return es;
	}// cierra guardar
	
	
	//http://localhost:9002/CrudAlumnoProfesor/crudAlumnoProfesor/AlumnoWS/eliminar
	
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus eliminar(Alumno alumno) {
		
		dao = new AlumnoDao();
		es=new Estatus();
		es.setObj(alumno);
		String resp=dao.eliminar(alumno);
		if(resp.equals("1")) {
			es.setMensaje("eliminado");
			es.setRespuesta(resp);
		}else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}
		return es;
	}// cierra eliminar
	
	//http://localhost:9002/CrudAlumnoProfesor/crudAlumnoProfesor/AlumnoWS/buscar
	
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Alumno buscar(Alumno alumno) {
		
		dao = new AlumnoDao();
		alumno = dao.buscar(alumno);
		return alumno;
	}// cierra eliminar
	
	//http://localhost:9002/CrudAlumnoProfesor/crudAlumnoProfesor/AlumnoWS/editar
	
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Estatus editar(Alumno alumno) {
		dao = new AlumnoDao();
		es = new Estatus();
		es.setObj(alumno);
		
		String resp = dao.editar(alumno);
		if (resp.equals("1")) {
			es.setMensaje(" editado");
			es.setRespuesta(resp);
		} else {

			es.setMensaje("error");
			es.setRespuesta(resp);

		}
		return es;
}}
