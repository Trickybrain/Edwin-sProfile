public class account 
{
	private String name;
	private double balance;
	private int accnum, pinnum;
	
	//default constructor
	public account(String n,int a,int p,double b)
	{
		name=n;
		balance=b;
		accnum=a;
		pinnum=p;
	}
	
	//setting accoutn number
	public void setnum(int acc) {accnum=acc;}
	
	//getting account number
	public int getnum() { return accnum;}
	
	//setting pin number
	public void setpin (int pin) {pinnum=pin;}
	
	//getting pin number
	public int getpin() {return pinnum;}
	
	//setting name
	public void setname(String names){name=names;}
	
	//getting name
	public String getname(){return name;}
	
	//Receives amount of money to deposit. validate 
	public void deposit(double newbalance)
	{
		//validate it, and then add to balance
		if (newbalance>0)
		{
			balance=balance+newbalance;
		}
	}//end deposit
	
	//withdraw the money
	public void withdraw(double withdraws)
	{
		//validate if withdraw a positive number
		if (withdraws>0)
		{
			//validate if withdraw smaller than the balance
			if (withdraws<=balance)
			{
				balance=balance-withdraws;
			}
			else
			{
				System.out.println("Insufficent funds");
			}
		}//end validate
		else {
			System.out.println("Need to draw greater than 0");
		}
	}//end withdraw
	
	//getting balance
	public double getbalance() {return balance;}
	
}//end class
