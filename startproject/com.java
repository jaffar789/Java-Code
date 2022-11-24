package startproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class com {

	public static void main(String[] args) {
		
		try {
			Connection myCon = DriverManager.getConnection("jdbc:mysql80://localhost:3306/tapacademy","root","root");
			System.out.println("connection established");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
