package com.mx.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mx.Entidad.Marca;
import com.mx.General.Database;
import com.mx.General.MetodosMarca;

public class MarcaDao implements MetodosMarca{
	Database db = new Database();
	@Override
	public String guardar(Marca marca) {
		//
		Connection cone;
		//
		PreparedStatement pst;
		//EL ? ES EL NUMERO DE ATRIBUTOS EN BDD DEBE COINCIDIR CON  JAVA ATRIBUTOS
		String query = "INSERT INTO MARCA_IL2 VALUES (?,?,?,?)";
		String r = null;
		try {
			//CONTROLADOR
			Class.forName(db.getDriver());
			//LLAMAMOS LA CONEXION PARA QUE RECONOZCA QUE GUARDAMOS LOS CAMBIOS
			cone = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getPassword());
			//
			pst = cone.prepareStatement(query);
			//
			pst.setInt(1, marca.getId());
			pst.setString(2, marca.getNombre());
			pst.setString(3, marca.getModelo());
			pst.setString(4, marca.getColor());
			
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

	@Override
	public String eliminar(Marca marca) {
		//
		Connection cone;
		//
		PreparedStatement pst;
		//HACEMOS LA CONSULTA DE ELIMIAR YA QUE ELIMINAMOS POR ID
		String query = "DELETE FROM MARCA_IL2 WHERE ID=?";
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
			pst.setInt(1, marca.getId());
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
	public String editar(Marca marca) {
		//
		Connection cone;
		//
		PreparedStatement pst;
		//ACTUALIZAMOS CON UPDATE SELECCIONAMOS LOS CAMPOS  POR ID
		String query = "UPDATE MARCA_IL2 SET NOMBRE=?, MODELO=?, COLOR=? WHERE ID=?";
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
			pst.setString(1, marca.getNombre());
			pst.setString(2, marca.getModelo());
			pst.setString(3, marca.getColor());
			//CON EL OBJETO PROFESOR VOY A PASAR LA CONSULTA
			pst.setInt(4, marca.getId());
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
	public Marca buscar(Marca marca) {
		//
		Connection cone;
		//
		PreparedStatement pst;
		//IPORTAMOS LA LIBRERIA RESULSET MUESTRA EL CAMBO DE 
		ResultSet rs = null;
		//HACEMOS LA BUSQUEDA CONFORME A LOS CAMPOS////// Y  LO CONCATENAMOS CON EL PROFESOR POR ID
		String query = "SELECT ID, NOMBRE, MODELO, COLOR FROM MARCA_IL2 WHERE ID = " + marca.getId();
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
				marca = new Marca(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("MODELO"),
						rs.getString("COLOR"));
			} // FIN WHILE

		} catch (Exception e) {
			r = e.getMessage();
			System.out.println("Error al insertar " + e);
		} // try catch
		return marca;
	}

	@Override
	public List<Marca> listar() {
		//
		List<Marca> lista = new ArrayList<Marca>();
		//
		Connection cone;
		//
		PreparedStatement pst;
		//
		ResultSet rs = null;
		//HACEMOS LA CONSULTA DE PROFESOR NOS MUESTRA POR ID
		String query = "SELECT ID, NOMBRE, MODELO, COLOR FROM MARCA_IL2 ORDER BY ID ";
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
				Marca p = new Marca(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("MODELO"),
						rs.getString("COLOR"));
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
