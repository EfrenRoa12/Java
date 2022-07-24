package com.mx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entidad.Perro;
import General.Database;
import General.Metodos;

public class PerroDao implements Metodos {
	Database db = new Database();
	@Override
	public String guardar(Perro perro) {
		
		Connection cone;
		PreparedStatement pst;
		String query = "INSERT INTO PERRO_4 VALUES(?,?,?,?)";
		String r = null;

		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setInt(1, perro.getId());
			pst.setString(2, perro.getNombre());
			pst.setString(3, perro.getRaza());
			pst.setInt(4, perro.getEdad());

			int fila = pst.executeUpdate();
			if (fila > 0) {
				r = "1";
				System.out.println("se guardo-->" + fila);
			} else {
				r = "0";
				System.out.println(" no se guardo-->" + fila);
			}

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error insertar " + e);
		}

		return r;
	}

	@Override
	public String editar(Perro perro) {
		Connection cone;
		PreparedStatement pst;
		String query = "UPDATE PERRO_4 SET NOMBRE=?, RAZA=?, EDAD=?, WHERE ID=?";
		String r = null;

		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setString(1, perro.getNombre());
			pst.setString(2, perro.getRaza());
			pst.setInt(3, perro.getEdad());
			pst.setInt(4, perro.getId());

			int fila = pst.executeUpdate();
			if (fila > 0) {
				r = "1";
				System.out.println("se edito-->" + fila);
			} else {
				r = "0";
				System.out.println(" no se edito-->" + fila);
			}

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error editar " + e);
		}
		return r;
	}

	@Override
	public String eliminar(Perro perro) {
		Connection cone;
		PreparedStatement pst;
		String query = "DELETE FROM PERRO_4 WHERE ID=?";
		String r = null;

		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setInt(1, perro.getId());

			int fila = pst.executeUpdate();
			if (fila > 0) {
				r = "1";
				System.out.println("se elimino-->" + fila);
			} else {
				r = "0";
				System.out.println(" no se elimino-->" + fila);
			}

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error elimino " + e);
		}
		return r;
	}

	@Override
	public Perro buscar(Perro perro) {
		Connection cone;
		PreparedStatement pst;
		ResultSet rs = null;
		String query = "SELECT ID, NOMBRE, RAZA, EDAD FROM PERRO_4 WHERE ID= " + perro.getId();
		String r = null;

		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();

			while (rs.next()) {
				perro = new Perro(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("RAZA"), rs.getInt("EDAD"));
			} // CIERRA WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error buscar " + e);
		}
		return perro;
	}

	@Override
	public List<Perro> listar() {
		List<Perro> lista = new ArrayList<Perro>();

		Connection cone;
		PreparedStatement pst;
		ResultSet rs = null;
		String query = "SELECT ID, NOMBRE, RAZA, EDAD FROM PERRO_4 ORDER BY ID";
		String r = null;

		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();
			while (rs.next()) {
				Perro p = new Perro(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("RAZA"), rs.getInt("EDAD"));
			} // CIERRA WHILE
		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error ELIMINO " + e);
		}

		return lista;
	}

}
