import java.sql.*;

import oracle.jdbc.OracleDriver;

public class Fourth
{
	public static void main(String arg[])throws Exception
	{
		Connection conn=null;
		Statement stmt=null;
		 
		try
		{
			
		     OracleDriver od=new OracleDriver();
			 DriverManager.registerDriver(od);
				     
		
			 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
			 System.out.println("Connected sucessfully");
				     
			      
			 stmt = conn.createStatement();

			 System.out.println("Fetching records in ascending order...");
			 String sql = "SELECT id, firstname, lastname, age FROM REGISTRATION_DETAILS" +
			                   " ORDER BY firstname ASC";
			 ResultSet rs = stmt.executeQuery(sql);

			while(rs.next())
			{
			        
			         int id  = rs.getInt("id");
			         int age = rs.getInt("age");
			         String firstname = rs.getString("firstname");
			         String lastname = rs.getString("lastname");

			         
			         System.out.print("ID: " + id);
			         System.out.print(", Age: " + age);
			         System.out.print(", Firstname: " + firstname);
			         System.out.println(", Lastname: " + lastname);
			      }

			     
			      System.out.println("Fetching records in descending order");
			      sql = "SELECT id, firstname, lastname, age FROM REGISTRATION_DETAILS" +
			                   " ORDER BY firstname DESC";
			      rs = stmt.executeQuery(sql);

			      while(rs.next()){
			        
			         int id  = rs.getInt("id");
			         int age = rs.getInt("age");
			         String firstname = rs.getString("firstname");
			         String lastname = rs.getString("lastname");

			         
			         System.out.print("ID: " + id);
			         System.out.print(", Age: " + age);
			         System.out.print(", Firstname: " + firstname);
			         System.out.println(", Lastname: " + lastname);
			      }
			      rs.close();
			   }
		catch(SQLException se)
		{
			      
			      se.printStackTrace();
	    }
		catch(Exception e)
		{
			      
			      e.printStackTrace();
		}
		finally
		{
			     
			      try
			      {
			         if(stmt!=null)
			            conn.close();
			      }
			      catch(SQLException se)
			      {
			      }
			      try
			      {
			         if(conn!=null)
			            conn.close();
			      }
			      catch(SQLException se)
			      {
			         se.printStackTrace();
			      }
			   }
			   System.out.println("Goodbye!");
		
		}
}
