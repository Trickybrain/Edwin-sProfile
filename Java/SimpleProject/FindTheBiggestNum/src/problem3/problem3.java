package problem3;

import java.security.SecureRandom;
import java.util.Scanner;

public class problem3 
{
	public static SecureRandom rand = new SecureRandom();	
	public static Scanner input = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		//declare a constant for size of array
		final int maxnums = 4; 
		
		//declare two one dimensional arrays the size of maxnums
		int[] number = new int [maxnums];

		//call initArray to store numbers in array
		initArray(number);
		
		//call printArray to print with 5 numbers per row
		printArray(number,5);
		
		//call findMax to determine max
		System.out.println("Largest: "+findmax(number));
		
		//call findMin to determine min
		//System.out.println("Smallest: "+findmini(number));  
		
		//call findAvg to determine average
		
		//print minimum, maximum, average
		//call reverseArray to store numbers in second array
		//in reverse order
		//call printArray to print the reversed array with 7 numbers per row
	}
	public static void initArray (int[] number)
	{
		//assign array for value
		for (int index=0;index<number.length;index++)
		{
			number[index]=1+rand.nextInt(998);
		}
	}//end initArray
	
	public static void printArray (int [] number,int row)
	{
		System.out.println("The numbers are: ");
		
		for (int index=0; index<number.length;index++ )
		{
			System.out.printf("%6d",number[index]);
			if (index % row == row-2 )
			{
				System.out.println();
			}
			
		}//end number loop
	}//end print
	
	public static int findmax (int[] number)
	{
		int temp;
		//find the max
		int index = 0;
			for (int count = index + 1; count < number.length; count++)  
			{
				 if (number[index] < number[count])   
	                {  
	                    temp = number[index];  
	                    number[index] = number[count];  
	                    number[count] = temp;  
	                }  
				 
			}
		
		return number[0];
	}//end findmax
	

	public static int findmini(int[] number)
	{  
		int temp;  
		int index= 0; 
		            for (int count = index + 1; count < number.length; count++)   
		            {  
		                if (number[index] > number[count])   
		                {  
		                    temp = number[index];  
		                    number[index] = number[count];  
		                    number[count] = temp;  
		                }  
		            }   
		       return number[0];  
		}  

}//end class
