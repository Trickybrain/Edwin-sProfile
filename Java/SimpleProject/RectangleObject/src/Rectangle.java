import java.util.Scanner;

public class Rectangle
{
	private int length,breadth; //private Instance variables

	//Constructors
	public Rectangle()//No argument/ default constructor
	{
		length=breadth=5;
	}

	public Rectangle(int l) //Constructor overloading
	{
		length=breadth=l;
	}

	public Rectangle(int l, int b)//Constructor overloading
	{
		length=l;
		breadth=b;
	}

	//Public methods
	public void set_length(int l)
	{
		length=l;
	}

	public void set_breadth(int b)
	{
		this.breadth=b;
	}

	public int get_breadth()
	{
		return this.breadth;
	}

	public int get_length()
	{
		return this.length;
	}

	public int area()
	{ 
		return length*breadth;
	}

	public int perimeter()
	{ 
		return (2*(length+breadth));
	}

	public String toString()
	{
		return("Length=" + length + " Breadth= " + breadth);
	}
}
