
public class Animal 
{
	private String name;
	private double population, grow_rate;
	
	public Animal()
	{
		System.out.println("Animals are awesome.");
	}
	
	public void set_name(String n) {name=n;}
	public void set_population(double p) {population=p;}
	public void set_grow_rate(double gr) {grow_rate=gr;}
	
	public String getName() {return name;}
	public double getPopulation() {return population;}
	public double getGrowRate() {return grow_rate;}
	
	boolean endangered()
	{
		if(grow_rate<0)
			return true;
		else
			return false;
	}//end endangered
	
	public String toString()
	{
		return ("This animal "+name +"'s population is "+population+" and the grow rate is "+grow_rate);
		
	}
	
	public boolean equals(Animal other)
	{
		if((this.population==other.population) && (this.grow_rate==other.grow_rate))
			return true;
		else
			return false;}
}//end class
