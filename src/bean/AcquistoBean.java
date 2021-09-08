package bean;

public class AcquistoBean 
{
	private int idOrdine;
	private int idCliente;
	
	public AcquistoBean() 
	{
		idCliente=-1;
		idOrdine=-1;
	}

	public int getIdOrdine() 
	{
		return idOrdine;
	}

	public void setIdOrdine(int idOrdine) 
	{
		this.idOrdine = idOrdine;
	}

	public int getIdCliente() 
	{
		return idCliente;
	}

	public void setIdCliente(int idCliente) 
	{
		this.idCliente = idCliente;
	}
}
