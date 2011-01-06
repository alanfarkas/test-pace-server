package com.palladium.paf.usermanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.io.*;
import com.Ostermiller.util.Base64;


public class OutputUsersTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		// Get the properties file.
		Properties settings = new Properties();
		// Get a file stream.
		FileInputStream fileIn = null;

		try {
			fileIn = new FileInputStream("usermanager.properties");
		} catch (FileNotFoundException ex) {
			throw new Exception("Cannot find file: " + "usermanager.properties");
		}
		settings.load(fileIn);

		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			throw new Exception("Class not found: "
					+ "org.apache.derby.jdbc.EmbeddedDriver");
		} catch (Exception ex) {
			throw ex;
		}

		Properties connectionProperties = new Properties();
		connectionProperties.put("bootPassword", settings
				.getProperty("pafSecurityBootupPassword"));
		connectionProperties.put("user", settings
				.getProperty("pafSecurityUser"));
		connectionProperties.put("password", settings
				.getProperty("pafSecurityPassword"));

		String pafServerHome = settings.getProperty("pafServerHome");

		if (pafServerHome != null && pafServerHome.trim().length() > 0) {
			
			String dbPath = pafServerHome + System.getProperty("file.separator")
					+ settings.getProperty("pafSecurityDb");

			Connection conn = null;
			Statement stmt = null;
			ResultSet rset = null;

			try {
				conn = DriverManager.getConnection("jdbc:derby:" + dbPath,
						connectionProperties);
			} catch (SQLException sqlExc) {
				System.out
						.println("The server is currently running.  You will have to close the server before continuing.");
				return;
			} catch (Exception e) {
				throw new Exception("Exception occurred: " + e.getMessage());
			} finally {

				if (fileIn != null)
					try {
						fileIn.close();
					} catch (Exception e) {
						// ignore it.
					}
			}

			try {
				stmt = conn.createStatement();
				rset = stmt.executeQuery("Select username, password from users");
				System.out.println("UserName,Password,Email,FirstName,LastName,Administrator,ChangePassword");
				while (rset.next()) {
					System.out.println(rset.getString(1) + "," + Base64.encode(rset.getString(2))+",,,,F,F");
				}

				// Connection
				// conn=DriverManager.getConnection("jdbc:derby:pafsecurity");
			} catch (SQLException sqlExc) {
				throw new Exception("Sql Exception occurred: "
						+ sqlExc.getMessage());
			} catch (Exception e) {
				throw new Exception("Exception occurred: " + e.getMessage());
			} finally {

				if (fileIn != null)
					try {
						fileIn.close();
					} catch (Exception e) {
						// ignore it.
					}

				if (rset != null) {
					try {
						rset.close();
					} catch (SQLException e) {
						// do nothing
					}
				}

				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						// do nothing
					}
				}

				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						// do nothing
					}
				}
			}
		} else {
			System.out
			.println("pafServerHome needs to be set in the properties file.");
		}
	}
}
