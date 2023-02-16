import java.util.ArrayList;
import java.util.Scanner;

public class SalesRepApp
{
	public static Scanner input=new Scanner (System.in);
	public static void main(String[] args) 
	{
		//set up the array list
		ArrayList<SalesRep> report = new ArrayList<SalesRep> ();
		
		//calling to ask for info for report
		ask(report);
		
		//calling to print the report
		print(report);
		
		//calling to find out the diamond rep
		diamond(report);
		
		System.out.println("Cody by Edwin");
	}//end main
	
	//prompt the user to store data until no
	public static void ask(ArrayList<SalesRep> report)
	{
		//declare variables
		double sales1, sales2;
		String name,another=null;
		//title 
		System.out.println("Sales Rporting System");
		//loop until no
		//loop to ask for name and sales
		do
		{
			//ask for name
			System.out.print("Enter name: ");
			name=input.nextLine();
			
			//ask for sales
			System.out.print("Enter product 1 sales: ");
			sales1=Double.parseDouble(input.nextLine());
			System.out.print("Enter product 2 sales: ");
			sales2=Double.parseDouble(input.nextLine());
			
			//add it to the array list
			report.add(new SalesRep(name,sales1,sales2));
			
			//ask if want more rep?
			System.out.print("Another rep? (y/n)");
			another=input.nextLine();
			System.out.println();
		}while(another.equalsIgnoreCase("y"));
	}//end ask
	
	//print the report
	public static void print(ArrayList<SalesRep> report)
	{
		double total = 0,commission = 0;
		//Title
		System.out.println("Sales Report");
		System.out.printf("%-15s %-15s %s %n","Salesperson", "Total Sales", "Commision");
		//display
		for (int index=0;index<report.size();index++)
		{
			System.out.printf("%-14s  $ %-13.2f $ %.2f   %n",report.get(index).getname(),report.get(index).getTotalSales(),report.get(index).getCommission());
			total=total+report.get(index).getTotalSales();
			commission=commission+report.get(index).getCommission();
		}//end display sales report
		
		//print out the total and commission of everyone
		System.out.printf("%-14s  $ %-13.2f $ %.2f   %n","Total",total,commission);
		System.out.println();
	}//end print
	
	public static void diamond(ArrayList<SalesRep> report)
	{
		//declare variables
		double check;
		//title
		System.out.println("Diamond Club Qualified");
		System.out.printf("%-15s %s    %n","Name","Total Sales");
		//check for diamond rep
		for (int index=0;index<report.size();index++)
		{
			check=report.get(index).getTotalSales();
			if (check >=10000)
				System.out.printf("%-15s $ %.2f    %n",report.get(index).getname(),report.get(index).getTotalSales());
		}//end loop to check for diamond rep
		System.out.println();
	}//end diamond
	
}//end class

/*
 * Sales Rporting System
Enter name: James Kirk
Enter product 1 sales: 8500
Enter product 2 sales: 2650
Another rep? (y/n)y

Enter name: Bruce Wayne
Enter product 1 sales: 4880
Enter product 2 sales: 3120
Another rep? (y/n)y

Enter name: Harry Potter
Enter product 1 sales: 1500
Enter product 2 sales: 850
Another rep? (y/n)y

Enter name: Peter Parker
Enter product 1 sales: 9800
Enter product 2 sales: 5100
Another rep? (y/n)y

Enter name: Clark Kent
Enter product 1 sales: 2750
Enter product 2 sales: 1250
Another rep? (y/n)y

Enter name: Lois Lane
Enter product 1 sales: 8250
Enter product 2 sales: 5200
Another rep? (y/n)y

Enter name: Bob Blue
Enter product 1 sales: 5125
Enter product 2 sales: 7500
Another rep? (y/n)y

Enter name: Steven Green
Enter product 1 sales: 1200
Enter product 2 sales: 3000
Another rep? (y/n)y

Enter name: Jill White
Enter product 1 sales: 1500
Enter product 2 sales: 2500
Another rep? (y/n)y

Enter name: Same Black
Enter product 1 sales: 5200
Enter product 2 sales: 2800
Another rep? (y/n)n

Sales Report
Salesperson     Total Sales     Commision 
James Kirk      $ 11150.00      $ 1115.00   
Bruce Wayne     $ 8000.00       $ 800.00   
Harry Potter    $ 2350.00       $ 117.50   
Peter Parker    $ 14900.00      $ 1490.00   
Clark Kent      $ 4000.00       $ 280.00   
Lois Lane       $ 13450.00      $ 1345.00   
Bob Blue        $ 12625.00      $ 1262.50   
Steven Green    $ 4200.00       $ 294.00   
Jill White      $ 4000.00       $ 280.00   
Same Black      $ 8000.00       $ 800.00   
Total           $ 82675.00      $ 7784.00   

Diamond Club Qualified
Name            Total Sales    
James Kirk      $ 11150.00    
Peter Parker    $ 14900.00    
Lois Lane       $ 13450.00    
Bob Blue        $ 12625.00    

Cody by Edwin
*/
