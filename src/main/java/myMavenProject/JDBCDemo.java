package myMavenProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro2025","root","Jayasri11@");
			
			st=con.createStatement();
			rs=st.executeQuery("select * from wipro_emps");
			while(rs.next())
			{
				int a=rs.getInt("eno");
				String b=rs.getString(2);
				float c=rs.getFloat("salary");
				String d=rs.getString("dept");

				System.out.println(a+ " "+b + " "+c + " "+d );
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		finally
		{
			try
			{
				if(rs!=null) 
					rs.close();
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();
			}
			catch(Exception e)
			{
				System.out.println("Finally Block::"+e);
			}
		}
	}

}
/*1001 Thananya 34932.3 HR
1002 Abi 39932.3 Training
1003 Devi 89032.3 HR
1004 Sai 9000030.0 Testing
*/