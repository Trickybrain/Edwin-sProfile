import java.util.Scanner;
public class e
{
   public static void main(String[] args) 
   {
	   Scanner input = new Scanner(System.in);
	   //variable
	   String another;
	   int n2=40,n3=10,x,n = 0;
	   double num=1.0,factorial=1.0,output=1.0;
	   //Title
	   System.out.println("This program will calculate e^x");
	   //ask for user input
	   System.out.print("Please enter a value for x: ");
	   double value = Double.parseDouble(input.nextLine());
	   //loop the calculation
	   do
	   {
		   //reset for 10,50,100
		   for(x=0;x<=2;x++)  
		   {
			   System.out.println("n"+n);
			     //loop for 10,50,100
				 for (n=1; n<=n3; ++n)
				 {
					 //reset the numbers
					 factorial=1.0;
					 num=1.0;
					 //power function
					 for (int i=1; i<=n; i++)
					 {
						 num*=value;
					 }
					 //factorial function
					 for (int i=1; i<=n; i++)
					 {
						 factorial*=i;
					 }
					 //calculation
					 output +=(num/factorial);
				 }//end for
				 //print the result
				 System.out.println();
				 System.out.printf("e^%s (n=%2s) %.10f", value,n-1,output);
				 System.out.println();
				 output=1;
				 n3+=n2;           
				 n2=n3;
		   }//end for
		 //ask if go again
		 System.out.print("Another one?(y/n)");     
		 another=input.nextLine();
	   }while (another.equalsIgnoreCase("y"));
   }//end main
}//end class
