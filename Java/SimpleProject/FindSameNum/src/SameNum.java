
public class SameNum {

	public static void main(String[] args) 
	{
		int [] arr1 = {2,10,13};
		int [] arr2 = {2,13};
		
		int i =0,j=0;
		

	    while(( i < arr1.length) && (j < arr2.length))
	    {
	      if(arr1[i] < arr2[j])
	          i++;
	      else if(arr1[i] == arr2[j])
	      {
	          System.out.println(arr1[i]);
	          
	          i++;
	          j++;
	      }
	      else
	          j++;
	     }
		

	}
	
	

}
