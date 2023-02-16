
public class Odometer 
{
	private double fuelEfficiency,miles,totalOdometer;
	public void setZeroMile()
	{
		totalOdometer=0;
	}

	public void setFuelEfficiency(double ff)
	{
		fuelEfficiency=ff;
	}
	
	public void setMiles(double m)
	{
		miles=m;
	}
	
	public void setTotalOdometer(int t)
	{
		totalOdometer+=miles*t;
	}
	
	public double getConsumedGas()
	{
		double consumedGas=0;
		
		consumedGas=totalOdometer/fuelEfficiency;
		
		return consumedGas;
	}
}
