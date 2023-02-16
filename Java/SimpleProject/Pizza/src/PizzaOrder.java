import java.io.FileInputStream; 
import java.io.FileNotFoundException;
public class PizzaOrder 
{
	private int numPizza,PizzaOrder;
	Pizza pizza1,pizza2,pizza3;
	
	
	public PizzaOrder()
	{
		this.numPizza = 0;
		this.pizza1 = null;
		this.pizza2 = null;
		this.pizza3 = null;
	}
	
	public PizzaOrder(int numPizzas, Pizza pizza1, Pizza pizza2, Pizza pizza3)
	{
		setNumPizzas(numPizzas);
		setPizza1(pizza1);
		setPizza2(pizza2);
		setPizza3(pizza3);
	}
	public void setNumPizzas(int numPizzas)
	{
		if (numPizza<=3||numPizza>=1)
			this.numPizza=numPizzas;
		else
		{
			System.out.println("Sorry, we cannot fullfill it. We will try to order just one for you.");
			this.numPizza=1;
		}
	}
	
	public void setPizza1(Pizza pizza1)
	{
		this.pizza1=pizza1;
	}
	
	public void setPizza2(Pizza pizza2)
	{
		this.pizza2=pizza2;
	}

	public void setPizza3(Pizza pizza3)
	{
		this.pizza3=pizza3;
	}
	
	public double calcTotal()
	{
		double total = 0;
		if(pizza1 != null)
			total += pizza1.calcCost();
		
		if(pizza2 != null)
			total += pizza2.calcCost();
		
		if(pizza3 != null)
			total += pizza3.calcCost();
		return total;
	}
	
}//end class
