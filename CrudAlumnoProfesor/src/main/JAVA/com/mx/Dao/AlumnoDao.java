package com.mx.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mx.Entidad.Alumno;
import com.mx.Entidad.Profesor;
import com.mx.General.DataBase;
import com.mx.General.MetodosAlumnos;
import com.sun.xml.bind.v2.model.core.ID;

public class AlumnoDao implements MetodosAlumnos {
	// INSTANCIAMOS LA DATABASE Y LE COLOCAMOS UN NOMBRE
	DataBase db = new DataBase();

	@Override
	public String guardar(Alumno alumno) {
		Connection cone;
		PreparedStatement pst;
		// EL ? ES EL NUMERO DE ATRIBUTOS EN BDD DEBE COINCIDIR CON JAVA ATRIBUTOS
		String query = "INSERT INTO ALUMNO_IL5 VALUES (?,?,?,?,?)";
		String r = null;
		try {
			// CONTROLADOR
			Class.forName(db.getDriver());
			// LLAMAMOS LA CONEXION PARA QUE RECONOZCA QUE GUARDAMOS LOS CAMBIOS
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setInt(1, alumno.getId());
			pst.setString(2, alumno.getNombre());
			pst.setString(3, alumno.getApellido());
			pst.setInt(4, alumno.getEdad());
			// ES DE LA LLAVE FORANEA
			pst.setInt(5, alumno.getProfesor().getId());// FK
			// DECLARAMOS LA VARIABLE Y CON executeUpdate PARA HACER LA FUNCION
			int fila = pst.executeUpdate();

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

	@Override
	public String eliminar(Alumno alumno) {
		Connection cone;
		PreparedStatement pst;
		// HACEMOS LA CONSULTA DE ELIMIAR YA QUE ELIMINAMOS POR ID
		String query = "DELETE FROM ALUMNO_IL5 WHERE ID=?";
		String r = null;
		// TRY CATCH PARA LAS EXEPCIONES
		try {
			// CONTROLADOR
			Class.forName(db.getDriver());
			// HACEMOS LA CONEXION
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			// SOLO BUSCAMOS POR ID
			pst.setInt(1, alumno.getId());
			// LA CONDICION SI SE ELIMINO O NO SE ELIMINO
			int fila = pst.executeUpdate();
			if (fila > 0) {
				r = "1";
				System.out.println("se guardo insertar-->" + fila);
			} else {

				r = "0";

				System.out.println("no se guardo insertar-->" + fila);
			}

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al eliminar " + e);
		} // try catch

		return r;
	}

	@Override
	public String editar(Alumno alumno) {
		Connection cone;
		PreparedStatement pst;
		// ACTUALIZAMOS CON UPDATE SELECCIONAMOS LOS CAMPOS POR ID
		String query = "UPDATE ALUMNO_IL5 SET NOMBRE=?, APELLIDO=?, EDAD=?, ID_PROFESOR=? WHERE ID=?";
		String r = null;
		try {
			// CONTROLADOR
			Class.forName(db.getDriver());
			// NOS CONECTAMOS POR LA BBDD
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			// LOS VALORES QUE TENEMOS LA CLASE COLOCAMOS LOS CAMPOS DE ACUERDO A LA
			// CONSULTA EN BBDD
			pst = cone.prepareStatement(query);
			// LA MISMA ORDE DE QUERY
			pst.setString(1, alumno.getNombre());
			pst.setString(2, alumno.getApellido());
			pst.setInt(3, alumno.getEdad());
			pst.setInt(4, alumno.getProfesor().getId());
			pst.setInt(5, alumno.getId());

			int fila = pst.executeUpdate();
			if (fila > 0) {
				r = "1";
				System.out.println("se edito insertar-->" + fila);
			} else {

				r = "0";

				System.out.println("no se edito insertar-->" + fila);
			}

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al editar " + e);
		} // try catch

		return r;
	}

	@Override
	public Alumno buscar(Alumno alumno) {// ME VAA BUSCAR DE TIPO PROFESOR
		Connection cone;
		PreparedStatement pst;
		// IPORTAMOS LA LIBRERIA RESULSET MUESTRA EL CAMBO DE
		ResultSet rs = null;
		// VAMOS A PEGAR TODO LO QUE SE ENCUENTRA EN INNER JOIN LA CONSULTA LO PONEMOS
		// DESDE AQUI
		String query = "SELECT A.ID A_ID, A.NOMBRE A_NOMBRE, A.APELLIDO A_APELLIDO,A.EDAD A_EDAD, "
				+ "P.ID P_ID, P.NOMBRE P_NOMBRE, P.APELLIDO, P.ESPECIALIDAD P_ESPECIALIDAD " + "FROM ALUMNO_IL5 A "
				+ "INNER JOIN " + "PROFESOR_IL2 P" + "ON A.ID_PROFESOR=P.ID=" + "WHERE A.ID =" + alumno.getId();
		String r = null;
		try {
			// CONTROLADOR
			Class.forName(db.getDriver());
			// HACEMOS LA CONEXION
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();
			// HACEMOS UN WHILE MIENTRAS ESTEN LOS REGISTROS
			while (rs.next()) {
				// INSTANCIAMOS , INICIALIZAMOS CON EL CONSTRUCTOR CON PARAMETRO
				Profesor profesor = new Profesor(rs.getInt("P_ID"), rs.getString("P_NOMBRE"),
						rs.getString("P_APELLIDO"), rs.getString("P_ESPECIALIDAD"));
				// INSTANCIAMOS , INICIALIZAMOS CON EL CONSTRUCTOR CON PARAMETROS ALUMNO
				alumno = new Alumno(rs.getInt("A_ID"), rs.getString("A_NOMBRE"), rs.getString("A_APELLIDO"),
						rs.getInt("A_EDAD"), profesor);
			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al busar " + e);
		} // try catch
		return alumno;
	}

	@Override
	public List<Alumno> listar() {
		List<Alumno> lista = new ArrayList<Alumno>();
		Connection cone;
		PreparedStatement pst;
		ResultSet rs = null;
		// HACEMOS LA CONSULTA DE PROFESOR NOS MUESTRA POR ID
		String query = "SELECT A.ID A_ID, A.NOMBRE A_NOMBRE, A.APELLIDO A_APELLIDO,A.EDAD A_EDAD,"
				+ "P.ID P_ID, P.NOMBRE P_NOMBRE, P.APELLIDO, P.ESPECIALIDAD P_ESPECIALIDAD" + "FROM ALUMNO_IL5 A"
				+ "INNER JOIN PROFESOR_IL2 P" + "ON A.ID_PROFESOR=P.ID";
		String r = null;
		try {
			// CONTROLADOR
			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();
			while (rs.next()) {
				// INSTANCIAMOS , INICIALIZAMOS CON EL CONSTRUCTOR CON PARAMETRO
				Profesor profesor = new Profesor(rs.getInt("P_ID"), rs.getString("P_NOMBRE"), rs.getString("APELLIDO"),
						rs.getString("P_ESPECIALIDAD"));
				Alumno alumno = new Alumno(rs.getInt("A_ID"), rs.getString("A_NOMBRE"), rs.getString("A_APELLIDO"),
						rs.getInt("A_EDAD"), profesor);
				// NOS MUESTRA LA LISTA---NOS REGRESA LOS VALORES
				lista.add(alumno);
			} // FIN WHILE
		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al mostrar " + e);
		} // try catch
		return lista;
	}
}
