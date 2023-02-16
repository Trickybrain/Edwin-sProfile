
public class employee 
{
	private String name;
	private double hour;
	private double rate;
	
	//set up parameterized constructors
	public employee(String n, double temphours, double r)
	{
		name=n;
		hour=temphours;
		rate=r;
	}//end constructor
	
	//seter for name, hour, rate
	public void setname(String n) {name=n;}
	public void sethour(int h) {hour=h;}
	public void setrate(double r) {rate=r;}
	
	//getter for name, hour, rate
	public String getname() {return name;}
	public double gethour() {return hour;}
	public double getrate() {return rate;}
	
	//getGross, getDeductions, getNet
	
	public double getGross()
	{
		double pay;
		if(hour>40)
			pay=(40*rate)+(hour-40)*rate*1.5;
		else
			pay=rate*hour;
		return pay;
	}
	
	public double getDeductions()
	{
		double deduc;
		return deduc=getGross()*0.15;
	}
	
	public double getNet()
	{
		double net;
		return net=getGross()-getDeductions();
	}
}//end class
