import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp
{
	public static Scanner input=new Scanner (System.in);
	public static void main(String[] args) 
	{
		//set up the array list
		ArrayList<Store> report = new ArrayList<Store> ();
		//calling ask
		ask(report);
		//calling print
		print(report);
		
	}//end main
	
	public static void ask(ArrayList<Store> report)
	{
		//declare variables
		String item;
		double price;
		int quantity;
		//loop to ask for info
		for(int i=1;i<4;i++)
		{	
			//ask for info
			System.out.print("Input name of item "+i+":  ");
			item=input.nextLine();
			System.out.print("Input quantity of item "+i+":  ");
			quantity=Integer.parseInt(input.nextLine());
			System.out.print("Input price of item "+i+":  ");
			price=Double.parseDouble(input.nextLine());
			//add it to the array list
			report.add(new Store(item,quantity,price));
		}//end for
		
	}//end ask
	
	public static void print(ArrayList<Store> report)
	{
		//variable
		double subtotal = 0, total, tax = 0;
		//Title
		System.out.println("Your bill: ");
		System.out.printf("%-30s %-10s %-10s %-10s %n","Item", "Quantity", "Price","Total");
		//display
		for (int index=0;index<report.size();index++)
		{
			total = report.get(index).getQuantity()*report.get(index).getPrice();
			System.out.printf("%-30s %-10d %-10.2f %-10.2f %n",report.get(index).getItem(),report.get(index).getQuantity(),report.get(index).getPrice(),total);
			//calculate for subtotal
			subtotal +=total;
		}//end for
		//calculate for tax
		tax= subtotal*0.0625;
		total = subtotal +tax;
		System.out.printf("%-53s%.2f\n", "Subtotal",subtotal);
		System.out.printf("%-53s%.2f%n", "6.25% sales tax ",tax);
		System.out.printf("%-53s%.2f\n", "Total",total);
	}//end print
}//end class



/*
Input name of item 1:  Bread
Input quantity of item 1:  10
Input price of item 1:  5
Input name of item 2:  beef
Input quantity of item 2:  2
Input price of item 2:  10
Input name of item 3:  pork
Input quantity of item 3:  3
Input price of item 3:  2
Your bill: 
Item                           Quantity   Price      Total      
Bread                          10         5.00       50.00      
beef                           2          10.00      20.00      
pork                           3          2.00       6.00       
Subtotal                                             76.00
6.25% sales tax                                      4.75
Total                                                80.75
 */
