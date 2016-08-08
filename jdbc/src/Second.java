
import java.sql.*;

import oracle.jdbc.OracleDriver;
 public class Second
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
		     System.out.println("Connected successfully...");
		     
		      System.out.println("Inserting records");
		      
		      stmt = conn.createStatement();
		      String sql = "INSERT INTO REGISTRATION_DETAILS " +
		                   "VALUES (100, 'kajal', 'musne', 18)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO REGISTRATION_DETAILS " +
		                   "VALUES (101, 'kiran', 'vyavahare', 19)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO REGISTRATION_DETAILS " +
		                   "VALUES (102, 'jagruti', 'patil', 20)";
		      stmt.executeUpdate(sql);
		     
		      System.out.println("Insert records into table");

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
