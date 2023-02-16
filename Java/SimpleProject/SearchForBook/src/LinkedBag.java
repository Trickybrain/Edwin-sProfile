
public final  class LinkedBag<T> implements BagInterface<T>
{
    Node firstNode;
    int numberOfEntries;


  // Simple constructor
    public LinkedBag()
    {
        firstNode = null;
        numberOfEntries = 0;
    } // end default constructor


    /** Gets the number of entries currently in this bag.
    @return  The integer number of entries currently in the bag. */
    public int getCurrentSize()
    {
        return numberOfEntries;
    }  // end
    

    /** Sees whether this bag is empty.
    @return True if the bag is empty, false otherwise.
    */
    public boolean isEmpty()
    {
        return firstNode == null;
    }  // end


    /** Adds a new entry to this bag.
        @param newEntry  The object to be added as a new entry.
        @return  true. */
    public boolean add(T newEntry)
    {
        Node newNode = new Node (newEntry);
        newNode.next = firstNode;
        firstNode = newNode;
        ++numberOfEntries;
        return true;
    }  // end


    /** Removes one unspecified entry from this bag, if possible.
    @return  Either the removed entry, if the removal
    was successful, or null. */
    public T remove()
    {
        T result = null;
        if (firstNode != null)
        {
            result = firstNode.data;
            firstNode = firstNode.next;
            --numberOfEntries;    
        }
        return result;
    }  // end


    /**adsj;ajdf;l
    */
    private Node getReferenceTo (String anEntry)
    {
        Node currentNode = firstNode;
        boolean found = false;
        while (!found && currentNode != null)
        {
            if (anEntry.equals (currentNode.data))
               found = true;
            else
               currentNode = currentNode.next;
        }
        return currentNode;
    }
    
    
    
   
    /** Removes one occurrence of a given entry from this bag.
    @param anEntry  The entry to be removed.
    @return  True if the removal was successful, or false otherwise. */
    public boolean remove(String anEntry)
    {
        boolean result = false;
        Node currentNode = getReferenceTo (anEntry);
        if (currentNode != null)
        {
            currentNode.data = firstNode.data;
            firstNode = firstNode.next;
            --numberOfEntries;
            result = true;
        }
        return result;
        
    }  // end



    /** Removes all entries from this bag. */
    public void clear()
    {
        while (!isEmpty())
          {
              remove ();
          }
      numberOfEntries = 0;
    }  // end


    /** Counts the number of times a given entry appears in this bag.
    @param anEntry  The entry to be counted.
    @return  The number of times anEntry appears in the bag. */
    public int getFrequencyOf(T anEntry)
    {
        Node currentNode = firstNode;
        int frequency = 0;
        while (currentNode != null)
        {
            if (anEntry.equals (currentNode.data))
               ++frequency;
            currentNode = currentNode.next;
        }
        return frequency;
    }  // end


    /** Tests whether this bag contains a given entry.
    @param anEntry  The entry to locate.
    @return  True if the bag contains anEntry, or false otherwise. */
    public boolean contains(String anEntry)
    {
        Node currentNode = getReferenceTo (anEntry);
        return !(currentNode == null);
    }  // end


    /** Retrieves all entries that are in this bag.
    @return  A newly allocated array of all the entries in this bag. */
    public T[] toArray()
    {
        @SuppressWarnings ("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        int index = 0;
        Node currentNode = firstNode;
        while (currentNode != null)
        {
            result [index] = currentNode.data;
            ++index;
            currentNode = currentNode.next;
        }
        return result;
    }


private class Node
{
    private T data;
    private Node next;

//  Two contructors.
    private Node (T dataPortion)
    {
        this (dataPortion, null);
    }

    private Node (T dataPortion, Node nextNode)
    {
    data = dataPortion;
    next = nextNode;   
    }
}


@Override
public <items> boolean add(String items) {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean remove(T anEntry) {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean contains(T anEntry) {
	// TODO Auto-generated method stub
	return false;
}
} // end LinkedBag
