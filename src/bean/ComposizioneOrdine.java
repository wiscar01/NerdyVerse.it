package bean;

public class ComposizioneOrdine
{
	private int idOrdine;
	private int idProdotto;
	private int quantit�;
	private int list;
	private double prezzopagato;
	
	public ComposizioneOrdine()
	{
		idProdotto=-1;
		idOrdine=-1;
		quantit�=-1;	
		prezzopagato=-1;
		list=1;
	}
	
	

	public double getPrezzopagato()
	{
		return prezzopagato;
	}



	public void setPrezzopagato(double prezzopagato)
	{
		this.prezzopagato = prezzopagato;
	}



	public int getOrdine()
	{
		return idOrdine;
	}
	
	public int getProdotto() 
	{
		return idProdotto;
	}
	
	public int getQuantit�() 
	{
		return quantit�;
	}
	
	public void setOrdine(int idordine) 
	{
		this.idOrdine=idordine;
	}
	
	public void setProdotto(int idprodotto) 
	{
		this.idProdotto=idprodotto;
	}
	
	public void setQuantit�(int quantit�) 
	{
		this.quantit�=quantit�;
	}
	
	public int getList()
	{
		return this.list;
	}
	
	public void setList() 
	{
		list++;
	}
}
