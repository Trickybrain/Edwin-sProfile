public class Rectangle 
{
	//a class has attributes that are represented by instance variables
	//instance variables MUST BE PRIVATE for data hiding.
	private double length, width;
	
	//default constructor
	public Rectangle()
	{
		System.out.println("constructor called");
	}
	
	//need a "setter" for length
	//Mutator methods
	public void setLength(double len)
	{
		//first test and make sure that the data is acceptable
		if (len<=0)//bad
		{
			throw new IllegalArgumentException("Invalid value for length");
		}
		//if len is good
		//this methods job is to assign len to
		//the private variable length
		length=len;
	}//end setLength
	
	//need a "getter" for length
	//Accessor method
	public double getLength()
	{
		//this class will test my Rectangle class
		//create an object ("cookie") of the Rectangle class
		return length;
	}//end getLength
	
	//need a "setter" for width
	//Mutator methods
	public void setwidth(double wid) 
	{
		//this methods job is to assign wid to a private variable
		width=wid;
	}
	
	//need a "getter" for width
	//Accessor method
	public double getWidth()
	{
		return width;
	}
	
	//area can be calculated from length and width
	//so it only needs a GET method
	//no parameters needed because it has access to length and width directly
	public double getArea()
	{
		//calculate and return the area
		double area = length*width;
		return area;
		//or return length * width
	}
	
	public double getperimeter()
	{
		
		return 2*(length+width);
	}
	
}
