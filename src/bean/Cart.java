package bean;

import java.util.ArrayList;
import java.util.List;

public class Cart 
{

	private List<ProductBean> products;
	
	public Cart() 
	{
		products = new ArrayList<ProductBean>();
	}
	
	public void addProduct(ProductBean product)
	{
		boolean a=false;
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getCode()==product.getCode())
			{
				products.get(i).setCart();
				a=true;
			}
		}
		if(a==false) 
		{
			products.add(product);
		}
	}
	
	public void deleteProduct(ProductBean product)
	{
		for(ProductBean prod : products) 
		{
			if(prod.getCode() == product.getCode())
			{
				products.remove(prod);
				break;
			}
		}
 	}
	
	public List<ProductBean> getProducts() 
	{
		return  products;
	}
}
