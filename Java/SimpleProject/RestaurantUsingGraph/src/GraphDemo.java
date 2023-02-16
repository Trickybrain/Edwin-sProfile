import java.util.Scanner;
public class GraphDemo
{
	public static Scanner input = new Scanner(System.in);
	public static void main (String [] args)
	{
      String tempVertex, tempEdge;
      String item;
      int num;
      String another;
      //  Create a graph
      UndirectedGraph<String> dTree = new UndirectedGraph<String>();
      String currentVertex;

      //  Add vertices to graph
      dTree.addVertex ("Burger");
      dTree.addVertex ("Ketchup");
      dTree.addVertex ("Muster");
      dTree.addVertex ("Strawberry");
      dTree.addVertex ("Banana");

      //  Add edges to graph
      dTree.addEdge ("Burger", "Ketchup");
      dTree.addEdge ("Ketchup", "Muster");
      dTree.addEdge ("Burger", "Muster");
      dTree.addEdge ("Burger", "Lettuce");
      dTree.addEdge ("Strawberry", "Banana");

      //get name 
      CustomerName();
   
      //get item and recommend item
      do {
          System.out.println ("The item menu:");
          while (dTree.hasVertex())
          System.out.println (dTree.nextVertex());
    	  dTree.listEdges();
    	  System.out.println();
    	  System.out.print("Trying again? Y or N ");
    	  another=input.nextLine();
		}while (another.equalsIgnoreCase("y"));//end do while

	}//end main
   
   public static String CustomerName ()
   {
   	String name;
   	//ask the name of the customer

   	System.out.print("What is your name? ");
   	name = input.nextLine();
		return name;
   }//end name
   
   public static int item() 
   {
   	String types;
   	int num = 0;
   	//asking What kind of drink
   	System.out.println();
   	System.out.print("What would you like? ");
   	types = input.nextLine();
   	//Determined what is the price of the type of drink the customer wants
   	switch(types.toLowerCase())
	   	{
	   	case "burger" : num = 0;
	   	break;
	   	case "ketchup" : num = 1;
	   	break;
	   	case "muster" : num = 2;
	   	break;
	   	case "strawberry" : num = 3;
	   	break;
	   	case "banana" : num = 4;
	   	break;
	   	default: num = 5;
	   	break;
	   	}//end switch
   	return num;
	}//end item
   
}//end class

