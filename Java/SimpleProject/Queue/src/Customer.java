import java.util.Scanner;
//Edwin Ye
//main function of customer.
public class Customer 
{
	public static Scanner input=new Scanner (System.in);
	public Customer(int clock, int transactionTime, int numberOfArrivals) 
	{
		
	}

	public static void main (String[] args)
	{


	        WaitLine customerLine = new WaitLine ();
	        //  Simulate a waiting line with 10 minutes, 50% arrival probability,
	        //  and 5 minute maximum transaction time
	        customerLine.simulate(10, 0.5, 5);
	        customerLine.displayResults();
	}

	public int getTransactionTime() 
	{
		return 0;
	}

	public int getArrivalTime() {
		
		return 0;
	}

	public String getCustomerNumber() {
		String name;
		System.out.print("What is your name? " );
		name = input.nextLine();
		return name;
	}
	

}