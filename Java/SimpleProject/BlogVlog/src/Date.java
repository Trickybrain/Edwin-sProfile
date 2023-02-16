import java.util.Scanner;

class Date
{
	public static Scanner input=new Scanner (System.in);
	private int day, year;
	private String mon;

	public Date()
	{
		//ask the user about the date
		System.out.println("What is the month? ");
		mon=input.nextLine();
		System.out.println("What is the day?");
		day=Integer.parseInt(input.nextLine());
		System.out.println("What is the year?");
		year=Integer.parseInt(input.nextLine());
	}

	public String toString()
	{
		return (mon+"/"+day+"/"+year);
	}

	public void set_date(String m, int d, int y)
	{
		mon=m;
		day=d;
		year=y;
	}
}