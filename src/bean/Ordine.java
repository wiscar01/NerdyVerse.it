package bean;

public class Ordine 
{
	private int idordine;
	private String data;
	private int idpagamento;
	
	public Ordine() 
	{
		idordine=-1;
		data="";
		idpagamento=-1;
	}
	
	public int getIdordine() 
	{
		return idordine;
	}
	
	public String getData() 
	{
		return data;
	}
	
	public int getIdpagamento() 
	{
		return idpagamento;
	}
	
	public void setIdordine(int idordine) 
	{
		this.idordine=idordine;
	}
	
	public void setData(String data) 
	{
		this.data=data;
	}
	
	public void setIdpagamento(int idpagamento) 
	{
		this.idpagamento=idpagamento;
	}
	
	public String toString() {
		return "[idOrdine= "+idordine+"][Data= "+data+"][idPagamento= "+idpagamento+"]";
	}
}
