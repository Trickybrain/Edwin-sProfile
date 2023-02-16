package assignment11;

public class clientInfo 
{
	//declare variables
	private String name; 
	private int age=20;
	private double weight, height;
	
	//setting name
	public void setName(String names)
	{
		//provide variable to name
		name=names;
	}//end setname
	
	//getting name
	public String getname()
	{
		return name;
	}
	
	//setting age
	public void setage (int ages)
	{
		age=ages;
	}
	
	//getting age
	public int getage ()
	{
		return age;
	}
	
	//setting weight
	public void setweight (double weights)
	{
		weight=weights;
	}
	
	//getting weight
	public double getweight ()
	{
		return weight;
	}
	
	//setting height
	public void setheight (double heights)
	{
		height =heights;
	}
	
	//getting height
	public double getheight()
	{
		return height;
	}
	
	//getting BMI
	public double getBMI()
	{
		double BMI;
		BMI=(weight*703)/(height*height);
		//calculate for BMI
		return BMI;
	}
	
	
	//find the categories
	public String getCategory()
	{
		String category = null;
		double bmi=getBMI();
		if (bmi<18.5)
			category = "Underweight";
		else if (bmi<25)
			category = "Normal";
		else if (bmi<30)
			category = "Overweight";
		else 
			category = "Obese";
		return category;
		
	}
	
	//find the max HR
	public int getmaxhr ()
	{
		int maxhr = 220;
		maxhr-=age;
		return maxhr;
		
	}
}//end class
