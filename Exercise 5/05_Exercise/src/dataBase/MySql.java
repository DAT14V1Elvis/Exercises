package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class MySql
{
	Connection conn = null;
	PreparedStatement prepareStatement = null;
	ResultSet result = null;

	ArrayList<String> dbList = new ArrayList<String>();
	
	int id;
	String name;
	String lastName;
	int phone;
	String mail;


	public void insertDB(String name, String lastName, int phone, String mail) throws SQLException
	{
		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=nintendo2650");
			prepareStatement = conn.prepareStatement("INSERT INTO customers VALUES(default, ?, ?, ?, ?)");

			prepareStatement.setString(1,name);
			prepareStatement.setString(2,lastName);
			prepareStatement.setInt(3, phone);
			prepareStatement.setString(4,mail);

			prepareStatement.executeUpdate();
		}

		catch (SQLException e)
		{
			System.err.println(e);
		}

		finally
		{
			if(conn != null)
			{
				conn.close();
			}
		}
	}


	public void dataBaseRead() throws SQLException
	{
		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=nintendo2650");
			prepareStatement = conn.prepareStatement("SELECT * FROM customers ORDER BY id DESC LIMIT 1 ");
			result = prepareStatement.executeQuery();

			while(result.next())
			{
				dbList.add(result.getString("name"));
				dbList.add(result.getString("last_name"));
				dbList.add(result.getString("phone"));
				dbList.add(result.getString("email"));
			}
		}

		catch (SQLException e)
		{
			System.err.println(e);
		}

		finally
		{
			if(conn != null)
			{
				conn.close();
			}
		}
	}


	public String arrayToString() throws SQLException
	{
		dataBaseRead();
		return dbList.toString();
	}
}