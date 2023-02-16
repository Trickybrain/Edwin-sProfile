//Edwin Ye
//CIS 254 Problem 1
//This program is to fitness/health information to their clients including BMI, BMI category and maximum heart rate.

package assignment11;

import java.util.Scanner;

public class HealthProfileApp  {

	public static void main(String[] args) 
	{
		// declare variables
		String username;
		double userheight_feet, userheight_inch, userheight, userweight;
		int userage;
		int counter=0;
		//scanner
		Scanner input=new Scanner (System.in);
		
		//create an object of the info class
		clientInfo box = new clientInfo();
		
		//let the user input info and loop it
		do 
		{
			//get user input for name
			System.out.print("Enter name or X to quit: ");
			username=input.nextLine();
			box.setName(username);
			if (username.equalsIgnoreCase("x"))
			{				
System.out.println("Goodbye!");
				counter++;
			}
			else
			{
				//getting user input for age
				System.out.print("Your age: ");
				userage=Integer.parseInt(input.nextLine());
				box.setage(userage);
				//getting user input for weight
				System.out.print("Your weight: ");
				userweight=Double.parseDouble(input.nextLine());
				box.setweight(userweight);
				//getting user input for height
				System.out.print("Your height - feet: ");
				userheight_feet=Double.parseDouble(input.nextLine());
				System.out.print("Your height - inches: ");
				userheight_inch=Double.parseDouble(input.nextLine());
				//convert it into inches
				userheight=userheight_feet*12+userheight_inch;
				box.setheight(userheight);
				System.out.println();
				
				//display
				System.out.println("Health Profile for "+username);
				System.out.printf("BMI: %.1f: %n",box.getBMI());
				System.out.println("BMI Category: "+box.getCategory());
				System.out.println("Max heart rate: "+box.getmaxhr());
				System.out.println();
			}
			
		}while(counter==0);
		System.out.println("Coded by Edwin");
		

	}//end main

}//end class
/*
 * Enter name or X to quit: Emma
Your age: 23
Your weight: 160
Your height - feet: 5
Your height - inches: 2

Health Profile for Emma
BMI: 29.3: 
BMI Category: Overweight
Max heart rate: 197

Enter name or X to quit: Tina
Your age: 22
Your weight: 100
Your height - feet: 5
Your height - inches: 0

Health Profile for Tina
BMI: 19.5: 
BMI Category: Normal
Max heart rate: 198

Enter name or X to quit: Jack
Your age: 23
Your weight: 155
Your height - feet: 5
Your height - inches: 7

Health Profile for Jack
BMI: 24.3: 
BMI Category: Normal
Max heart rate: 197

Enter name or X to quit: x
Your age: 21
Your weight: 222
Your height - feet: 9
Your height - inches: 0

Enter name or X to quit: X
Goodbye!
Coded by Edwin

*/
