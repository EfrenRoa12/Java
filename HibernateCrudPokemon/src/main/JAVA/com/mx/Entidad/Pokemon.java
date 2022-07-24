package com.mx.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POKEMON")//ES EL NOMBRE DE LA TABLA EN BBDD
public class Pokemon {
/*
 CREATE TABLE POKEMON(
     ID NUMBER,
     NOMBRE NVARCHAR2(100),
     PREEVOLUCION NVARCHAR2(100),
     EVOLUCION NVARCHAR2(100),
     TIPO NVARCHAR2(100),
     PODER NUMBER
);
 */
	@Id
	@Column(name="ID", columnDefinition="NUMBER")
	int id;//CADA ATRIBBUTO CREAMOS LOS ESTEREOTIPOS
	
	//DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(100)")
	String nombre;
	
	//DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name = "PREEVOLUCION", columnDefinition = "NVARCHAR2(100)")
	String preevolucion;
	
	@Column(name="EVOLUCION", columnDefinition="NVARCHAR2(100)")
	String evolucion;
	
	@Column(name="TIPO", columnDefinition="NVARCHAR2(100)")
	String tipo;
	
	@Column(name="PODER", columnDefinition="NUMBER")
	int poder;
	
	public Pokemon() {
		
	}
	
	public Pokemon(int id) {
		this.id = id;
	}

	public Pokemon(int id, String nombre, String preevolucion, String evolucion, String tipo, int poder) {
		this.id = id;
		this.nombre = nombre;
		this.preevolucion = preevolucion;
		this.evolucion = evolucion;
		this.tipo = tipo;
		this.poder = poder;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nombre=" + nombre + ", preevolucion=" + preevolucion + ", evolucion="
				+ evolucion + ", tipo=" + tipo + ", poder=" + poder + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPreevolucion() {
		return preevolucion;
	}

	public void setPreevolucion(String preevolucion) {
		this.preevolucion = preevolucion;
	}

	public String getEvolucion() {
		return evolucion;
	}

	public void setEvolucion(String evolucion) {
		this.evolucion = evolucion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	
	
}
