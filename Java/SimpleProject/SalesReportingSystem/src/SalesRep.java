
public class SalesRep 
{
	private String name;
	private double sales1, sales2;
	
	//constructor
	public SalesRep()
	{
		name=null;
		sales1=0;
		sales2=0;
	}//end constructor
	
	//parameterized constructor
	public SalesRep(String n, double s1, double s2)
	{
		name=n;
		sales1=s1;
		sales2=s2;
	}//end parameterized constructor
	
	//set and get for the attributes
	public void setname(String n) {name=n;}
	public void setsales1(double s1) {sales1=s1;}
	public void setsales2(double s2) {sales2=s2;}
	
	public String getname() {return name;}
	public double getsales1() {return sales1;}
	public double getsales2() {return sales2;}
	
	//Calculate and return total sales
	public double getTotalSales () 
	{
		return sales1+sales2;
	}//end total sales
	
	//calculate and return commission
	public double getCommission()
	{
		double total = sales1+sales2;
		if (total<4000)
			return total*0.05;
		else if (total<8000)
			return total*0.07;
		else
			return total*0.1;
	}//end commission
}//end class
