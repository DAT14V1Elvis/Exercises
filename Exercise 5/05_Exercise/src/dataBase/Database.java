package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

import application.Customer;


public class Database
{
	Connection conn = null;
	PreparedStatement prepareStatement = null;
	ResultSet result = null;

	ArrayList<String> dbList = new ArrayList<String>();

	public void insertDB(Customer c) throws SQLException
	{
		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=nintendo2650");
			prepareStatement = conn.prepareStatement("INSERT INTO customers VALUES(default, ?, ?, ?, ?)");

			prepareStatement.setString(1,c.getName());
			prepareStatement.setString(2,c.getLastName());
			prepareStatement.setString(3, c.getPhone());
			prepareStatement.setString(4,c.getMail());

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



