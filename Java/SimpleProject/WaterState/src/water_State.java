import java.util.Scanner;

public class water_State 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//variable
		float temp, C;
		String water;
		//ask for input
		System.out.println("What is the water temperature in Fahrenheit: ");
		temp=input.nextFloat();
		//figure out what state the water is in
		if (temp<32)
			water="solid";
		else if (temp>32&&temp<212)
			water="liquid";
		else 
			water="gas";
		//change to C
		C=(temp-32)*5/9;
		//print
		System.out.printf("When the water is at %.2f Fahrenheit or %.2f Celsius. \nThe state of the water is a %s",temp,C,water);
		
	}//end main
}//end class
