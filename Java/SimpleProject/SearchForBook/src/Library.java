import java.util.Scanner;

public class Library
{
    public static <items> void main(String[] args) 
    {
    	String another, book;
    	int counter =0;
    	String [] items = {"Book 1", "book 2", "Book 3", "Book 4", "Book 5", "Book 6", "Book 7", "Book 8", "Book 9", "Book 10", "Book 11", "Book 12"};
    	
        BagInterface<items[]> Library = new LinkedBag<items[]>();
      
        // Statements that add selected items to the shopping cart:
        for (int index = 0; index < items.length; index++)
        {
            Library.add(items[index]);  
        } // end for

        Scanner input=new Scanner (System.in);
        
        do 
        {
        	System.out.printf("Book List: ");
        	for (int index = 0; index < items.length; index++)
    		{
        		System.out.print(items[index]+" ");
    		}
        	System.out.print("\nWhat book are you looking for? Example (Book #): ");
        	
        	book=input.nextLine();
        	
    		for (int index = 0; index < items.length; index++)
    		{
    			if (book.equalsIgnoreCase(items[index]) )
    			{
    				counter++;
    			}
    		}
    		if (counter == 1)
			{
			System.out.println("There is a book like this in the library");
			}
			else
			{
				System.out.println("There isn't a book like this in the library");
			}
    		
			System.out.print("Another order(y/n)? ");
			another=input.nextLine();
			System.out.println();
			counter=0 ;
		}while (another.equalsIgnoreCase("y"));
        
        // Simulate checkout
        while (!Library.isEmpty())
            System.out.println(Library.remove());
        

        
    } // end main
} //end library

