package com.mx.controller;

import com.mx.dao.PerroDao;

import Entidad.Perro;

public class Principal {

	public static void main(String[] args) {
		// CLASE DONDE VAMOS A EJECUTAR LA APLICACION
		PerroDao dao = new PerroDao();

		Perro p = new Perro(2, "dollar", "Dalmata", 2);
		dao.guardar(p);
		System.out.println("la lista tiene" + dao.listar());

		// buscar
		p = new Perro(1);
		p = dao.buscar(p);
		System.out.println("se encontro el perro" + p);

		// editar hay que buscar primero
		p.setEdad(20);
		dao.editar(p);
		System.out.println("la lista tiene" + dao.listar());

		// eliminar
		p = new Perro(2);
		dao.eliminar(p);
		System.out.println("la lista tiene" + dao.listar());

	}

}
