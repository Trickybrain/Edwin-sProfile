package convert_money_currency;

import java.util.Scanner;

public class convert_money_currency 
{

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		//declare variable
		String type = null;
		double rate = 0;
		double amount;
		//What currency 
		System.out.print("Currency to convert to U.S. dollars: e = Euros, c= Chinese Yuan, r = Indian Rupees, b = Bitcoin: ");
		String currency = input.nextLine();
		currency = currency.toUpperCase();
		//assign the currency rate
		for(int index=0;index<currency.length();index++)
		{
		
			switch (currency.charAt(index))
			{
			case 'E': rate = 1.16; type = "Euros";
			break;
			case 'C': rate = 0.15; type = "Chinese Yuan";
			break;
			case 'R': rate = 0.015; type = "Indian Rupees";
			break;
			case 'B': rate = 6923.8; type = "Bitcoin";
			break;
			default: System.out.println("Error");;
			}//end switch
		}//end for
		
		//ask the amount
		System.out.print("Amount of "+type+" to convert: ");
		amount = Double.parseDouble(input.nextLine());

		amount = amount*rate;

		//tell the user the amount
		System.out.printf("In U.S. dollars, that is %.2f",amount);

	}//end main
}//end class
