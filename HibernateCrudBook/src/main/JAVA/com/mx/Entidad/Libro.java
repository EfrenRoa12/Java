package com.mx.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LIBRO")
public class Libro {
/*
 CREATE TABLE LIBRO(
    ID NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
    EDITORIAL NVARCHAR2(100),
    PRECIO NUMBER(30),
    GENERO NVARCHAR2(100)
);
 */
	
	@Id
	@Column(name="ID", columnDefinition="NUMBER")
	int id;//CADA ATRIBBUTO CREAMOS LOS ESTEREOTIPOS
	
	//DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(100)")
	String nombre;
	
	//DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name = "EDITORIAL", columnDefinition = "NVARCHAR2(100)")
	String editorial;
	
	@Column(name="PRECIO", columnDefinition="NUMBER(30)")
	int precio;
	
	@Column(name="GENERO", columnDefinition="NVARCHAR2(100)")
	String genero;
	
	public Libro() {
		
	}
	public Libro(int id) {
		this.id = id;
	}
	public Libro(int id, String nombre, String editorial, int precio, String genero) {
		this.id = id;
		this.nombre = nombre;
		this.editorial = editorial;
		this.precio = precio;
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + ", precio=" + precio
				+ ", genero=" + genero + "]\n";
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
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}
