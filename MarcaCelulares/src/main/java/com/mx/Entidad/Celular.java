package com.mx.Entidad;

public class Celular {
/*
 CREATE TABLE CELULAR_IL5(
    ID NUMBER PRIMARY KEY,
    TIPO NVARCHAR2(100),
    PAIS NVARCHAR2(100),
    PRECIO NUMBER,
    
    ID_MARCA NUMBER,
    CONSTRAINT FK_ID_MARCA2 FOREIGN KEY (ID_MARCA) REFERENCES MARCA_IL2(ID)   
);
 */
	//ATRIBUTOS
	int id;
	String tipo;
	String pais;
	int precio;
	//VAMOS A PONERLO DE TIPO PROFESOR YA QQUE HAREMOS LA RELACION INCLUIMOS LA RELACION CON INNER JOIN DEPENDENCIA DE ALUMNO PROFESOR
		//OBJETO PROFESOS DE TIPO marca
	Marca marca;
	//CONSTRUCTOR SIN PARAMETROS
	public Celular() {
		
	}
	//CONSTRUCTOS POR MEDIO DE ID
	public Celular(int id) {
		this.id = id;
	}
	//CONSTRUCTOR CON PARAMETROS
	public Celular(int id, String tipo, String pais, int precio, Marca marca) {
		this.id = id;
		this.tipo = tipo;
		this.pais = pais;
		this.precio = precio;
		this.marca = marca;
	}
	//TO TRING
	@Override
	public String toString() {
		return "Celular [id=" + id + ", tipo=" + tipo + ", pais=" + pais + ", precio=" + precio + ", marca=" + marca
				+ "]\n";
	}
	//ENCAPSULAMIENTO GETT Y SET
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
	
}
