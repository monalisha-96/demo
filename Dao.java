
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-AK8A372:1521:xe","system","system");
		}
		catch(Exception e){}
		return con;
	}
	public static int insert(Data obj)
	{
		int i=0;
		try
		{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into library values (?,?,?,?)");
		ps.setString(1, obj.getName());
		ps.setString(2, obj.getEmail());
		ps.setString(3, obj.getPassword());
		ps.setString(4, obj.getMobile());
		i=ps.executeUpdate();
		}
		catch(Exception e){}
		return i;
		
	}
	public static Data validate(String email,String password)
	{
		Data obj=null;
		try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from library where email=?");
		ps.setString(1, email);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			obj=new Data(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		}
		catch(Exception e){}
		if(password.equals(obj.getPassword()))
		{
			return obj;
		}
		return null;
		
	}
	public static int insertBook(Book obj)
	{
		int i=0;
		try
		{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into Book values (?,?,?)");
		ps.setString(1, obj.getName());
		ps.setString(2, obj.getAuthor());
		ps.setString(3, obj.getCallno());
		i=ps.executeUpdate();
		}
		catch(Exception e){}
		return i;
		
	}
	public static ArrayList<Book> view()
	{
		ArrayList<Book> al=new ArrayList<>();
		try
		{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from Book");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Book obj=new Book(rs.getString(1),rs.getString(2),rs.getString(3));
				al.add(obj);
			}
		}
		catch(Exception e){}
		return al;
		
	}
}
