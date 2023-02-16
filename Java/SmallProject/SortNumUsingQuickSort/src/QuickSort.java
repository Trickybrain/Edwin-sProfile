import java.security.SecureRandom;

class QuickSort 
{
	SecureRandom rand = new SecureRandom();	

	void initArray (int[] number)
	{
		//assign array for value
		for (int index=0;index<number.length;index++)
		{
			number[index]=1+rand.nextInt(999);
		}
	}//end initArray
	
	void printArray (int [] number,int row)
	{
		for (int index=0; index<number.length;index++ )
		{
			System.out.printf("%6d",number[index]);
			if (index % row == row-1 )
			{
				System.out.println(); 
			}
		}//end number loop
	}//end print


	int partition(int number[], int low, int high) 
	{ 
		int pivot = number[high]; 
		int index = (low-1); //?
		
		for (int count=low; count<high; count++) 
		{ 
			// See if current element is smaller than or equal to pivot 
			if (number[count] <= pivot) 
			{ 
				index++;  
				int temp = number[index]; 
				number[index] = number[count]; 
				number[count] = temp; 
			} 
		} 
		// swap number[index+1] and pivot
		int temp = number[index+1]; 
		number[index+1] = number[high]; 
		number[high] = temp; 
		return index+1; 
	} 


	void sort(int number[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, number[pi] is 
			now at right place */
			int pi = partition(number, low, high); 
			//sorting the number before pivot point and after the pivot point
			sort(number, low, pi-1); 
			sort(number, pi+1, high); 
		} 
	} //end sort
}//end class
