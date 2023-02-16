import java.util.Scanner;

public class BlogEntry 
{
	public static Scanner input=new Scanner (System.in);
	//variables
	private String name,text;
	
	//constructor
	public BlogEntry()
	{
		//ask user about the info
		System.out.println("What is the poster username?");
		name=input.nextLine();
		System.out.println("What is text of the entry?");
		text=input.nextLine();
	}
	
	public void set_name(String n) {name=n;}
	public void set_text(String t) {text=t;}
	
	public String getName() {return name;}
	public String getText() {return text;}

}


