package com.mx.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mx.Entidad.Pais;
import com.mx.General.Database;
import com.mx.General.MetodosPais;

public class PaisDao implements MetodosPais{
	Database db = new Database();
	@Override
	public String guardar(Pais pais) {
		Connection cone;
		PreparedStatement pst;
		String query = "INSERT INTO PAIS_IL2 VALUES (?,?,?,?)";
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setInt(1, pais.getId());
			pst.setString(2, pais.getNombre());
			pst.setInt(3, pais.getExtension());
			pst.setString(4, pais.getCultura());
			
			
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
	public String eliminar(Pais pais) {
		Connection cone;
		PreparedStatement pst;
		String query = "DELETE FROM PAIS_IL2 WHERE ID=?";
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setInt(1, pais.getId());

			int fila = pst.executeUpdate();
			if (fila > 0) {
				r = "1";
				System.out.println("se ELIMINO insertar-->" + fila);
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
	public String editarr(Pais pais) {
		Connection cone;
		PreparedStatement pst;
		String query = "UPDATE PAIS_IL2 SET NOMBRE=?, EXTENSION=?, CULTURA=? WHERE ID=?";
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setString(1, pais.getNombre());
			pst.setInt(2, pais.getExtension());
			pst.setString(3, pais.getCultura());
			pst.setInt(4, pais.getId());
			
			int fila = pst.executeUpdate();
			if (fila > 0) {
				r = "1";
				System.out.println("se Edito insertar-->" + fila);
			} else {

				r = "0";

				System.out.println("no se guardeo insertar-->" + fila);
			}

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al insertar " + e);
		} // try catch
		return r;
	}

	@Override
	public Pais buscar(Pais pais) {
		Connection cone;
		PreparedStatement pst;
		ResultSet rs = null;
		String query = "SELECT ID, NOMBRE, EXTENSION, CULTURA FROM PAIS_IL2 WHERE ID = " + pais.getId();
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());

			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();

			while (rs.next()) {
				pais = new Pais(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getInt("EXTENSION"),
						rs.getString("CULTURA"));
			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al insertar " + e);
		} // try catch
		return pais;
	}

	@Override
	public List<Pais> listar() {
		List<Pais> lista = new ArrayList<Pais>();
		Connection cone;
		PreparedStatement pst;
		ResultSet rs = null;
		String query = "SELECT ID, NOMBRE, EXTENSION, CULTURA FROM PAIS_IL2 ORDER BY ID ";
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());

			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();

			while (rs.next()) {
				Pais p = new Pais(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getInt("EXTENSION"),
						rs.getString("CULTURA"));

				lista.add(p);

			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al mostrar " + e);
		} // try catch
		return lista;
	}

}
