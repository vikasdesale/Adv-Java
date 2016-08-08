import java.sql.*;

public class SampleJDBC {
	static final String jdbc_driver = "com.mysql.jdbc.Driver";
	static final String db_url = "jdbc:mysql://localhost:3306/student";
	 static final String USER = "root";
	   static final String PASS = "";

	   public static void main(String...args){
		   Connection conn = null;
		   Statement stmt = null;
		   ResultSet rs;
		   try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		   try {
			conn = DriverManager.getConnection(db_url,USER,PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println("Creating a statement...");
		   try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   String sql = "Select * from student";
		   try {
			 rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			rs = null;
			e.printStackTrace();
		}
		   try {
			while(rs.next()){
			         //Retrieve by column name
			         
			         int age = rs.getInt("age");
			         String name = rs.getString("name");
			         String email = rs.getString("email");

			         //Display values
			         System.out.print("Email: " + email);
			         System.out.print(", Age: " + age);
			         System.out.print(", Name: " + name);
			        
			      }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		      try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	    

}
