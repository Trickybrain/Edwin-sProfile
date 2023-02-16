/*Example3_9.java
  Author- Anita Rathi
  This program demonstrates  :
  - for loop
  

 */

import java.util.Scanner;

public class Example3_11
{
	public static void main(String [] args)
	{
		
		int i=1,j=5;
		for(;i<=10 && j<=40; )
		{
			i+=2;
			j+=7;
			System.out.print(i);
			System.out.print("\t"+j + "\n");
			
		}
		

		System.out.println("I am outside the loop");
		System.out.println(i);
		
	}
}
		
