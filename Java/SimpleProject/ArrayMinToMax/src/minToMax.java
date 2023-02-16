import java.util.Scanner;

public class minToMax 
{
	static Scanner input= new Scanner(System.in);

	public static void Input(int[] Arr, int n)
	{
		System.out.println("Enter " + n + " elements:");
		for(int i=0;i<n;i++)
			Arr[i]= input.nextInt();
	}

	public static void main(String[] args)
	{
		int [] A= new int[10];
		int userInput,userChange;
		int n=10;
		//asking for input
		Input(A,n);
		//print out all the elements in the array
		System.out.println("the elements in array are:\n");
		for(int i=0;i<n;i++)
			System.out.print(A[i]+ "  ");
		System.out.println();
		//finding the largest and smallest element
		System.out.println("\nThe largest element=" + Largest(A,n));
		System.out.println("\nThe smallest element=" + Smallest(A,n));
		//find the prime number
		for(int i=0;i<n;i++)
		{	
			if(Prime(A[i]))
				System.out.println("Prime numbers are "+A[i]+ "  ");
		}
		//asking what number to swap to 
		System.out.println("which number would you like to swap? ");
		userInput=input.nextInt();
		System.out.println("What number would you like to swap to? ");
		userChange=input.nextInt();
		//swapping number
		for (int i=0; i<A.length;i++)
		{
			if (A[i]==userInput)
				A[i]=userChange;
		}
		//printing out the result
		for(int i=0;i<n;i++)
			System.out.print(A[i]+ "  ");
	}//main

	public static int Largest(int []A, int n)
	{
		int max=A[0];
		for(int i=1;i<n;i++)
			if(A[i]>max)
				max=A[i];
		return max;
	}//largest
	
	public static int Smallest(int []A, int n)
	{
		int min = A[0];
		for (int i=1; i<n;i++)
		{
			if (A[i]<min)
				min=A[i];
		}
		return min;
	}//smallest
	
	public static Boolean Prime(int n)
	{
		for(int i=2;i <n/2;i++)
		{
			if (n%i==0)
			{
				return false;
			}	
		}
		return true;
	}//prime
	
	
}//class

