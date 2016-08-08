import java.sql.*;

import oracle.jdbc.OracleDriver;


public class Jdbc 
{
	public static void main(String args[]) throws Exception
	{
		OracleDriver od=new OracleDriver();
		DriverManager.registerDriver(od);
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		if(conn!=null)
		{
			System.out.println("connection establish sucessfully");
		}
		
	}
}

