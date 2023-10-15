package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

//import com.dao.InfoDao;

public class Crud {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/myDatabase", "postgres", "sillicon");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
