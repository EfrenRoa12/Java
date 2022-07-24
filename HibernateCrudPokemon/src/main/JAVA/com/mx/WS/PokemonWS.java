package com.mx.WS;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mx.Dao.PokemonDao;
import com.mx.Entidad.Pokemon;
import com.mx.General.Estatus;

@Path("PokemonWS")
public class PokemonWS {
	Estatus es = null;
	PokemonDao dao = null;
	
	//http://localhost:9002/HibernateCrudPokemon/hibernateCrudPokemon/PokemonWS/listar
	@Path("listar")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public List<Pokemon> Listar() {

		dao = new PokemonDao();
		List<Pokemon> lista = dao.listar();// INVOCAMOS AL METODO DE LISTAR
		System.out.println("lista--->" + lista);
		return lista;
	}
	//http://localhost:9002/HibernateCrudPokemon/hibernateCrudPokemon/PokemonWS/guardar

	// CREAMOS EL GUARDAR
	@Path("guardar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus guardar(Pokemon pokemon) {

		dao = new PokemonDao();
		es = new Estatus();
		es.setObj(pokemon);
		String resp = dao.guardar(pokemon);

		if (resp.equals("1")) {

			es.setMensaje("guardado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	//http://localhost:9002/HibernateCrudPokemon/hibernateCrudPokemon/PokemonWS/eliminar

	// CREAMOS ELIMINAR
	@Path("eliminar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus eliminar(Pokemon pokemon) {

		dao = new PokemonDao();
		es = new Estatus();
		es.setObj(pokemon);
		String resp = dao.eliminar(pokemon);
		if (resp.equals("1")) {

			es.setMensaje("eliminado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}
	//http://localhost:9002/HibernateCrudPokemon/hibernateCrudPokemon/PokemonWS/editar

	// CREAMOS EDITAR
	@Path("editar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Estatus editar(Pokemon pokemon) {

		dao = new PokemonDao();
		es = new Estatus();
		es.setObj(pokemon);
		String resp = dao.editar(pokemon);
		if (resp.equals("1")) {

			es.setMensaje("editado");
			es.setRespuesta(resp);// guardamos la respuesta
		} else {
			es.setMensaje("error");
			es.setRespuesta(resp);
		}

		return es;
	}

	//http://localhost:9002/HibernateCrudPokemon/hibernateCrudPokemon/PokemonWS/buscar
	// CREAMOS BUSCAR
	@Path("buscar")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	// DECLARAMOS EL METODO
	public Pokemon buscar(Pokemon pokemon) {

		dao = new PokemonDao();

		pokemon = dao.buscar(pokemon);

		return pokemon;
	}
}
