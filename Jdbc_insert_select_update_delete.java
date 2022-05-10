package Net.Lvy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class usersManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3306/Testing1";
		String dbusername = "root";
		String password = "Lovi#123";
		
		String Name = "RiyaBhatia";
		String Username = "Riya";
		String email = "Riyabhatia@gmail.com";
		String Pass = "None";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL,dbusername,password);
			
//			if(connection!=null) {
//				System.out.println("Connected to Database");
//				connection.close();
//			}
			
			
//			##################################################
//			---------------Inserting Values ---------------
//			##################################################
			
//			Static Values
//			String sql = "INSERT INTO users (username,email,fullname,password)"+"VALUES('Lovish','lovishb41@gmail.com','Lovish Bhatia','None')";
//			Statement statement = connection.createStatement();
//			int rows = statement.executeUpdate(sql);
//			
//			if(rows>1) {
//				System.out.println("data added");
//			}

//			Duplicating Data for deletion
			
//			String sql = "INSERT INTO users (username,email,fullname,password)"+"VALUES('Lovish2','lovishb412@gmail.com','Lovish Bhatia 2','None')";
//			Statement statement = connection.createStatement();
//			int rows = statement.executeUpdate(sql);
//			
//			if(rows>1) {
//				System.out.println("data added");
//			}
			
//			Dynamic Values
//			String sql = "INSERT INTO users (username,email,fullname,password)"+"VALUES(?,?,?,?)";
//			
//			PreparedStatement statement = connection.prepareStatement(sql);
//			
//			statement.setString(1, Username);
//			statement.setString(2, email);
//			statement.setString(3, Name);
//			statement.setString(4, Pass);
//			
//			int rows = statement.executeUpdate();
			
			
//			##################################################
//			---------------Selecting Values ---------------
//			##################################################
//			String sql = "SELECT * FROM users";
//			Statement statement = connection.createStatement();
//			ResultSet result = statement.executeQuery(sql);
//			
//			while(result.next()) {
//				int userId = result.getInt("user_Id");
//				String username = result.getString(2);
//				
//				System.out.println(userId+" "+username);
//			}
			
//			##################################################
//			---------------Updating Values ---------------
//			##################################################
//			Static statement same as Inserting
//			String sql = "UPDATE users SET password=? WHERE username = ?";
//			String newPass = "NewPass";
//			
//			
//			PreparedStatement statement = connection.prepareStatement(sql);
//			statement.setString(1, newPass);
//			statement.setString(2, Username);
//			
//			int rows = statement.executeUpdate();
			
			
//			##################################################
//			---------------Deleting Values ---------------
//			##################################################
			String sql = "DELETE FROM users WHERE username = ?";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "Lovish2");
			int rows = statement.executeUpdate();
			
			connection.close();
				
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

}
