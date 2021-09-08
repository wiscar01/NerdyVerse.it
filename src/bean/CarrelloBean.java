package bean;

public class CarrelloBean 
{
	private int idprodottocarrello;
	private int idprodotto;
	private int idordine;
	
	public CarrelloBean()
	{
		idordine=-1;
		idprodotto=-1;
		idprodottocarrello=-1;
	}

	public int getIdprodottocarrello()
	{
		return idprodottocarrello;
	}

	public void setIdprodottocarrello(int idprodottocarrello) 
	{
		this.idprodottocarrello = idprodottocarrello;
	}

	public int getIdprodotto() 
	{
		return idprodotto;
	}

	public void setIdprodotto(int idprodotto) 
	{
		this.idprodotto = idprodotto;
	}

	public int getIdordine() 
	{
		return idordine;
	}

	public void setIdordine(int idordine) 
	{
		this.idordine = idordine;
	}
}
