import java.util.Scanner;

public class CoffeeShop
{
	//variables
    final double COST_OF_CUP_OF_COFFEE = 2.35;
    final double CostOfLatte = 3.00;
    final double CostOfEspresso = 4.00;
    final static double TAX_RATE = 0.09;
    
    //scanner
    public static Scanner input=new Scanner (System.in);
    
    public static void main(String[] args) 
    {
    	String answer;
    	do
    	{
    	//ask what is the name of the customer
    	CustomerName();
    	//What kind of coffee would he like? return as the cost of that drink
    	double cost=CostOfCups();
    	//How many cups
    	int cups=Cups();
    	//Calculate the total
    	System.out.printf("Your total price is going to be $ %.2f%n",calcBill(cups,cost));
    	System.out.print("Next customer? ");
    	answer = input.nextLine();
    	System.out.println();
    	}while(answer.equalsIgnoreCase("yes"));
    	
    	System.out.println("Coded by Edwin");
    }//end main
    
    public static String CustomerName ()
    {
    	String name;
    	//ask the name of the customer
    	System.out.print("What is your name? ");
    	name = input.nextLine();
		return name;
    }//end name
    
    public static double CostOfCups() 
    {
    	String types;
    	double prices = 0;
    	//asking What kind of drink
    	System.out.print("What kind of drinks would you like? (Coffee, Latte, Espresso) ");
    	types = input.nextLine();
    	//Determined what is the price of the type of drink the customer wants
    	switch(types.toLowerCase())
    	{
    	case "coffee" : prices = 2.35;
    	break;
    	case "latte" : prices = 3.00;
    	break;
    	case "espresso" : prices = 4.00;
    	break;
    	}//end switch
    	return prices;
	}//end cost
    
    public static int Cups ()
    {
    	int cups;
    	//Determine number of cups
    	System.out.print("How many cups? ");
    	cups = Integer.parseInt(input.nextLine());
		return cups;
    }//end cups
    
    public static double calcBill (int Cups, double CostOfCups)
    {
    	//calculation
        double subtotal = CostOfCups * Cups;
        double salesTax = TAX_RATE*subtotal;
        double fullPrice = subtotal + salesTax;
        return fullPrice;
    }//end calculation
}//end class

/*
 * What is your name? j
What kind of drinks would you like? (Coffee, Latte, Espresso) coffee
How many cups? 2
Your total price is going to be $ 5.12
Next costomer?no
Coded by Edwin

What is your name? k
What kind of drinks would you like? (Coffee, Latte, Espresso) latte
How many cups? 3
Your total price is going to be $ 9.81
Next customer?yes
What is your name? j
What kind of drinks would you like? (Coffee, Latte, Espresso) espresso
How many cups? 4
Your total price is going to be $ 17.44
Next customer?no
Coded by Edwin
*/

