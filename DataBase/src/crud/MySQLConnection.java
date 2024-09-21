package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

	public Connection conn;
	//private final String DRIVER = "conn.mysql.jdbc.Driver";
	private final String DB_Name = "locadora";
	private final String DB = "jdbc:mysql://localhost:3306/" + DB_Name;
	private final String USER = "root";
	private final String PASSWORD = "senaisp";
	
	public boolean getConnection() throws ClassNotFoundException{
		
		try {
			//Class.forName(DRIVER);
			conn = DriverManager.getConnection(DB, USER, PASSWORD);
			System.out.println("Conectado com sucesso!");
			return true;
		
		} catch(SQLException e) {
			System.out.println("Problema com a conexão!" + e.getMessage());
			return false;
		}
			
	}
	
	public void closeConnection() {
		
		try {
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		System.out.println("Usuário desconectado!");
	}
	
}
