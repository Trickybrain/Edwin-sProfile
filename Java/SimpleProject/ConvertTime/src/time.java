//this will convert seconds to hours minutes
public class time 
{
	public static void main(String []args)
	{
		int n = 8000,i;
		int hours, minutes, seconds;
		i=n;
		i=i%(24*360);
		hours = i/3600;
		i%=3600;
		minutes=i/60;
		i%=60;
		seconds=i;
		
		System.out.println(n+ " seconds equals "+ hours+" hours "+minutes+" minutes "+seconds + " seconds");
		
		System.out.println("Coded by Edwin");
		
	}
}
