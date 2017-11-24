package com.hsbc.registro.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

public class Connexion {

	private static Connection con = null;

	public static Connection getCoonection() {

		if (con != null) {
			return con;
		} else {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/HSBC";
				String user = "root";
				String pass = "";

				con = DriverManager.getConnection(url, user, pass);
				System.out.println("Conexion exitosa");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;

		}

	}
	
	public static void main(String[] args) {
		Connexion con = new Connexion();
		con.getCoonection();
	}

}
