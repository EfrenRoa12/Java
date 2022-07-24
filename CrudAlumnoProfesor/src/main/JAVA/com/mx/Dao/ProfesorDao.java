package com.mx.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mx.Entidad.Profesor;
import com.mx.General.DataBase;
import com.mx.General.MetodosProfesor;

public class ProfesorDao implements MetodosProfesor {
	//INSTANCIAMOS LA DATABASE Y LE COLOCAMOS UN NOMBRE
	DataBase db = new DataBase();

	@Override
	public String guardar(Profesor profesor) {
		//
		Connection cone;
		//
		PreparedStatement pst;
		//EL ? ES EL NUMERO DE ATRIBUTOS EN BDD DEBE COINCIDIR CON  JAVA ATRIBUTOS
		String query = "INSERT INTO PROFESOR_IL2 VALUES (?,?,?,?)";
		String r = null;
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			//LLAMAMOS LA CONEXION PARA QUE RECONOZCA QUE GUARDAMOS LOS CAMBIOS
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			//
			pst = cone.prepareStatement(query);
			//
			pst.setInt(1, profesor.getId());
			pst.setString(2, profesor.getNombre());
			pst.setString(3, profesor.getApellido());
			pst.setString(4, profesor.getEspecialidad());
			
			//DECLARAMOS LA VARIABLE Y CON executeUpdate PARA HACER LA FUNCION
			int fila = pst.executeUpdate();
			//SI NOS DA EL ESTATUS GUARDAR SI NO, NO SE GUARDO
			if (fila > 0) {
				r = "1";
				System.out.println("se guardo insertar-->" + fila);
			} else {

				r = "0";

				System.out.println("no se guardo insertar-->" + fila);
			}

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al insertar " + e);
		} // try catch

		return r;
	}
	//
	@Override
	public String eliminar(Profesor profesor) {
		//
		Connection cone;
		//
		PreparedStatement pst;
		//HACEMOS LA CONSULTA DE ELIMIAR YA QUE ELIMINAMOS POR ID
		String query = "DELETE FROM PROFESOR_IL2 WHERE ID=?";
		//
		String r = null;
		//TRY CATCH PARA LAS EXEPCIONES
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			//HACEMOS LA CONEXION
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			//
			pst = cone.prepareStatement(query);
			//SOLO BUSCAMOS POR ID
			pst.setInt(1, profesor.getId());
			//LA CONDICION SI SE ELIMINO O NO SE ELIMINO
			int fila = pst.executeUpdate();
			if (fila > 0) {
				r = "1";
				System.out.println("se ELIMINO -->" + fila);
			} else {

				r = "0";

				System.out.println("no se guardo-->" + fila);
			}

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al insertar " + e);
		} // try catch

		return r;

	}

	@Override
	public String editarr(Profesor profesor) {
		//
		Connection cone;
		//
		PreparedStatement pst;
		//ACTUALIZAMOS CON UPDATE SELECCIONAMOS LOS CAMPOS  POR ID
		String query = "UPDATE PROFESOR_IL2 SET NOMBRE=?, APELLIDO=?, ESPECIALIDAD=? WHERE ID=?";
		//
		String r = null;
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			//NOS CONECTAMOS POR LA BBDD
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			//
			pst = cone.prepareStatement(query);
			//LOS VALORES QUE TENEMOS LA CLASE COLOCAMOS LOS CAMPOS DE ACUERDO A LA CONSULTA EN BBDD
			pst.setString(1, profesor.getNombre());
			pst.setString(2, profesor.getApellido());
			pst.setString(3, profesor.getEspecialidad());
			//CON EL OBJETO PROFESOR VOY A PASAR LA CONSULTA
			pst.setInt(4, profesor.getId());
			//SE REALIZA LA CONDICION DE ACTUALIZACION
			int fila = pst.executeUpdate();
			if (fila > 0) {
				r = "1";
				System.out.println("se Edito -->" + fila);
			} else {

				r = "0";

				System.out.println("no se guardo insertar-->" + fila);
			}

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al insertar " + e);
		} // try catch
		return r;
	}

	@Override
	public Profesor buscar(Profesor profesor) {//ME VAA BUSCAR DE TIPO PROFESOR
		//
		Connection cone;
		//
		PreparedStatement pst;
		//IPORTAMOS LA LIBRERIA RESULSET MUESTRA EL CAMBO DE 
		ResultSet rs = null;
		//HACEMOS LA BUSQUEDA CONFORME A LOS CAMPOS////// Y  LO CONCATENAMOS CON EL PROFESOR POR ID
		String query = "SELECT ID, NOMBRE, APELLIDO, ESPECIALIDAD FROM PROFESOR_IL2 WHERE ID = " + profesor.getId();
		//
		String r = null;
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			//HACEMOS LA CONEXION
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			//
			pst = cone.prepareStatement(query);
			//
			rs = pst.executeQuery();
			//HACEMOS UN WHILE MIENTRAS ESTEN LOS REGISTROS
			while (rs.next()) {
				//INSTANCIAMOS , INICIALIZAMOS  CON EL CONSTRUCTOR CON PARAMETRO ----- 
				profesor = new Profesor(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
						rs.getString("ESPECIALIDAD"));
			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al insertar " + e);
		} // try catch
		return profesor;
	}

	@Override
	public List<Profesor> listar() {
		//
		List<Profesor> lista = new ArrayList<Profesor>();
		//
		Connection cone;
		//
		PreparedStatement pst;
		//
		ResultSet rs = null;
		//HACEMOS LA CONSULTA DE PROFESOR NOS MUESTRA POR ID
		String query = "SELECT ID, NOMBRE, APELLIDO, ESPECIALIDAD FROM PROFESOR_IL2 ORDER BY ID ";
		//
		String r = null;
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			//HACEMOS LA CONEXION
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			//
			pst = cone.prepareStatement(query);
			//
			rs = pst.executeQuery();

			while (rs.next()) {
				//INSTANCIAMOS , INICIALIZAMOS  CON EL CONSTRUCTOR CON PARAMETRO -----  VAMOS A IR AGREGANDO EL OBJETO P
				Profesor p = new Profesor(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
						rs.getString("ESPECIALIDAD"));
				//NOS MUESTRA LA LISTA---NOS REGRESA LOS VALORES
				lista.add(p);

			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			//
			System.out.println("Error al mostrar " + e);
		} // try catch
		return lista;
	}

}
