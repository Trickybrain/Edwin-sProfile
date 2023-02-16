/* 
	Person.java
	Author : Anita Rathi
	Base Class 
*/
	
import java.util.Scanner;

public class Person
{
	private String name;

	public Person()
	{
		this("No name");//invoking one argument constructor
	
	}

	public Person(Person other)
	{
		name=other.name;
	}

	public Person(String n)
	{
		name=n;
	}

	public void set(String n)
	{
		name=n;
	}

	public String get()
	{
		return name;
	}

	public String toString()
	{
		return("Name= " + name);
	}
	
	public static void display()
	{
		System.out.println("This is Person class");
	}

	public boolean equals(Person other)
	{
		return(name.equalsIgnoreCase(other.get()));
	}
}
			

	
