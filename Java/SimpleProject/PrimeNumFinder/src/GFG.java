// check if a number is prime 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
      
    //check for number prime or not 
    static boolean isPrime(int n) { 
     if(n==2) return true;
     //check if n is a multiple of 2 
     if (n%2==0) return false; 
     //if not, then just check the odds 
     for(int i=3;i<=Math.sqrt(n);i+=2) {
    	 System.out.println(n);
         System.out.println(i);
         if(n%i==0) 
        	
             return false; 
     } 
     return true; 
} 
      
    // Driver Program 
    public static void main(String[] args)  
    { 
     int num=0, count=1;
     Scanner input = new Scanner(System.in);
     System.out.println("How many prime would you like");
     
     num=Integer.parseInt(input.nextLine());
     for (int i=2;count<=num;i++)
     {
          if(isPrime(i))
          {
          System.out.println(i+ " is prime") ; 
          count ++;
          }
     }
    } 
}
