/*
 *	File: @(#)PafUserManager.java 	Package: com.palladium.paf.usermanager 	Project: 
 *	Created: Jan 25, 2006  		By: KMoos
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
 Date			Author			Version			Changes
 xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.palladium.paf.usermanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.io.*;

/**
 * Class_description_goes_here
 * 
 * @version x.xx
 * @author KMoos
 * 
 */
public class PafUserManager {

	public static void main(String[] args) {
		try {

			int rowCount = 0;

			// Check for a command line.
			if (args.length == 0) {
				PrintMenu();
				return;
			}

				String [] myargs = new String [7];
				
				for(int i = 0; i < 5; i++){
					if(i < args.length)
						myargs[i] = args[i];
				}
				
				myargs[5] = "F";
				
				myargs[6] = "F";
				
				if(args[5] == "T")
					myargs[5] = "T";
				
				if(args[6] == "T")
					myargs[6] = "T";
				
				rowCount = PerformAction(myargs[0], myargs[1], myargs[2], myargs[3], myargs[4], myargs[5], myargs[6]);


			// Check the return code.
			if (rowCount > 0) {
				System.out.println("Action successful.");
			} else {
				System.out.println("Action failed.");
			}

		} catch (ServerRunningException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
		}
	}

	private static void PrintMenu() {
		System.out.println("");
		System.out.println("=======================================");
		System.out.println("The program adds a new user and takes the following arguments: ");
		System.out.println("");
		System.out.println("[username] [password] [email] [first name] [last name] [is admin] [change password]");
		System.out.println("");
		System.out.println("[username] is required, [is admin] and [change password] default to F (false), and the remaining fields default to blank");
		System.out.println("=======================================");
		System.out.println("");
	}

	private static int PerformAction(String username, String password, String email, String firstname, String lastname, String admin,
			String changepassword) throws Exception {

		int rowCount = 0;

		// ServerSettings serverSettings = PafMetaData.getServerSettings();

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

			String dbPath = pafServerHome
					+ System.getProperty("file.separator")
					+ settings.getProperty("pafSecurityDb");

			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;

			try {

				try {
					conn = DriverManager.getConnection("jdbc:derby:" + dbPath,
							connectionProperties);
				} catch (SQLException sqlExc) {
					throw new ServerRunningException(
							"The server is currently running.  You will have to close the server before continuing.");
				} catch (Exception e) {
					throw new Exception("Exception occurred: " + e.getMessage());
				}


				pstmt = conn
						.prepareStatement("INSERT INTO users (username, password, email, first_name, last_name, admin, change_password) VALUES(?, ?, ?, ?, ?, ?, ?)");

				pstmt.setString(1, username.trim().toLowerCase());
				pstmt.setString(2, password.trim());
				pstmt.setString(3, email.trim());
				pstmt.setString(4, firstname.trim());
				pstmt.setString(5, lastname.trim());
				pstmt.setString(6, admin.trim());
				pstmt.setString(7, changepassword.trim());


				rowCount = pstmt.executeUpdate();

			} catch (SQLException sqlExc) {
				throw new Exception("Sql Exception occurred: "
						+ sqlExc.getMessage());
			} catch (ServerRunningException exp) {
				throw exp;
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

				if (pstmt != null) {
					try {
						pstmt.close();
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
		return rowCount;
	}
}