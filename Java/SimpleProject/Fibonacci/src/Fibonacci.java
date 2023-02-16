import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//variable
		 int n1,n2,n3,i,size,day,x = 0; 
		 String another=null;
		 do
		 {
			 System.out.print("What is the initial size?");
			 size=Integer.parseInt(input.nextLine());
			 System.out.print("How many day is this going to go on?");
			 day=Integer.parseInt(input.nextLine());
			 n1=size;
			 n2=size;
			//loop starts
			 for(i=0;i<=day;++i)  
			 {    
				  n3=n1+n2;    
				  System.out.printf("%d day %d\n",i,n3);    
				  n1=n2;    
				  n2=n3;   
			 }//end for
			 System.out.print("Another one?(y/n)");
			 another=input.nextLine();
			 System.out.println();
		}while(another.equalsIgnoreCase("y"));
		 
	}//end main

}//end class