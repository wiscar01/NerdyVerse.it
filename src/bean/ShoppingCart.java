package bean;
import java.util.*;

import it.unisa.Billing;
import it.unisa.Shipping;
import it.unisa.ShoppingCartException;

import java.io.*;

public class ShoppingCart implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	
    protected Vector<ProductBean> items;

    public ShoppingCart()
    {
        items = new Vector<ProductBean>();
    }

/** Returns a Vector containing the items in the cart. The Vector
 *  returned is a clone, so modifying the vector won't affect the
 *  contents of the cart.
 */
    @SuppressWarnings("rawtypes")
	public Vector getItems()
    {
        return (Vector) items.clone();
    }

    @SuppressWarnings("unchecked")
	public void addItem(ProductBean newItem)
    {
    	boolean a=false;
    	int size=items.size();
		for(int i=0;i<size;i++) 
		{
			ProductBean bean= new ProductBean();
			bean=(ProductBean) items.elementAt(i);
			if(bean.getCode()==newItem.getCode()) 
			{
				bean.setCart();
				items.remove(i);
				items.add(i, bean);
				a=true;
				System.out.println(items+"\n");
			}
		}
		if(a==false)
		{
			items.add(newItem);
		}
    }

    public void removeItem(int itemIndex)
    {	
    	ProductBean bean= new ProductBean();
		bean=(ProductBean) items.elementAt(itemIndex);
		if(bean.getCart()==1) 
		{
			items.removeElementAt(itemIndex);
		} else 
		{
			bean.setCartMeno();
			items.remove(itemIndex);
			items.add(itemIndex, bean);
		}
    }

// Warning! This order number is reset every time the server is
// restarted. This technique of generating an order number is
// just for demonstration.
    protected static int nextOrderNumber = 1;

// Submit the order and return a confirmation number.
    @SuppressWarnings("rawtypes")
	public String completeOrder(Shipping shipping, Billing billing)
        throws ShoppingCartException
    {
// You would normally insert the order into a database or send
// it to an application server. For the sake of simplicity
// this shopping cart just writes the order to a file.
        try
        {
            int orderNumber = 0;

// Make sure no other threads can be generating an order number.
            synchronized (this)
            {
                orderNumber = nextOrderNumber;
                nextOrderNumber = nextOrderNumber + 1;
            }
            PrintWriter out = new PrintWriter(new FileOutputStream("order"+orderNumber));

// Print the shipping info.
            out.println(shipping.name);
            out.println(shipping.address1);
            if (shipping.address2 != null)
            {
                out.println(shipping.address2);
            }
            out.print(shipping.city);
            if (shipping.state != null)
            {
                out.print(", "+shipping.state);
            }
            if (shipping.postalCode != null)
            {
                out.print(" "+shipping.postalCode);
            }
            out.println(" "+shipping.country);
            out.println(shipping.email);

// Print the billing info.
            out.println(billing.nameOnCard);
            out.println(billing.creditCardType);
            out.println(billing.creditCardNumber);
            out.println(billing.creditCardExpiration);

// Print out the items.
            Enumeration e = items.elements();
            while (e.hasMoreElements())
            {
                ProductBean item = (ProductBean) e.nextElement();

                out.println(item.getCode()+","+
                    item.getQuantity());
            }
            out.close();

// Return a confirmation number (the order number as a string in this case).
            return ""+orderNumber;
        }
        catch (Exception exc)
        {
            throw new ShoppingCartException("Error saving order: "+exc.toString());
        }
    }
    
    public int totalQuantity()
    {
    	int totale=0;
    	for(int i=0;i<items.size();i++)
    	{
    		totale=totale+items.elementAt(i).getCart();
    	}
    	return totale;
    }
    public double totalPrice()
    {
    	double totale=0;
    	for(int i=0;i<items.size();i++) 
    	{
    		totale=totale+(items.elementAt(i).getPrice()*items.elementAt(i).getCart());
    	}
    	return totale;
    }
}