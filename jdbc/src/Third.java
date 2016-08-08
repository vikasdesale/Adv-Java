
import java.sql.*;

import oracle.jdbc.OracleDriver;

public class Third
{
	public static void main(String arg[])throws Exception
	{
		Connection conn=null;
		Statement stmt=null;
		
		 try
	     {
	     
	         OracleDriver od=new OracleDriver();
		     DriverManager.registerDriver(od);
	     
	         System.out.println("Connecting to database");
	         conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","saibaba");
	         System.out.println("Connected sucessfully");
	     
	     
	    
	         stmt = conn.createStatement();
	         String sql = "UPDATE REGISTRATION_DETAILS" +
	                   "SET age = 21 WHERE id in (100)";
	         stmt.executeUpdate(sql);
	         
	         sql = "SELECT id, firstname, lastname, age FROM REGISTRATION_DETAILS";
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