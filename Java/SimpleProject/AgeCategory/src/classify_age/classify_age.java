package classify_age;

import java.util.Scanner;

public class classify_age {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//variable
		double age;
		//ask
		System.out.println("What is the age of the user that you are trying to classify?");
		age=input.nextDouble();
		//display
		System.out.println("This person's age category: "+classify(age));
	}//end main
	
	public static String classify (double age)
	{	
		String person = null;
		if (age<1)
			person="infant";
		else if(age>1&&age<3)
			person="toddler";
		else if(age>3&&age<13)
			person="child";
		else if(age>13&&age<18)
			person="teenager";
		else if(age>18&&age<65)
			person="adult";
		else if (age>65)
			person="senior";
		return person;
	}

}//end class
