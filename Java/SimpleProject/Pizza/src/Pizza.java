
public class Pizza 
{
	private int sizePrice,cheeseTopping,peperoniTopping,hamTopping;
	private String size;
	
	public Pizza ()
	{
		this.size = "";
		this.cheeseTopping = 0;
		this.peperoniTopping = 0;
		this.hamTopping = 0;
	}
	
	public Pizza(String pizzaSize, int cheeseTopping, int peperoniTopping, int hamTopping)
	{
		this.size = pizzaSize;
		this.cheeseTopping = cheeseTopping;
		this.peperoniTopping = peperoniTopping;
		this.hamTopping = hamTopping;
	}
	
	void setSize(String s)
	{

		
		size=s;
		
	}
	
	void setCheeseTopping(int CT)
	{
		cheeseTopping=CT;
	}
	
	void setPeperoniTopping(int PT)
	{
		peperoniTopping=PT;
	}
	
	void setHamTopping(int HP)
	{
		hamTopping=HP;
	}
	
	String getSize ()
	{
		return size;
	}
	
	public int getCheeseTopping()
	{
		return cheeseTopping;
	}
	
	int getPeperoniTopping()
	{
		return peperoniTopping;
	}
	
	int getHamTopping()
	{
		return hamTopping;
	}
	
	double calcCost( )
	{
		double total;
		switch (size)
		{
		case "small": sizePrice=10;
		break;
		case "medium": sizePrice=12;
		break;
		case "large": sizePrice=14;
		break;
		}
		total=sizePrice + 2*(cheeseTopping+peperoniTopping+hamTopping);
		return total;
	}
	
	String getDescription()
	{
		
		
		return "The size of the pizza is "+getSize()+ " and you have "+ getCheeseTopping()+ " CheeseToping "
				+ " and " +peperoniTopping +" Peperoni Topping "+hamTopping+" Ham Topping and your total would be "
				+ calcCost();
		
		
	}
}//end class
