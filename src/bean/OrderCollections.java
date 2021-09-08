package bean;

import java.util.List;

public class OrderCollections 
{
	private List<OrdineCliente> ordini;
	
	public OrderCollections()
	{
		super();
	}
	
	public void addOrdine(OrdineCliente ordine)
	{
		boolean a=false;
		for(int i=0;i<ordini.size();i++) 
		{
			if(ordini.get(i).getIdordine()==ordine.getIdordine()) 
			{
				ordini.get(i).setList();
				a=true;
			}
		}
		if(a==false)
		{
			ordini.add(ordine);
		}
	}
	
	public void deleteOrdine(OrdineCliente ordine)
	{
		for(OrdineCliente prod : ordini) 
		{
			if(prod.getIdordine() == ordine.getIdordine()) 
			{
				ordini.remove(prod);
				break;
			}
		}
 	}
	
	public List<OrdineCliente> getProducts() 
	{
		return  ordini;
	}
}
