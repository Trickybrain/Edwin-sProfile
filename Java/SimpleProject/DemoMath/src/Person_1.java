/*Person.java
  Author- Anita Rathi
  This program demonstrates :
  - Copy Constructor
  
 */


public class Person_1
{

	String name;
	Date2 dob,dod;

	public Person_1()	
	{
		name="None";
		dob=null;
		dod=null;
	}

	public Person_1(String n, Date2 db, Date2 dd)	
	{
		name=n;
		dob=new Date2(db);
		//dob=db
		dod=new Date2(dd);
	}


	public Person_1(Person_1 other)//copy constructor
	{
		name=other.name;
		dob=new Date2(other.dob);
		dod=new Date2(other.dod);
	}

  public void setPerson(String n, Date2 db, Date2 dd)	
	{
		name=n;
		dob=new Date2(db);
		//dob=db
		dod=new Date2(dd);
	}


	public boolean equals(Person_1 other)
	{
		if ((name.equals(other.name)) && (dob.equals(other.dob)) && (dod.equals(other.dod)) )
			return true;
		else
			return false;
	}

	public String toString()
	{
		return("Name=" + name + " " + " Date of Birth= " 
			+ dob + " Date of Death= " + dod);
	}
}