
public class SortingApp {
	public static void main (String[] args)
	{
		QuickSort Sorting = new QuickSort();
		//declare a constant for size of array
		final int maxnums = 10; 
		
		//declare arrays the size of maxnums
		int[] number = new int [maxnums];

		//call initArray to store numbers in array
		Sorting.initArray(number);
		
		//call printArray to print unsorted number with 5 numbers per row
		System.out.println("The unsorted number is ");
		Sorting.printArray(number,5);
		
		//Set up the quicksort 
		int n = number.length;
		
		//sort the number
		Sorting.sort(number, 0, n-1);
		
		//Call printArray to print sorted number with 5 numbers per row
		System.out.println("The sorted number is ");
		Sorting.printArray (number,5);
		
	
	}//end main

}
