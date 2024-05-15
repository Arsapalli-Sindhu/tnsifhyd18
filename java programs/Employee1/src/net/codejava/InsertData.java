package net.codejava;

import java.sql.*;
public class InsertData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "1402";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    
		    String sql = "INSERT INTO employee (emp_name, emp_sal,emp_mail) VALUES ( ?, ?, ?)";
		   
		    PreparedStatement statement = conn.prepareStatement(sql);
		   
		     statement.setString(1, "M.Swathi Reddy");
		    statement.setString(2, "55000");
		    statement.setString(3, "mswathi@microsoft.com");
		    
		    int rowsInserted = statement.executeUpdate();
		   
		    
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		   
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}