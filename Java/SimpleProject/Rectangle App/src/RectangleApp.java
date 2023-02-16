import java.util.Scanner;

public class RectangleApp {

	public static void main(String[] args) 
	{
		double userlength,userwidth,cost;
		String another;
		//scanner
		Scanner input=new Scanner (System.in);
		// This class will test my Rectangle class
		//create an object ("cookie") of the Rectangle class
		Rectangle box = new Rectangle();
		//loop for go for it again or not
		do 
		{
			//i Want to get user input for length and width
			System.out.print("Enter length: ");
			userlength= Double.parseDouble(input.nextLine());
			//assign this length to my object
			try
			{
				box.setLength(userlength);
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
			}
			//get user input for width
			System.out.print("Enter width: ");
			userwidth= Double.parseDouble(input.nextLine());
			//assign this width to my object
			box.setwidth(userwidth);
			//get cost/ft
			System.out.print("Enter cost of flooring per square foot: ");
			cost=Double.parseDouble(input.nextLine());
			//now print out all the outputs
			System.out.printf("Area to cover is %.2f square feet%n",box.getArea());
			System.out.printf("Total price is $%.2f%n",box.getArea()*cost);
			System.out.print("Another room to price? (y/n)");
			another=input.nextLine();
			another=another.toUpperCase();
			System.out.println();
		}while(another.equalsIgnoreCase("Y"));
		System.out.println("Goodbye!");
		System.out.println("Coded by Edwin");
	}
	
}
