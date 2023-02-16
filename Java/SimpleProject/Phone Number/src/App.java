import java.util.Scanner;

public class App 
{

	public static Scanner input=new Scanner (System.in);
	public static void main(String[] args) 
	{  
		//variables
		int i;
		//creating array object with size 3
	    Individual book[]=new Individual [3];  
	    //making new objects and initial the constructor to input info
	    book[0]=new Individual("a",1111111111L);
	    book[1]=new Individual("b",2222222222L);
	    book[2]=new Individual("c",3333333333L);
	    //print out one example of my object.
	    System.out.println(book[1].toString());
	    //searching for name c in the array object
	    i=Search(book,"c");
	    //if it's found then print found, if not then print not found.
	    if (i>0&&i<=2)
	    	System.out.println("The name "+book[i].getName()+" is found, and the phone number is "+book[i].getNumber());
	    else
	    {
	    	System.out.println("The person is not found.");
	    }
	    

	}//end main
	
	public static int Search(Individual [] A, String data)
	  {
	    int i=0;
	    boolean found=false;
	    //comparing the string
	    while((i<A.length)&&!(found))
	    {
	      if(A[i].getName().equals(data))
	        found=true;
	      else
	        i++;
	    }
	    //if found then pass the location back, if not then pass back -1
	    if(found)
	        return i;
	    else 
	        return -1;
	  }//end search

}//end class
