package de.codingenieur.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static final String DB_NAME = "kontakt.sqlite";
	public static final String PATH = "/Users/christian/Documents/coding Java/Workspace - Eclipse/Datenbank Programm mit Sqlite/src/";
	public static final String CONNECTION_STRING = "jdbc:sqlite:" + PATH + DB_NAME;

	private Connection connection;
	private Statement statement;

	public boolean open() {

		try {
			connection = DriverManager.getConnection(CONNECTION_STRING);
			statement = connection.createStatement();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	

	public Connection getConnection() {
		return connection;
	}
	
	public Statement getStatement() {
		return statement;
	}
}
