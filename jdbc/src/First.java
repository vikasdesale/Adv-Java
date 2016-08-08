import java.sql.*;

import oracle.jdbc.OracleDriver;

public class First
{
	public static void main(String ags[])throws Exception
	{
		 Connection conn=null;
		 Statement stmt=null;
		 try
		 {
			 OracleDriver od=new OracleDriver();
			 DriverManager.registerDriver(od);
			   
		      System.out.println("Connecting to database");
		      conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		      System.out.println("Connected sucessfully");
		      
		      System.out.println("Creating table");
		      stmt = conn.createStatement();
		      
		      String sql = "CREATE TABLE REGISTRATION_DETAILS " +
		                   "(id INTEGER not NULL, " +
		                   " firstname VARCHAR(255), " + 
		                   " lastname VARCHAR(255), " + 
		                   " age INTEGER, " + 
		                   " PRIMARY KEY ( id ))"; 
		      stmt.executeUpdate(sql);
		      System.out.println("Created table in database");
		   }
		   
		   catch(SQLException se)
		   {
		   
		     se.printStackTrace();
		  
		   }
		   
		   catch(Exception e)
		   {
		  
		      e.printStackTrace();
		   }
		   finally{
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
		  