import java.util.Scanner;

public class DemoPizza 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//variable
		String size;
		int cheeseTopping,peperoniTopping,hamTopping;
		//creating object
		Pizza order =new Pizza();
		
		System.out.println("What is the size do you want to order? ");
		size=input.nextLine();
		order.setSize(size);
		System.out.println("How many pepperoni topping do you want? ");
		peperoniTopping=Integer.parseInt(input.nextLine());
		order.setPeperoniTopping(peperoniTopping);
		System.out.println("How many cheese topping do you want? ");
		cheeseTopping=Integer.parseInt(input.nextLine());
		order.setCheeseTopping(cheeseTopping);
		System.out.println("How many ham topping do you want? ");
		hamTopping=Integer.parseInt(input.nextLine());
		order.setHamTopping(hamTopping);
		//display summary
		System.out.println(order.getDescription());
		
	}//end main

}//end class
