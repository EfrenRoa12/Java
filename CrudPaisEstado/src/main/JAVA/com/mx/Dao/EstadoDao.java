package com.mx.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mx.Entidad.Estado;
import com.mx.Entidad.Pais;
import com.mx.General.Database;
import com.mx.General.MetodosEstado;

public class EstadoDao implements MetodosEstado {
	Database db = new Database();

	@Override
	public String guardar(Estado estado) {
		Connection cone;
		PreparedStatement pst;
		String query = "INSERT INTO ESTADO_IL5 VALUES (?,?,?,?,?,?)";
		String r = null;
		try {
			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setInt(1, estado.getId());
			pst.setString(2, estado.getNombre());
			pst.setInt(3, estado.getExtension());
			pst.setString(4, estado.getCapital());
			pst.setString(5, estado.getCultura());
			pst.setInt(6, estado.getPais().getId());// FK
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
	public String eliminar(Estado estado) {
		Connection cone;
		PreparedStatement pst;
		String query = "DELETE FROM ESTADO_IL5 WHERE ID=?";
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setInt(1, estado.getId());

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
	public String editar(Estado estado) {
		Connection cone;
		PreparedStatement pst;
		String query = "UPDATE ESTADO_IL5 SET NOMBRE=?, EXTENSION=?, CAPITAL=?, CULTURA=?, ID_PAIS=? WHERE ID=?";
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setString(1, estado.getNombre());
			pst.setInt(2, estado.getExtension());
			pst.setString(3, estado.getCapital());
			pst.setString(4, estado.getCultura());
			pst.setInt(5, estado.getPais().getId());// FK
			pst.setInt(6, estado.getId());

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
			System.out.println("Error al ieditar " + e);
		} // try catch

		return r;
	}

	@Override
	public Estado buscar(Estado estado) {
		Connection cone;
		PreparedStatement pst;
		ResultSet rs = null;
		String query = "SELECT E.ID E_ID, E.NOMBRE E_NOMBRE, E.EXTENSION E_EXTENSION,E.CAPITAL E_CAPITAL, E.CULTURA E_CULTURA,  "
				+ "P.ID P_ID, P.NOMBRE P_NOMBRE, P.EXTENSION P_EXTENSION, P.CULTURA P_CULTURA "
				+ "FROM ESTADO_IL5 E " + "INNER JOIN " + "PAIS_IL2 P "
				+ "ON E.ID_PAIS=P.ID;" + estado.getId();
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();

			while (rs.next()) {
				Pais pais = new Pais(rs.getInt("P_ID"), rs.getString("P_NOMBRE"),
						rs.getInt("P_EXTENSION"), rs.getString("P_CULTURA"));
				
				estado = new Estado(rs.getInt("E_ID"), rs.getString("E_NOMBRE"),
						rs.getInt("E_EXTENSION"), rs.getString("E_CAPITAL"), rs.getString("E_CULTURA"), pais);

			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al busar " + e);
		} // try catch
		return estado;
	}

	@Override
	public List<Estado> listar() {
		List<Estado> lista = new ArrayList<Estado>();
		Connection cone;
		PreparedStatement pst;
		ResultSet rs = null;
		String query = "SELECT E.ID E_ID, E.NOMBRE E_NOMBRE, E.EXTENSION E_EXTENSION,E.CAPITAL E_CAPITAL, E.CULTURA E_CULTURA, E.ID_PAIS E_ID_PAIS, "
				+ "P.ID P_ID, P.NOMBRE P_NOMBRE, P.EXTENSION P_EXTENSION, P.CULTURA P_CULTURA "
				+ "FROM ESTADO_IL5 E "
				+ "INNER JOIN "
				+ "PAIS_IL2 P "
				+ "ON E.ID_PAIS=P.ID;";
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());

			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();

			while (rs.next()) {
				Pais pais = new Pais(rs.getInt("P_ID"), rs.getString("P_NOMBRE"),
						rs.getInt("P_EXTENSION"), rs.getString("P_CULTURA"));
				
				Estado estado = new Estado(rs.getInt("E_ID"), rs.getString("E_NOMBRE"),
						rs.getInt("E_EXTENSION"), rs.getString("E_CAPITAL"), rs.getString("E_CULTURA"), pais);

				lista.add(estado);
			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al mostrar " + e);
		} // try catch
		return lista;
	}

}
