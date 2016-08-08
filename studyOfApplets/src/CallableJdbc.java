import java.sql.*;
public class CallableJdbc {
	static final String Jdbc="com.mysql.jdbc.Driver";
	static final String Dburl="jdbc:mysql://localhost:3306/customerdb";
	public static void main(String args[])
	{
		Connection con=null;
		CallableStatement cs=null;
		try
		{
			//Class.forName(Jdbc);
			System.out.print("\nConnecting to Database...");
			Pass p=new Pass();
			con=DriverManager.getConnection(Dburl,"root",p.pass);
			System.out.print("\nCreating statement...");
			String sql="{call getCustname(?,?)}";
			cs=con.prepareCall(sql);
			int id=10;
			cs.setInt(1,id);
			cs.registerOutParameter(2,java.sql.Types.VARCHAR);
			String fn=cs.getString(2);
			System.out.println("empname with ID:"+id+"is"+fn);
			cs.close();
			con.close();
		}
		catch(SQLException se)
		{
		System.out.println("SqlException"+ se);	
		}
		catch(Exception ex)
		{
		System.out.println("some other Excepiton"+ ex);		
		}
		
	}
}
