public class Store 
{
	private String item;
	private double price;
	private int quantity;
	
	//constructor
	public Store()
	{
		item=null;
		quantity=0;
		price=0;
	}//end constructor
	
	//parameterized constructor
	public Store(String i, int q, double p)
	{
		item=i;
		quantity=q;
		price=p;
	}//end parameterized constructor
	
	//set and get for the attributes
	public void setname(String i) {item=i;}
	public void setsales1(double p) {price=p;}
	public void setsales2(int q) {quantity=q;}
	
	public String getItem() {return item;}
	public int getQuantity() {return quantity;}
	public double getPrice() {return price;}
}