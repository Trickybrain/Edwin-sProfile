import java.util.Scanner;

public class demo
{
	public static void main(String [] args)
	{
		
		Scanner input=new Scanner(System.in);
		int x,y;
		Rectangle r=new Rectangle();//Default constructor invoked
		
		Rectangle r1=new Rectangle(10);//1 argument constructor invoked

		System.out.println("Enter length and breadth:");
		x=input.nextInt();
		y=input.nextInt();

		Rectangle r2=new Rectangle(x,y);//2 argument constructor invoked
		
		System.out.println("Object 1");
		System.out.println(r);
		System.out.println("Area= "+ r.area() + " Perimeter=" +
					 		r.perimeter());
		r.set_length(x);// Invoking method of Rectangle1 class
		r.set_breadth(y);
		System.out.println(r.toString());
		System.out.println("Area= "+ r.area() + " Perimeter=" + 
											r.perimeter());

		System.out.println("Object 2");
		System.out.println(r1);
		System.out.println("Area= "+ r1.area() + " Perimeter=" + 
											r1.perimeter());

		System.out.println("Object 3");
		System.out.println(r2);
		System.out.println("Area= "+ r2.area() + " Perimeter=" + 
											r2.perimeter());
		
	}

}