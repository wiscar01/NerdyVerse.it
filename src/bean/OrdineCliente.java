package bean;

public class OrdineCliente 
{
	private int idordine;
	private String data;
	private int importoPagamento;
	private int list;
	
	public OrdineCliente() 
	{
		idordine=-1;
		data="";
		importoPagamento=-1;
		list=1;
	}
	
	public int getIdordine()
	{
		return idordine;
	}
	
	public String getData() 
	{
		return data;
	}
	
	public int getImportopagamento() 
	{
		return importoPagamento;
	}
	
	public void setIdordine(int idordine) 
	{
		this.idordine=idordine;
	}
	
	public void setData(String data) 
	{
		this.data=data;
	}
	
	public void setImportopagamento(int idpagamento) 
	{
		this.importoPagamento=idpagamento;
	}
	
	public int getList() 
	{
		return this.list;
	}
	
	public void setList() 
	{
		list++;
	}
	
	public String toString() 
	{
		return "[idOrdine= "+idordine+"][Data= "+data+"][importoPagamento= "+importoPagamento+"]";
	}
}
