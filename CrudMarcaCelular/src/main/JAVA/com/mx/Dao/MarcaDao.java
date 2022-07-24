package com.mx.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mx.Entidad.Marca;
import com.mx.General.Database;
import com.mx.General.MetodosCelular;

public class MarcaDao implements MetodosCelular{	
	Database db = new Database();
	
	@Override
	public String guardar(Marca marca) {
		Connection cone;
		PreparedStatement pst;
		String query = "INSERT INTO MARCA_CELULAR_IL5 VALUES (?,?,?,?,?,?,?)";
		String r=null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setInt(1, marca.getId());
			pst.setString(2, marca.getModelo());
			pst.setString(3, marca.getMarca());
			pst.setInt(4, marca.getPrecio());
			pst.setString(5, marca.getColor());
			pst.setInt(6, marca.getRam());
			pst.setInt(7, marca.getStock());
			
			
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
	public String eliminar(Marca marca) {
		Connection cone;
		PreparedStatement pst;
		String query = "DELETE FROM MARCA_CELULAR_IL5 WHERE ID=?";
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			
			pst = cone.prepareStatement(query);
			pst.setInt(1, marca.getId());

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
	public String editarr(Marca marca) {
		Connection cone;
		PreparedStatement pst;
		String query = "UPDATE MARCA_CELULAR_IL5 SET MODELO=?, MARCA=?, PRECIO=?, COLOR=?, RAM=?, STOCK=? WHERE ID=?";
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			pst = cone.prepareStatement(query);
			pst.setString(1, marca.getModelo());
			pst.setString(2, marca.getMarca());
			pst.setInt(3, marca.getPrecio());
			pst.setString(4, marca.getColor());
			pst.setInt(5, marca.getRam());
			pst.setInt(6, marca.getStock());
			pst.setInt(7, marca.getId());

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
	public Marca buscar(Marca marca) {
		Connection cone;
		PreparedStatement pst;
		ResultSet rs = null;
		String query = "SELECT ID, MODELO, MARCA, PRECIO, COLOR, RAM, STOCK FROM MARCA_CELULAR_IL5 WHERE ID = " + marca.getId();
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());

			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();

			while (rs.next()) {
				marca = new Marca(rs.getInt("ID"), rs.getString("MODELO"), rs.getString("MARCA"),
						rs.getInt("PRECIO"), rs.getString("COLOR"), rs.getInt("RAM"),rs.getInt("STOCK"));
			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al insertar " + e);
		} // try catch
		return marca;
	}

	@Override
	public List<Marca> listar() {
		List<Marca> lista = new ArrayList<Marca>();
		Connection cone;
		PreparedStatement pst;
		ResultSet rs = null;
		String query = "SELECT ID, MODELO, MARCA, PRECIO, COLOR, RAM, STOCK FROM MARCA_CELULAR_IL5 ORDER BY ID ";
		String r = null;
		try {

			Class.forName(db.getDriver());
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());

			pst = cone.prepareStatement(query);
			rs = pst.executeQuery();

			while (rs.next()) {
				Marca m = new Marca(rs.getInt("ID"), rs.getString("MODELO"), rs.getString("MARCA"),
						rs.getInt("PRECIO"), rs.getString("COLOR"), rs.getInt("RAM"),rs.getInt("STOCK"));

				lista.add(m);

			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al mostrar " + e);
		} // try catch
		return lista;
	}

}
