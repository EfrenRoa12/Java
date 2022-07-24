package com.mx.General;

public class Estatus {
	String mensaje;
	String respuesta;
	Object obj;

	public Estatus() {

	}

	public Estatus(String mensaje, String respuesta, Object obj) {
		this.mensaje = mensaje;
		this.respuesta = respuesta;
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Estatus [mensaje=" + mensaje + ", respuesta=" + respuesta + ", obj=" + obj + "]\n";
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
