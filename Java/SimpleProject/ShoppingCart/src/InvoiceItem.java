
public class InvoiceItem 
{
	//declare variables
	private String desc;
	private int price, quantity;
	
	//constructor
	public InvoiceItem()
	{
		desc = "none";
		price=0;
		quantity=0;
	}//end constructor
	
	public InvoiceItem(String d, int p, int q)
	{
		desc=d;
		price=p;
		quantity=q;
	}//end Parameterized constructor
	
	//set stuff
	public void setDesc(String d) {desc=d;}
	public void setQuantity(int q) {quantity =q;}
	public void setPrice (int p) {price =p;}
	
	//get stuff
	public String getDesc() {return desc;}
	public int getQuantity() {return quantity;}
	public int getPrice() {return price;}
	
	//getItemTotal
	public int getItemTotal()
	{
		return quantity*price;
	}//end getItemTotal

}//end class
