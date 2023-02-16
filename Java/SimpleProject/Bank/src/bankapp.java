//Edwin Ye
//CIS 254 Problem 2
//This program is to withdraw, deposit, show balance on your bank account.
import java.util.Scanner;


public class bankapp 
{
	public static Scanner input=new Scanner (System.in);
	public static account account = new account("a",0,0,0);
	public static void main(String[] args) 
	{
		//declare variables
		String name,type;
		double deposit,withdraw;
		int counter =0;
		
		//ask for name
		
		System.out.print("Enter name: ");
		name=input.nextLine();
		account.setname(name);
		//display welcome
		System.out.println("Welcome "+account.getname());
		
		System.out.println();
		//get user input and then loop until the user wants to quit
		
		do
		{
			//ask for the service
			System.out.print("D(eposit) / W(ithdraw) / Q(uit): ");
			type=input.nextLine();
			//if the user want to deposit
			if (type.equalsIgnoreCase("d"))
			{
				System.out.print("Enter deposit amount: ");
				deposit=Double.parseDouble(input.nextLine());
				account.deposit(deposit);
				System.out.printf("Your balance is $%.2f%n",account.getbalance());
				System.out.println();
			}
			else if (type.equalsIgnoreCase("w"))
			{
				System.out.print("Enter withdraw amount: ");
				withdraw=Double.parseDouble(input.nextLine());
				account.withdraw(withdraw);
				System.out.printf("Your balance is $%.2f%n",account.getbalance());
				System.out.println();
			}
			else
			{
				
				counter++;
			}
		}while(counter==0);
		System.out.println("Goodbye!");
		System.out.println("Coded by Edwin");
	}//end main
}//end class
/*
Enter name: Emma
Welcome Emma

D(eposit) / W(ithdraw) / Q(uit): d
Enter deposit amount: 20
Your balance is $20.00

D(eposit) / W(ithdraw) / Q(uit): d
Enter deposit amount: 20
Your balance is $40.00

D(eposit) / W(ithdraw) / Q(uit): w
Enter withdraw amount: 20
Your balance is $20.00

D(eposit) / W(ithdraw) / Q(uit): w
Enter withdraw amount: 10
Your balance is $10.00

D(eposit) / W(ithdraw) / Q(uit): W
Enter withdraw amount: 100
Insufficent funds
Your balance is $10.00

D(eposit) / W(ithdraw) / Q(uit): q

Goodbye!
Coded by Edwin

*/
