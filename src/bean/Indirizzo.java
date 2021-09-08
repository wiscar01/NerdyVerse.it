package bean;

public class Indirizzo
{
	private int idcliente;
	private String indirizzo;
	private int idindirizzo;
	private String città;
	private int cap;
	private String provincia;
	private String nome;
	private String cognome;
	
	public Indirizzo()
	{
		idcliente=-1;
		idindirizzo=-1;
		indirizzo="";
		città ="";
		cap=-1;
		provincia="";
		nome="";
		cognome="";
	}
	public int getIdcliente() {
		return idcliente;
	}
	
	public int getIdindirizzo()
	{
		return idindirizzo;
	}

	public int getCap() 
	{
		return cap;
	}
	
	public String getIndirizzo() 
	{
		return indirizzo;
	}
	
	public String getCittà()
	{
		return città;
	}
	
	public String getProvincia() 
	{
		return provincia;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public String getCognome() 
	{
		return cognome;
	}
	
	public void setIdcliente(int id) 
	{
		this.idcliente=id;
	}
	
	public void setIdindirizzo(int id)
	{
		this.idindirizzo=id;
	}
	
	public void setIndirizzo(String indirizzo) 
	{
		this.indirizzo=indirizzo;
	}
	
	public void setCittà(String città) 
	{
		this.città=città;
	}
	
	public void setProvincia(String provincia) 
	{
		this.provincia=provincia;
	}
	
	public void setNome(String nome) 
	{
		this.nome=nome;
	}
	
	public void setCognome(String cognome)
	{
		this.cognome=cognome;
	}
	
	public void setCap(int cap) 
	{
		this.cap=cap;
	}
	
	public String toString() 
	{
		return nome+" "+cognome+" "+provincia+" "+città+" "+indirizzo;
	}
}
