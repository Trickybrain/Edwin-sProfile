import java.util.ArrayList;
import java.util.Scanner;

public class app 
{
	public static Scanner input=new Scanner (System.in);
	public static void main(String[] args) 
	{
		//declare variables
		String another;
		
		//create parallel arrays 
		String [] product = {"common sword", "jumping potion", "chain shirt", "breastplate", "steel shield","wooden shield"};
		int [] price = {50,85,115,230,100,250};
		
		//create arraylist
		ArrayList<InvoiceItem> cart = new ArrayList<InvoiceItem> ();
		
		//loop it in case if the user want to place another order
		do 
		{
			//display the menu
			showProduct(product,price);
			//prompt the add items
			addItems(cart,product,price);
			//make changes to the order
			editCart(cart,product,price);
			//show the finalize invoice
			checkout(cart);
			//ask the user if they want to place another order
			System.out.print("Another order(y/n)?");
			another=input.nextLine();
			System.out.println();
		}while (another.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");
		System.out.println("Coded by Edwin");
	}//end main
	
	//add item to the cart
	public static void addItems (ArrayList<InvoiceItem> cart, String [] product, int [] price )
	{
		//declare variables
		int item;
		int quantity = 0;
		//Prompt user to add item
		System.out.print("Enter item to buy or 0 to quit: ");
		item=Integer.parseInt(input.nextLine());
		
		//loop it to add item
		do 
		{
			//validate item
			while(item>=7)
			{
				System.out.print("Invadlid, re-enter: ");
				item=Integer.parseInt(input.nextLine());
			}
			//display the item being add it
			System.out.println("Ordering " + product[item-1] + ", price is "+price[item-1]);
			//ask the user for how many item they want
			System.out.print("How many?");
			quantity=Integer.parseInt(input.nextLine());
			
			//validate quantity
			while(quantity<=0)
			{
				System.out.print("Invalid, re-enter: ");
				quantity=Integer.parseInt(input.nextLine());
			}
			
			//adding item to the cart
			cart.add(new InvoiceItem(product[item-1],price[item-1],quantity));
			//more item?
			System.out.println();
			System.out.print("Enter item to buy or 0 to quit: ");
			item=Integer.parseInt(input.nextLine());
		}while(item !=0);
		System.out.println();
	}//end addItems
	
	//show product before finalize
	public static void showProduct(String [] product, int[] price)
	{
		//declare variables for the item number
		int n=1;
		//title
		System.out.println("PRODUCT LIST");
		System.out.printf("%-5s %-19s %s%n","Item","Description","Price");
		//show the product list
		for (int index=0;index<product.length;index++)
		{
			System.out.printf("%-5d %-19s %d%n",n,product[index],price[index]);
			n++;
		}
		System.out.println();
	}//end show product
	
	//print cart, review what is in there
	public static void printCart(ArrayList<InvoiceItem> cart)
	{
		//declare variables
		int n=1;
		//titles
		System.out.println("Your cart");
		System.out.printf("%-5s %-14s %-9s %s%n","Item","Description","Quantity","Price");
		//print out all the items
		for(int index=0;index<cart.size();index++)
		{
			System.out.printf("%-5s %-14s %-9s %s%n" ,n, cart.get(index).getDesc(),cart.get(index).getQuantity(), cart.get(index).getPrice());
			n++;
		}//end loop
	}//print cart
	
	//print out the final invoice
	public static void checkout (ArrayList<InvoiceItem> cart)
	{
		//declare variables
		int total = 0;
		//display the titles
		System.out.println("INVOICE");
		System.out.printf("%-5s %-15s %-7s %s%n","Qty","Description","Each","Total");
		//print every item in the cart
		for(int index=0;index<cart.size();index++)
		{
			System.out.printf("%-5s %-15s %-7s %s%n",cart.get(index).getQuantity(),cart.get(index).getDesc(),cart.get(index).getPrice(),cart.get(index).getItemTotal());
			total=total+cart.get(index).getItemTotal();
		}//end loop
		
		//exiting display
		System.out.println();
		System.out.println("Total Due: "+total);
		System.out.println("Thank you for your order!");
		System.out.println();
	}//end checkout
	
	//Let the user to edit the cart
	public static void editCart(ArrayList<InvoiceItem> cart,String [] product, int [] price )
	{
		//declare variable
		int item,quantity = 0;
		
		//show the cart
		printCart(cart);
		System.out.println();
		//Prompt user to add item
		System.out.print("Select item to remove or change, or 0 if no change: ");
		item=Integer.parseInt(input.nextLine());
		
		//loop and let user to change items or remove items
		while(item!=0)
		{
			//validate the item on the list
			while(item>cart.size())
			{
				System.out.print("Invadlid, re-enter: ");
				item=Integer.parseInt(input.nextLine());
			}//end validate
			
			//ask the user for how many item they want
			System.out.print("Enter new quantity or 0 to remove: ");
			quantity=Integer.parseInt(input.nextLine());
			//validate it
			while(quantity<0)
			{
				System.out.print("Invalid, re-enter: ");
				quantity=Integer.parseInt(input.nextLine());
			}//end validate
			
			//remove item
			if (quantity==0)
			{
				cart.remove(item-1);
				System.out.println("Item removed");
			}//end remove item
			
			//change item
			if (quantity>0)
			{
				cart.get(item-1).setQuantity(quantity);
				System.out.println("Quantity changed");
			}//end change item
			//continue?
			System.out.println();
			printCart(cart);
			System.out.println();
			System.out.print("Select item to remove or change, or 0 if no change: ");
			item=Integer.parseInt(input.nextLine());
		}//end loop
		System.out.println("Order complete!");
		System.out.println();
	}//end edit cart
}//end class
/*
 * PRODUCT LIST
Item  Description         Price
1     common sword        50
2     jumping potion      85
3     chain shirt         115
4     breastplate         230
5     steel shield        100
6     wooden shield       250

Enter item to buy or 0 to quit: 7
Invadlid, re-enter: 6
Ordering wooden shield, price is 250
How many?-2
Invalid, re-enter: 2

Enter item to buy or 0 to quit: 4
Ordering breastplate, price is 230
How many?1

Enter item to buy or 0 to quit: 1
Ordering common sword, price is 50
How many?3

Enter item to buy or 0 to quit: 0

Your cart
Item  Description    Quantity  Price
1     wooden shield  2         250
2     breastplate    1         230
3     common sword   3         50

Select item to remove or change, or 0 if no change: 4
Invadlid, re-enter: 3
Enter new quantity or 0 to remove: 2
Quantity changed

Your cart
Item  Description    Quantity  Price
1     wooden shield  2         250
2     breastplate    1         230
3     common sword   2         50

Select item to remove or change, or 0 if no change: 2
Enter new quantity or 0 to remove: 0
Item removed

Your cart
Item  Description    Quantity  Price
1     wooden shield  2         250
2     common sword   2         50

Select item to remove or change, or 0 if no change: 0
Order complete!

INVOICE
Qty   Description     Each    Total
2     wooden shield   250     500
2     common sword    50      100

Total Due: 600
Thank you for your order!

Another order(y/n)?y

PRODUCT LIST
Item  Description         Price
1     common sword        50
2     jumping potion      85
3     chain shirt         115
4     breastplate         230
5     steel shield        100
6     wooden shield       250

Enter item to buy or 0 to quit: 1
Ordering common sword, price is 50
How many?1

Enter item to buy or 0 to quit: 2
Ordering jumping potion, price is 85
How many?2

Enter item to buy or 0 to quit: 3
Ordering chain shirt, price is 115
How many?3

Enter item to buy or 0 to quit: 4
Ordering breastplate, price is 230
How many?4

Enter item to buy or 0 to quit: 5
Ordering steel shield, price is 100
How many?5

Enter item to buy or 0 to quit: 6
Ordering wooden shield, price is 250
How many?6

Enter item to buy or 0 to quit: 7
Invadlid, re-enter: 6
Ordering wooden shield, price is 250
How many?0
Invalid, re-enter: 7

Enter item to buy or 0 to quit: 0

Your cart
Item  Description    Quantity  Price
1     wooden shield  2         250
2     common sword   2         50
3     common sword   1         50
4     jumping potion 2         85
5     chain shirt    3         115
6     breastplate    4         230
7     steel shield   5         100
8     wooden shield  6         250
9     wooden shield  7         250

Select item to remove or change, or 0 if no change: 1
Enter new quantity or 0 to remove: 10
Quantity changed

Your cart
Item  Description    Quantity  Price
1     wooden shield  10        250
2     common sword   2         50
3     common sword   1         50
4     jumping potion 2         85
5     chain shirt    3         115
6     breastplate    4         230
7     steel shield   5         100
8     wooden shield  6         250
9     wooden shield  7         250

Select item to remove or change, or 0 if no change: 0
Order complete!

INVOICE
Qty   Description     Each    Total
10    wooden shield   250     2500
2     common sword    50      100
1     common sword    50      50
2     jumping potion  85      170
3     chain shirt     115     345
4     breastplate     230     920
5     steel shield    100     500
6     wooden shield   250     1500
7     wooden shield   250     1750

Total Due: 7835
Thank you for your order!

Another order(y/n)? n

Goodbye!
Coded by Edwin
*/
