import java.util.Scanner;

public class Demo 
{

	public static void main(String[] args) 
	{
		//variable
		double fuelEfficiency,miles;
		int trips;
		Scanner input=new Scanner(System.in);
		
		//creating object
		Odometer gas=new Odometer();
		//do it for 4 times
		for (int i=0;i<=3;i++)
		{
			System.out.print("What is the Fuel Efficiency of your vehicle? ");
			fuelEfficiency=input.nextDouble();
			gas.setFuelEfficiency(fuelEfficiency);
			System.out.print("How many miles are you driving? ");
			miles=input.nextDouble();
			gas.setMiles(miles);
			System.out.print("How many trips are you driving? ");
			trips=input.nextInt();
			gas.setTotalOdometer(trips);
			//display the gas consumed
			System.out.printf("Total amount of gas consumed: %.2f Gallon\n",gas.getConsumedGas());
			gas.setZeroMile();
			System.out.println("");
		}//end for
		
	}//end main

}//end class
