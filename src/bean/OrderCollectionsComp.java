package bean;

import java.util.List;

public class OrderCollectionsComp {
	private List<ComposizioneOrdine> ordini;
	
	public OrderCollectionsComp() {
		super();
	}
	
	public void addOrdine(ComposizioneOrdine ordine) 
	{
		boolean a=false;
		for(int i=0;i<ordini.size();i++) 
		{
			if(ordini.get(i).getOrdine()==ordine.getOrdine()) 
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
	
	public void deleteOrdine(ComposizioneOrdine ordine) 
	{
		for(ComposizioneOrdine prod : ordini) {
			if(prod.getOrdine() == ordine.getOrdine())
			{
				ordini.remove(prod);
				break;
			}
		}
 	}
	
	public List<ComposizioneOrdine> getProducts() 
	{
		return  ordini;
	}
}
