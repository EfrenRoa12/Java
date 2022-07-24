package com.mx.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BIBLIOTECA") // ES EL NOMBRE DE LA TABLA EN BBDD
public class Biblioteca {
	/*
	 * CREATE TABLE BIBLIOTECA( 
	 * ID NUMBER PRIMARY KEY, 
	 * NOMBRE NVARCHAR2(100),
	 * TELEFONO NUMBER(20), 
	 * DIRECCION NVARCHAR2(100) );
	 */

	// CREAMOS LOS ATRIBUTOS
	// INDICAMOS QUEES LA LLAVE PRIMARIA-----DECLARAMOS LAS SENTENCIAS DE LA TABLA Y
	// SUS TIPOS DE DATOS
	@Id
	@Column(name = "ID", columnDefinition = "NUMBER")
	int id;// CADA ATRIBBUTO CREAMOS LOS ESTEREOTIPOS

	// DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(100)")
	String nombre;

	@Column(name = "TELEFONO", columnDefinition = "NUMBER(20)")
	int telefono;

	@Column(name = "DIRECCION", columnDefinition = "NVARCHAR2(100)")
	String direccion;

	public Biblioteca() {
		
	}
	public Biblioteca(int id) {
		this.id = id;
	}
	public Biblioteca(int id, String nombre, int telefono, String direccion) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
				+ "]\n";
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
}
