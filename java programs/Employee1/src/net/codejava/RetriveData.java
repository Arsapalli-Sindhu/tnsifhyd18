package net.codejava;

import java.sql.*;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "1402";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String emp_name = result.getString(2);
			    String emp_sal = result.getString("emp_sal");
			    String emp_mail = result.getString("emp_mail");
			 
			    String output = "employee #%d: %s - %s - %s";
			    System.out.println(String.format(output, ++count, emp_name ,emp_sal,emp_mail));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
