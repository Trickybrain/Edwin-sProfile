import java.util.EmptyStackException;

public class LinkedStack<T>
{

   private Node topNode; // References the first node in the chain
  
   public LinkedStack()
   {
      topNode = null;
   } // end default constructor


   public void push(T newEntry)
   {
      Node newNode = new Node(newEntry);
      newNode.next = topNode;
      topNode = newNode;
   }


   public T pop()
   {
      T result = topNode.data;
      topNode = topNode.next;
      return result;
   }


   public T peek()
   {
      return topNode.data;
   }


   public boolean isEmpty()
   {
      return topNode == null;
   }


   public void clear()
   {
      T tempNode;
      while (!isEmpty())
         tempNode = pop ();
   }


   public void displayStack ()
   {
      Node tempNode = topNode;
      while (tempNode != null)
         {
         System.out.println (tempNode.data);
         tempNode = tempNode.next;
         }
   }


   private class Node
   {
      private T    data; // Entry in stack
      private Node next; // Link to next node
      
      private Node(T dataPortion)
      {
         this(dataPortion, null);
      } // end constructor
      
      private Node(T dataPortion, Node linkPortion)
      {
         data = dataPortion;
         next = linkPortion;
      } // end constructor
      
      private T getData()
      {
         return data;
      } // end getData
      
      private void setData(T newData)
      {
         data = newData;
      } // end setData
      
      private Node getNextNode()
      {
         return next;
      } // end getNextNode
      
      private void setNextNode(Node nextNode)
      {
         next = nextNode;
      } // end setNextNode
	} // end Node
   
	public static void main(String[] args)
	{
		int index=0;
		LinkedStack<String> stack = new LinkedStack<String>();
		String [] product = {"Common sword", "Jumping potion", "Chain shirt", "Breastplate", "Steel shield","Wooden shield","Shoes"};
		
		//put 3 items on shelf #1
		System.out.println("These items below will be put on shelf #1");
		for (;index<=2;index++)
		{
			stack.push(product[index]);
			System.out.println((product[index]));
		}
		System.out.println();
		
		//remove one to shelf #2
		System.out.println("These items below will be put on shelf #2");
		System.out.println(stack.pop());
		System.out.println();
		
		//put 2 more items to shelf #1
		System.out.println("These items below will be put on shelf #1");
		for (;index<=4;index++)
		{
			stack.push(product[index]);
			System.out.println((product[index]));
		}
		System.out.println();
		
		//remove 3 to shelf #2
		System.out.println("These items below will be put on shelf #2");
		for (int count=0;count<=2;count++)
		{
			System.out.println(stack.pop());
		}
		System.out.println();
		
		//put 2 more items to shelf #1
		System.out.println("These items below will be put on shelf #1");
		for ( ;index<=6;index++)
		{
			stack.push(product[index]);
			System.out.println((product[index]));
		}
		System.out.println();
			
		//put the remaining into shelf #2
		System.out.println("These remaining items below will be put on shelf #2");
		while (!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		
		
	}
} // end LinkedStack

