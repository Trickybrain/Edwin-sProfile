
public class BlogApp 
{

	public static void main(String[] args) 
	{
		//variable
		String name, text,date;
		//creating the blogentry object and asking user for info and getting the info
		BlogEntry entry=new BlogEntry();
		name=entry.getName();
		text=entry.getText();
		//creating the date object and asking user for info and getting the info
		Date d =new Date();
		date=d.toString();
		//displaying the entry info
		DisplayEntry(name, text,date);
		//printing out the first 10 character and word
		getSummary (text);
	}//end main

	 static void DisplayEntry(String n, String t,String d)
	 {
		 //displaying the info
		 System.out.println("The name is \""+n+"\"");
		 System.out.println("The text is \""+t+"\"");
		 System.out.println("The date is \""+d+"\"");
	 }//end display entry
	 
	 static void getSummary (String t)
	 {
		//variable
		int counter = 0,index=0;
		String text1 = "",text2="";
		//counting each character until it reaches 10
		for(int i=0;i<t.length();i++)
		{
			index++;
			//print each character
			text1+=t.charAt(i);
			//each time there is a whitespace, it will scan one more character
			if (Character.isWhitespace(t.charAt(i)))
			{
				index--;
			}//end if
			//when it reaches 10 then the loop stop
			if (index>9)
				i=t.length();
		}//end for
		//counting each space until it reaches 10
		for(int i=0;i<t.length();i++)
		{
			//print out the character
			text2+=t.charAt(i);
			//if it sees a space than that is one word
			if (Character.isWhitespace(t.charAt(i)))
			{
				counter++;
				//when it reaches 10 then the loop stop
				if (counter>9)
					i=t.length();
			}//end if
			
		}//end for
		
		//display the result
		System.out.println("The first 10 characters from the text are: \""+text1+"\"");
		System.out.println("The first 10 words from the text are: \"" +text2+"\"");
		System.out.println();
		System.out.print("Coded by Edwin");
	 }//end get summary
}//end class
