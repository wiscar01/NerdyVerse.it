package bean;

public class Cliente 
{
	private int idcliente;
	private String email;
	private String username;
	private String password;
	
	public Cliente() 
	{
		idcliente=-1;
		email="";
		username="";
		password="";
	}
	
	
	public int getId() 
	{
		return idcliente;
	}
	
	public void setId(int idcliente) 
	{
		this.idcliente=idcliente;
	}
	
	public void setEmail(String email) 
	{
		this.email=email;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setUser(String username) 
	{
		this.username=username;
	}
	
	public String getUser()
	{
		return this.username;
	}
	
	public void setPass(String password)
	{
		this.password=password;
	}
	
	public String getPass() 
	{
		return this.password;
	}
	
	public String toString() 
	{
		return idcliente+", "+email+", "+username+", "+password;
	}
}
