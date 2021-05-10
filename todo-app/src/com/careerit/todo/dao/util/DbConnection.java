package com.careerit.todo.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum DbConnection {
	util;

	private static final Logger log = Logger.getLogger(DbConnection.class.getName());
	private static final String url = "jdbc:mysql://localhost:3306/batch_7";
	static {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, "user", "user");
		} catch (SQLException e) {
			log.log(Level.SEVERE, "While connecting with db:" + e);
		}
		return con;

	}

	public void close(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			log.info("While closing resource :" + e);
		}
	}

	public void close(Statement st, Connection con) {
		try {

			if (st != null)
				st.close();
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			log.info("While closing resource :" + e);
		}
	}

}
