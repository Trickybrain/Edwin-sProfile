import java.util.Scanner;

public class DemoAnimal {

	public static void main(String[] args) 
	{
		//variable
		String name;
		double population,grow_rate;
		//scanner
		Scanner input=new Scanner (System.in);
		Animal status=new Animal();
		Animal status2=new Animal();
		
		System.out.println("What is the name of the animal?");
		name=input.nextLine();
		
		status.set_name(name);
		
		System.out.println("What is the population of the animal?");
		population=Double.parseDouble(input.nextLine());
		status.set_population(population);
		
		System.out.println("What is the growth rate of the animal?");
		grow_rate=Double.parseDouble(input.nextLine());
		status.set_grow_rate(grow_rate);
		
		if (status.endangered())
		{
			System.out.println("This animal is endangerd.");
		}
		else
			System.out.println("This animal is not endangerd.");
		
		status.toString();
		
		System.out.println("What is the name of another animal?");
		name=input.nextLine();
		status2.set_name(name);
		
		System.out.println("What is the population of the animal?");
		population=Double.parseDouble(input.nextLine());
		status2.set_population(population);
		
		System.out.println("What is the growth rate of the animal?");
		grow_rate=Double.parseDouble(input.nextLine());
		status2.set_grow_rate(grow_rate);
		
		if(status.equals(status2))
			System.out.println("It's equal.");
		else
			System.out.println("It's not equal.");
		

	}

}
