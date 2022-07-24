package com.mx.Entidad;

public class Estado {
/*
 CREATE TABLE ESTADO_IL5(
    ID NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
    EXTENSION NUMBER,
    CAPITAL NVARCHAR2(100),
    CULTURA NVARCHAR2(100),
    ID_PAIS NUMBER,
    CONSTRAINT FK_ID_PAIS2 FOREIGN KEY (ID_PAIS) REFERENCES PAIS_IL2(ID)
);
*/
	//ATRIBUTOS
	int id;
	String nombre;
	int extension;
	String capital;
	String cultura;
	Pais pais;
	//METODO CONSTRUCTOR
	Estado(){
		
	}
	//CONSTRUCTOR CON PARAMETROS
	Estado(int id){
		this.id = id;
	}
	//CONSTRUCTOR CON PARAMETROS
	public Estado(int id, String nombre, int extension, String capital, String cultura, Pais pais) {
		this.id = id;
		this.nombre = nombre;
		this.extension = extension;
		this.capital = capital;
		this.cultura = cultura;
		this.pais = pais;
	}
	//TO STRING
	@Override
	public String toString() {
		return "Estado [id=" + id + ", nombre=" + nombre + ", extension=" + extension + ", capital=" + capital
				+ ", cultura=" + cultura + ", pais=" + pais + "]\n";
	}
	//GETT Y SETT
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
	public int getExtension() {
		return extension;
	}
	public void setExtension(int extension) {
		this.extension = extension;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCultura() {
		return cultura;
	}
	public void setCultura(String cultura) {
		this.cultura = cultura;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
}
