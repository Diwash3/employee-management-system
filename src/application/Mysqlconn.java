package application;

import java.sql.*;

public class Mysqlconn {
	public Connection c;
	public Statement s;

	public Mysqlconn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root","hell@123");
			s = c.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Oops Error!");
		}

	}
}
