package com.mx.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mx.Entidad.Celular;
import com.mx.Entidad.Marca;
import com.mx.General.Database;
import com.mx.General.MetodosCelular;

public class CelularDao implements MetodosCelular{
	Database db = new Database();
	@Override
	public String guardar(Celular celular) {
		Connection cone;
		PreparedStatement pst;
		//EL ? ES EL NUMERO DE ATRIBUTOS EN BDD DEBE COINCIDIR CON  JAVA ATRIBUTOS
		String query = "INSERT INTO CELULAR_IL5 VALUES (?,?,?,?,?)";
		String r = null;
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			//LLAMAMOS LA CONEXION PARA QUE RECONOZCA QUE GUARDAMOS LOS CAMBIOS
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setInt(1, celular.getId());
			pst.setString(2, celular.getTipo());
			pst.setString(3, celular.getPais());
			pst.setInt(4, celular.getPrecio());
			//ES DE LA LLAVE FORANEA
			pst.setInt(5, celular.getMarca().getId());// FK
			//DECLARAMOS LA VARIABLE Y CON executeUpdate PARA HACER LA FUNCION
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
	public String eliminar(Celular celular) {
		Connection cone;
		PreparedStatement pst;
		//HACEMOS LA CONSULTA DE ELIMIAR YA QUE ELIMINAMOS POR ID
		String query = "DELETE FROM CELULAR_IL5 WHERE ID=?";
		String r = null;
		//TRY CATCH PARA LAS EXEPCIONES
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			//HACEMOS LA CONEXION
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			pst = cone.prepareStatement(query);
			//SOLO BUSCAMOS POR ID
			pst.setInt(1, celular.getId());
			//LA CONDICION SI SE ELIMINO O NO SE ELIMINO
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
	public String editar(Celular celular) {
		Connection cone;
		PreparedStatement pst;
		//ACTUALIZAMOS CON UPDATE SELECCIONAMOS LOS CAMPOS  POR ID
		String query = "UPDATE CELULAR_IL5 SET TIPO=?, PAIS=?, PRECIO=?, ID_MARCA=? WHERE ID=?";
		String r = null;
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			//NOS CONECTAMOS POR LA BBDD
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			//LOS VALORES QUE TENEMOS LA CLASE COLOCAMOS LOS CAMPOS DE ACUERDO A LA CONSULTA EN BBDD
			pst = cone.prepareStatement(query);
			//LA MISMA ORDE DE QUERY
			pst.setString(1, celular.getTipo());
			pst.setString(2, celular.getPais());
			pst.setInt(3, celular.getPrecio());
			pst.setInt(4, celular.getMarca().getId());
			pst.setInt(5, celular.getId());

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
	public Celular buscar(Celular celular) {
		Connection cone;
		PreparedStatement pst;
		//IPORTAMOS LA LIBRERIA RESULSET MUESTRA EL CAMBO DE 
		ResultSet rs = null;
		//VAMOS A PEGAR TODO LO QUE SE ENCUENTRA EN INNER JOIN LA CONSULTA LO PONEMOS DESDE AQUI
		String query = "SELECT C.ID C_ID, C.TIPO C_TIPO, C.PAIS C_PAIS, C.PRECIO C_PRECIO, "
				+ "M.ID M_ID, M.NOMBRE M_NOMBRE, M.MODELO M_MODELO, M.COLOR M_COLOR "
				+ "FROM CELULAR_IL5 C "
				+ "INNER JOIN "
				+ "MARCA_IL2 M "
				+ "ON C.ID_MARCA=M.ID= "+ "WHERE A.ID =" + celular.getId();
		String r = null;
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			//HACEMOS LA CONEXION
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();
			//HACEMOS UN WHILE MIENTRAS ESTEN LOS REGISTROS
			while (rs.next()) {
				//INSTANCIAMOS , INICIALIZAMOS  CON EL CONSTRUCTOR CON PARAMETRO
				Marca marca = new Marca(rs.getInt("M_ID"), rs.getString("M_NOMBRE"),
						rs.getString("M_MODELO"), rs.getString("M_COLOR"));
				//INSTANCIAMOS , INICIALIZAMOS  CON EL CONSTRUCTOR CON PARAMETROS ALUMNO
				celular = new Celular(rs.getInt("C_ID"), rs.getString("C_TIPO"), rs.getString("C_PAIS"), rs.getInt("C_PRECIO"), marca);
			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al busar " + e);
		} // try catch
		return celular;
	}

	@Override
	public List<Celular> listar() {
		List<Celular> lista = new ArrayList<Celular>();
		Connection cone;
		PreparedStatement pst;
		ResultSet rs = null;
		//HACEMOS LA CONSULTA DE PROFESOR NOS MUESTRA POR ID
		String query = "SELECT C.ID C_ID, C.TIPO C_TIPO, C.PAIS C_PAIS, C.PRECIO C_PRECIO, "
				+ "M.ID M_ID, M.NOMBRE M_NOMBRE, M.MODELO M_MODELO, M.COLOR M_COLOR "
				+ "FROM CELULAR_IL5 C "
				+ "INNER JOIN "
				+ "MARCA_IL2 M "
				+ "ON C.ID_MARCA=M.ID= "+ "WHERE A.ID =";
		String r = null;
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();

			while (rs.next()) {
				//INSTANCIAMOS , INICIALIZAMOS  CON EL CONSTRUCTOR CON PARAMETRO
				Marca marca = new Marca(rs.getInt("M_ID"), rs.getString("M_NOMBRE"),
						rs.getString("M_MODELO"), rs.getString("M_COLOR"));

				Celular alumno = new Celular(rs.getInt("C_ID"), rs.getString("C_TIPO"), rs.getString("C_PAIS"), rs.getInt("C_PRECIO"), marca);
				//NOS MUESTRA LA LISTA---NOS REGRESA LOS VALORES
				lista.add(alumno);

			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al mostrar " + e);
		} // try catch
		return lista;
	}

}
