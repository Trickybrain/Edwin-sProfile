
public class Individual 
{
	
	private String name;
	private long number;
	
	public Individual(long number)
	{
		
	}
	
	public Individual(String name)
	{
		this.name=name;
	}
	
	public Individual(String name, long number)
	{
		this.name=name;
		this.number=number;
	}
	
	public Individual()
	{
		
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setNumber(long number)
	{
		this.number=number;
	}
	
	public long getNumber()
	{
		return number;
	}
	
	public String toString()
	{
		String output ="Name: "+ name+" Number: " + number;
		return output;
	}
	
	public String getName()
	{
		return name;
	}
}
