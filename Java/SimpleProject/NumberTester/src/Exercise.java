import java.util.Scanner;
// terms, armstrong, composite, ten multiple, sort out the even and odd number, palindrome, factorial, power function without using pow()
public class Exercise 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//variables
		int x,y;
		//sum of terms
		System.out.print("How many terms? ");
		x=input.nextInt();
		sumOfTerms(x);
		//armstrong
		System.out.print("What is the number you are trying to test for armstrong? ");
		x=input.nextInt();
		armstrong(x);
		//composite
		System.out.print("Enter a number to find out if it's a prime or composite. ");
		x=input.nextInt();
		composite(x);
		System.out.print("Enter another number to find out if it's a prime or composite. ");
		x=input.nextInt();
		composite(x);
		//tenMultiples
		System.out.print("Enter a number to find out the value after ten multiples ");
		x=input.nextInt();
		tenMultiples(x);
		//evenOrOdd
		System.out.print("Enter a number to find out the sum and how many even or odd numebrs are there ");
		x=input.nextInt();
		evenOrOdd(x);
		//palindrome
		System.out.print("Enter a number to find out if it's a palindrome or not ");
		x=input.nextInt();
		palindrome(x);
		//factorial
		System.out.print("Enter a number to display it’s factorial ");
		x=input.nextInt();
		factorial(x);
		//power
		System.out.print("Enter a base: ");
		x=input.nextInt();
		System.out.print("Enter a exponent: ");
		y=input.nextInt();
		Power(y,x);

	}//end main

	public static void sumOfTerms(int x)
	{
		int y=0,z = 0,sum = 0,w=0;
		//calculation
		for (z=x;y<z;y++ )
		{
			w+=2;
			sum+=(w)*(w);
		}
		//display the result
		System.out.println("The sum of the term is "+sum);
	}//end sumOfTerms
	
	public static void armstrong(int x)
	{
		int sum=0,y=x,z=0;
		//calculation
        while (y > 0) 
        {
            z = y % 10; 
            sum += z*z*z ;
            y = y/10;
        }//end while
        if (sum==x)
        	System.out.println("This number is an armstrong number ");
        else
        	System.out.println("This number is not an armstrong number ");
	}//end armstrong
	
	public static void composite(int x)
	{
		//display
		if (x%2==0&&x!=2||x%3==0&&x!=3||x%5==0&&x!=5||x%7==0&&x!=7||x%11==0&&x!=11)
		{
			System.out.println("It is a composite number.");
		}
		else
		{
			System.out.println("It is a prime number.");
		}
	}//end composite
	
	public static void tenMultiples(int x)
	{
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
			sum=x*i;
			System.out.println(""+x+" X "+i+" = "+sum);
		}
	}//end tenMultiples
	
	public static void evenOrOdd(int x)
	{
		int sum=0,oddSum=0, y=x,z=0,counter=0,oddCounter = 0;
		while(y>0)
		{
			z = y % 10;
			if (z%2==0)
			{
				counter++;
				sum+=z;
			}
			else
			{
				oddCounter++;
				oddSum+=z;
			}
	        y = y/10; 
		}
		System.out.println("Sum of even digits = "+sum);
		System.out.println("Sum of odd digits = "+oddSum);
		System.out.println("Number of even digits = "+counter);
		System.out.println("Number of odd digits = "+oddCounter);
		
	}//evenOrOdd
	
	public static void palindrome(int x)
	{
		int sum=0,y=x,z=0;
		while(y>0)
		{
			z = y % 10; 
			sum = (sum*10)+z; 
	        y = y/10; 
		}
		if(x==sum)    
          System.out.println("It is a Palindrome number.");    
        else    
          System.out.println("It is not a Palindrome Number."); 
	}//end palindrome
	
	public static void factorial(int x)
	{
		int y;
		String display = "1";
		for(y=2;y<=x;y++)
		{
			display+=" X "+y;
		}
		System.out.println(display);
	}
	
	public static void Power(int exponent,int base)
	{
		int i,sum = base;
		for(i=2;i<=exponent;i++)
		{
			sum*=base;
		}
		System.out.println(base+ " to the power "+exponent+" is "+sum);
	}//end power
	

	
}//end class
