package com.mx.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIBRO") // ES EL NOMBRE DE LA TABLA DE BBDD
public class Libro {
	/*
	 * CREATE TABLE LIBRO( 
	 * ID NUMBER PRIMARY KEY, 
	 * NOMBRE NVARCHAR2(100), 
	 * TIPO NVARCHAR2(100), 
	 * PRECIO NUMBER, 
	 * COLOR NVARCHAR2(100) );
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
	
	@Column(name = "TIPO", columnDefinition = "NVARCHAR2(100)")
	String tipo;

	@Column(name = "PRECIO", columnDefinition = "NUMBER")
	int precio;

	@Column(name = "COLOR", columnDefinition = "NVARCHAR2(100)")
	String color;
	
	public Libro() {
		
	}
	public Libro(int id) {
		this.id = id;
	}
	public Libro(int id, String nombre, String tipo, int precio, String color) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", color=" + color
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
