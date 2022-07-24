package com.mx.General;

public class DataBase {
	
	private String driver;//CONTROLADOR PARA HACER LA CONEXION EN LA BASE DE DATOS
	private String url;//EN LA DIRECCION DONDE ESTA
	private String usuario;//USUARIO DE BBDD
	private String password;//CONTRASEÑA DE BBDD
	//LOS VALORES PARA HACER LA CONEXION
	//
	public DataBase() {
		driver = "oracle.jdbc.OracleDriver";
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		usuario = "System";
		password = "Leopardo222";
	}
	//METODOS GETT Y SETT
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
