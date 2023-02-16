//Edwin Ye
//CIS 254 Problem 1
//This program is to withdraw, deposit, show balance on your bank account.
import java.util.Scanner;


public class newbankapp 
{
	public static Scanner input=new Scanner (System.in);
	public static account[] account = new account[5];
	public static void main(String[] args) 
	{
		//declare variables
		int accnum = 0,pin,index;
		
		account[0]=new account("Superman", 101,1001,50);
		account[1]=new account("Spiderman",102,1002,60);
		account[2]=new account("Batman",103,1003,70);
		account[3]=new account("Ironman",104,1004,80);
		account[4]=new account("Antman",105,1005,90);
		
		//ask for account
		System.out.print("Enter account number or 0 to quit: ");
		accnum=Integer.parseInt(input.nextLine());
		//while the user want to access the account
		while (accnum!=0)
		{
			//find the matching account
			index=findAccount(account,accnum);
			//if no account is found
			if (index!=-1)
			{
			//account has been found, enter pin to access
			System.out.print("Enter pin: ");
			pin=Integer.parseInt(input.nextLine());
			//wrong pin
			while(pin!=account[index].getpin())
			{
				System.out.print("Invalid PIN, re-enter: ");
				pin=Integer.parseInt(input.nextLine());
			}//correct pin
			System.out.println();
			//correct pin, what do you want to do?
			processAccount(account,index);
			}
			if(index==-1)
			{				
				System.out.println("Account not found");
			}
			//another account?
			System.out.println();
			System.out.print("Enter account number or 0 to quit: ");
			accnum=Integer.parseInt(input.nextLine());
		}//end account access
		
		System.out.println("Goodbye!");
		System.out.println("Coded by Edwin");
	}//end main
	
	//find the matching account
	public static int findAccount(account[] list, int accnum)
	{
		//finding a matching accnum
		for (int index=0; index<list.length;index++)
		{
			if (list[index].getnum()==accnum)
			{
				return index;
			}
		}
		//no account is found
		return -1;
	}//end find account
	
	public static void processAccount(account[] account, int position)
	{
		//declare variables
		int counter = 0;
		String type;
		double deposit,withdraw;
		
		System.out.println("Welcome "+account[position].getname());
		//get user input and then loop until the user wants to quit
		do
		{
			//ask for the service
			System.out.print("D(eposit) / W(ithdraw) / Q(uit): ");
			type=input.nextLine();
			//if the user want to deposit or withdraw
			if (type.equalsIgnoreCase("d"))
			{
				System.out.print("Enter deposit amount: ");
				deposit=Double.parseDouble(input.nextLine());
				account[position].deposit(deposit);
				System.out.printf("Your balance is $%.2f%n",account[position].getbalance());
			}
			else if (type.equalsIgnoreCase("w"))
			{
				System.out.print("Enter withdraw amount: ");
				withdraw=Double.parseDouble(input.nextLine());
				account[position].withdraw(withdraw);
				System.out.printf("Your balance is $%.2f%n",account[position].getbalance());
			}
			else
			{
				counter++;
			}
		}while(counter==0);
	}//end process account
}//end class
/*
 * Enter account number or 0 to quit: 101
Enter pin: 1234
Invalid PIN, re-enter: 1001

Welcome Superman
D(eposit) / W(ithdraw) / Q(uit): d
Enter deposit amount: 20
Your balance is $70.00
D(eposit) / W(ithdraw) / Q(uit): w
Enter withdraw amount: 100
Insufficent funds
Your balance is $70.00
D(eposit) / W(ithdraw) / Q(uit): q

Enter account number or 0 to quit: 105
Enter pin: 5555
Invalid PIN, re-enter: 1005

Welcome Antman
D(eposit) / W(ithdraw) / Q(uit): d
Enter deposit amount: 10
Your balance is $100.00
D(eposit) / W(ithdraw) / Q(uit): q

Enter account number or 0 to quit: 110
Account not found

Enter account number or 0 to quit: 0
Goodbye!
Coded by Edwin
*/
