

import java.util.Scanner;

public class Doctor extends Person 
{
	private double fee;
	private String specialty,name;
	
	public Doctor(String name, String specialty,double fee)
	{	
		super(name);
		this.specialty = specialty;
		this.fee = fee;
	}

	public Doctor(String specialty) 
	{
		this.specialty = specialty;
	}
	
	public Doctor(double fee) 
	{
		this.fee = fee;
	}
	
	public void setSpecialty(String specialty)
	{
		this.specialty = specialty;
	}

	public String getSpecialty()
	{
		return specialty;
	}
	
	public void setFee(double fee)
	{
		this.fee = fee;
	}

	public double getFee()
	{
		return fee;
	}

	public String toString()
	{
		return("Name= " + super.get() + " Specialty = " + getSpecialty() + " Fee = "+getFee());
	}

}
			

	
