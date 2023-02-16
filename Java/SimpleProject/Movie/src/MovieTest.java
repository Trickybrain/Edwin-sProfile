
public class MovieTest 
{
	public static void main(String[] args)
	{
		Movie m1 =new Movie("Rated R",001,"Number 1");
		
		Movie m2 = new Drama("PG-13",002,"Number 2"); 
		
		Movie m3=new Action("Rated G",003,"Number 3");
		
		Movie m4=new Comedy("PG-13",004,"Number 4");
		
		Movie m5=new Comedy("Rated R",001,"Number 1");
		
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);

		System.out.println(m1.calcLateFees(10));
		System.out.println(m2.calcLateFees(10));
		System.out.println(m3.calcLateFees(10));
		System.out.println(m4.calcLateFees(10));
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m5));
	}
}
