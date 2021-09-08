package ControlPhoto;

import java.sql.SQLException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PhotoControlUser
{
	public synchronized static byte[] load(String code) throws SQLException
	{

		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		byte[] bt = null;

		try
		{
			connection = DriverManagerConnectionPool.getConnection();
			String sql = "SELECT photo FROM cliente WHERE idcliente = " + code;
			stmt = connection.prepareStatement(sql);
			rs = stmt.executeQuery();

			if (rs.next()) 
			{
				bt = rs.getBytes("photo");
			}

		} 
		catch (SQLException sqlException)
		{
			System.out.println(sqlException);
		} 
			finally
			{
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException sqlException)
			{
				System.out.println(sqlException);
			} 
			finally
			{
				if (connection != null) 
				DriverManagerConnectionPool.releaseConnection(connection);
			}
		}
		return bt;
	}

	public synchronized static void updatePhoto(String idA, String photo) throws SQLException 
	{
		Connection con = null;
		PreparedStatement stmt = null;

		try 
		{
			con = DriverManagerConnectionPool.getConnection();

			stmt = con.prepareStatement("UPDATE cliente SET photo = ? WHERE idcliente = ?");
			
			File file = new File(photo);
			try
			{
				FileInputStream fis = new FileInputStream(file);
				stmt.setBinaryStream(1, fis, fis.available());
				stmt.setString(2, idA);
				
				stmt.executeUpdate();
				con.commit();
			}
			catch (FileNotFoundException e) 
			{
				System.out.println(e);
			}
			catch (IOException e) 
			{
				System.out.println(e);
			}
		} 
		finally
		{
			try
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException sqlException) 
			{
				System.out.println(sqlException);
			} 
			finally
			{
				if (con != null)
				DriverManagerConnectionPool.releaseConnection(con);
			}
		}
	}	
}
