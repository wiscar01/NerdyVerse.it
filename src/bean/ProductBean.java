package bean;

import java.io.Serializable;

public class ProductBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	int code;
	String name;
	String description;
	double price;
	int quantity;
	String photo;
	int cart=1;
	
	public ProductBean()
	{
		code = -1;
		name = "";
		description = "";
		quantity = 0;
		photo="?";
	}

	public int getCode() 
	{
		return code;
	}

	public void setCode(int code) 
	{
		this.code = code;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price2) 
	{
		this.price = price2;
	}

	public int getQuantity() 
	{
		return quantity;
	}

	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	public String getPhoto() 
	{
		return photo;
	}
	
	public void setPhoto(String photo) 
	{
		this.photo=photo;
	}
	
	public int getCart()
	{
		return cart;
	}
	
	public void setCart()
	{
		cart++;
	}
	
	public void setCartMeno()
	{
		cart--;
	}

	@Override
	public String toString() 
	{
		return name + " (" + code + "), " + price + " " + quantity + ". " + description;
	}

}
