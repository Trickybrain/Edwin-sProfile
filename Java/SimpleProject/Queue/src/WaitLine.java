import java.util.Scanner;
//Edwin Ye
//The function of simulate the waitline

public class WaitLine
{
   private QueueInterface<Customer> line;
   private int numberOfArrivals;
   private int numberServed;
   private int totalTimeWaited;
   public Scanner input = new Scanner(System.in);
   public WaitLine()
   {
      line = new LinkedQueue<>();
      reset();
   } // end default constructor

   /** Simulates a waiting line with one serving agent.
       @param duration  The number of simulated minutes
       @param arrivalProbability  A real number between 0 and 1, and the
                                  probability that a customer arrives at
                                  a given time
       @param maxTransactionTime  the longest transaction time for a
                                  customer */ 
   public void simulate(int duration, double arrivalProbability, int maxTransactionTime)
   {
      int transactionTimeLeft = 0;
      int time = 0;
      String request;
      for (int clock = 0; clock < duration; clock++)
      {
         if (Math.random() < arrivalProbability)
         {
            numberOfArrivals++;
            System.out.print("What do you want? Book 1, Book 2, Book 3, Book 4: " );
            request = input.nextLine();
            time=isValid(request);
            while (time == 0)
            {
            	System.out.print("Invalid request. What do you want? Book 1, Book 2, Book 3, Book 4: " );
                request = input.nextLine();
                time=isValid(request);
            }
            int transactionTime = (int)(Math.random() * maxTransactionTime + time);
            Customer nextArrival = new Customer(clock, transactionTime, numberOfArrivals);
            line.enqueue(nextArrival);
            System.out.println("Customer " + numberOfArrivals +" enters line at time " + clock + ". Transaction time is " + transactionTime);
            
         } // end if

         if (transactionTimeLeft > 0)
            transactionTimeLeft--;
         else if (!line.isEmpty())
         {
            Customer nextCustomer = line.dequeue();
            transactionTimeLeft = nextCustomer.getTransactionTime() - 1;
            int timeWaited = clock - nextCustomer.getArrivalTime();
            totalTimeWaited = totalTimeWaited + timeWaited;
            numberServed++;
            System.out.println("Customer " + nextCustomer.getCustomerNumber() + " begins service at time " + clock + ". Time waited is " + timeWaited);
            System.out.println();
         } // end if
         
      } // end for
   } // end simulate


/** Displays summary results of the simulation. */ 
   public void displayResults()
   {
      System.out.println();
      System.out.println("Number served = " + numberServed);
      System.out.println("Total time waited = " + totalTimeWaited);
      double averageTimeWaited = ((double)totalTimeWaited) / numberServed;
      System.out.println("Average time waited = " + averageTimeWaited);
      int leftInLine = numberOfArrivals - numberServed;
      System.out.println("Number left in line = " + leftInLine);
   } // end displayResults

   /** Initializes the simulation. */ 
   public final void reset()
   {
      line.clear();
      numberOfArrivals = 0;
      numberServed = 0;
      totalTimeWaited = 0;
   } // end reset

   public static int isValid(String inputstr)
	{
		//declare variables
	   	boolean result = true;
		int time = 0 ;
		//loop to check if the they are abcd
		
		if (inputstr.equalsIgnoreCase("Book 1")  )
			time = 1;
		else if (inputstr.equalsIgnoreCase("Book 2")  )
			time =10;
		else if (inputstr.equalsIgnoreCase("Book 3") )
			time=20;
		else if (inputstr.equalsIgnoreCase("Book 4") )
			time = 30;
		else
		result = false;
		//if no match
		if (result = false)
		{
			return 0;
		}
		//if match
		else 
		return time;

	}//end isValid

} // end WaitLine
