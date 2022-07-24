package com.mx.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACTOS_IL")//ES EL NOMBRE DE LA TABLA EN BBDD
public class Contactos {
/*
CREATE TABLE CONTACTOS_IL(
    ID NUMBER(30),
    NOMBRE NVARCHAR2(100),
    EMAIL NVARCHAR2(100),
    NUMERO NUMBER(30),
    MENSAJE NVARCHAR2(100)
);
 */
	
	//CREAMOS LOS ATRIBUTOS CONFORME A LA BBDD
	@Id
	@Column(name="ID", columnDefinition="NUMBER(30)")
	int id;//CADA ATRIBBUTO CREAMOS LOS ESTEREOTIPOS
	
	//DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(100)")
	String nombre;
	
	// DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name = "EMAIL", columnDefinition = "NVARCHAR2(100)")
	String email;
	
	//DECLARAMOS LAS SENTENCIAS DE LA TABLA Y SUS TIPOS DE DATOS
	@Column(name = "NUMERO", columnDefinition = "NUMBER(30)")
	String numero;
	
	@Column(name="MENSAJE", columnDefinition="NVARCHAR2(100)")
	String mensaje;
	
	public Contactos() {
		
	}
	public Contactos(int id) {
		this.id = id;
	}
	public Contactos(int id, String nombre, String email, String numero, String mensaje) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.numero = numero;
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "Contactos [id=" + id + ", nombre=" + nombre + ", email=" + email + ", numero=" + numero + ", mensaje="
				+ mensaje + "]\n";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
	
}
