import java.util.Scanner;

public class employeeApp 
{
    //import scanner
    public static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
	    int numemps; 
	    //ask for how many workers
	    System.out.print("How many employees?");
	    numemps=Integer.parseInt(input.nextLine());
	    //validation for actually workers 
	    while(numemps<=0)
	    {
	    	System.out.print("Invalid, re-enter: ");
	    	numemps=Integer.parseInt(input.nextLine());
	    }//end validation
	    //will make it easy to modify System.out.print(“How many employees? ”); numemps = Integer.parseInt(input.nextLine()); //declare an array of structures
	    employee[] workers = new employee[numemps];
		getData(workers);
		printPayroll(workers);

		System.out.println("Coded by Edwin");
	}//end main
	
	public static void getData(employee[] workers)
	{

	    String tempname;
	    double temphours, temprate;
	    
	    //use a loop to process each element of an array
	    for (int index = 0; index < workers.length; index++)
	    {
	    	System.out.println();
	        //get the data from the user
	    	System.out.print("Enter employee's name:");
	        tempname = input.nextLine();
	        System.out.print("Enter hours worked: ");
	        temphours = Double.parseDouble(input.nextLine());
	        System.out.print("Enter hourly rate: ");
	        temprate = Double.parseDouble(input.nextLine());
	        //use PARAMETEREIZED CONSTRUCTOR to create an object
	        //with the data in it(“build an FURNISHED house on the land”)
	        workers[index] = new employee(tempname, temphours, temprate);
	    } //end for 
	}//end get data
	
	public static void printPayroll(employee[] workers)
	{
		
		//declare variables
		double total=0;
		//now print the report
	    System.out.println();
	    System.out.println("PAYROLL REPORT");
		System.out.println("Employee Name        Gross         Deductions       Net"); 
		for (employee e: workers)
		{
		    //display
			System.out.printf("%-18s $ %-11.2f $ %-14.2f $ %.2f%n",e.getname(),e.getGross(),e.getDeductions(),e.getNet());
			total=total+e.getGross();
		}//end for
		
		System.out.printf("Total gross pay $ %.2f%n",total);
	}
	
	
}//end class
