
public class Contact 
{
	private String fName,email,phoneNum,lName;
	//parameterized constructor
	public Contact(String fn, String ln,String e,String p )
	{
		fName=fn;
		lName=ln;
		email=e;
		phoneNum=p;
	}//end parameterized constructor
	
	//set and get for the attributes
	public void setFirstName(String fn) {fName=fn;}
	public void setLastName(String ln) {lName=ln;}
	public void setEmail(String e) {email=e;}
	public void setPhoneNum(String p) {phoneNum=p;}
	
	public String getFirstName() {return fName;}
	public String getLastName() {return lName;}
	public String getEmail() {return email;}
	public String getPhoneNum() {return phoneNum;}
	
	public String toString()
	{
		return "\nFirst Name: "+getFirstName()+" \nLast Name: "+getLastName()+" \nEmail: "+getEmail()+" \nPhone Number: "+ getPhoneNum()+"\n";
	}
	
}
