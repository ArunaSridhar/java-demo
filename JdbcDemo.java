package JavaDemo;
import java.sql.*;

public class JdbcDemo {
	public static void main(String arg[])
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Mydb","ArunaSridhar","2789");
			Statement stmt=connection.createStatement();
			ResultSet result=stmt.executeQuery("select * from Demo");
			
			while(result.next())
			{
				System.out.print(result.getInt(1)+"   ");
				System.out.print(result.getString(2)+"   ");	
			}
			
			result.close();
			stmt.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}




