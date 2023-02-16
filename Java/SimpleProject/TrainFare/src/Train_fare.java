import java.util.Scanner;

public class Train_fare 
{
	public static void main (String []args)
	{
		Scanner input = new Scanner(System.in);
		//variable
		double miles,fare;
		int trainClass;
		//ask
		System.out.println("What is the number of miles in your journey?");
		miles=input.nextDouble();
		System.out.println("What is the class would you want to select?");
		trainClass=input.nextInt();
		fare=classify(miles,trainClass);
		//display
		System.out.println("The fare of your journey is "+fare);
	}//end main
	
	public static double classify (double miles,int trainClass)
	{	
		double fare =0;
		switch(trainClass)
		{
			//case 1
			case 1:
			if (miles<100)
				fare=3;
			else if(miles>100&&miles<350)
				fare=2.5;
			else if(miles>350)
				fare=2;
			break;
			
			//case 2
			case 2:
			{
				if (miles<100)
					fare=2;
				else if(miles>100&&miles<350)
					fare=1.5;
				else if(miles>350)
					fare=1;
			}break;
			//case 3
			case 3:
			{
				if (miles<100)
					fare=1.5;
				else if(miles>100&&miles<350)
					fare=1;
				else if(miles>350)
					fare=0.5;
			}break;
		}//end switch
		//calculate the fare
		fare*=miles;
		return fare;
	}//end classify

	
}//end class
