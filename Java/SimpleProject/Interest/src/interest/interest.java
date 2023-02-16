package interest;
//this will show you how much you need to deposit to get 10k 10 years later
public class interest 
{
	public static void main(String[] args) 
	{
		double r=2.99,a;
		int f = 10000;
		int y=10;
		
		a=f/Math.pow(1+r*0.01, y);
		
		System.out.printf("You need to deposit %.2f in order to have $10,000 in the account 10 years later, at interest rate 2.99%%.\n",a);
		
		System.out.println("Coded by Edwin");
	}
			
}
