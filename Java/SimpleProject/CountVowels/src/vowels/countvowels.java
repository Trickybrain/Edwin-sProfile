package vowels;

import java.util.Scanner;

public class countvowels 
{
	//scanner
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String another, y="y";
		do
		{
		//user input
		System.out.println("Enter a string and I will count the vowels:");
		String words = input.nextLine();
		System.out.println(countVowels(words));
		System.out.print("Another one?");
		 another =input.nextLine();
		 
		}while (another.equalsIgnoreCase(y));
		
	}//end main
	public static boolean isVowel(char letter)
	{
		letter=Character.toUpperCase(letter);
		
		switch (letter)
		{
		case 'A': 
		case 'E': 
		case 'I': 
		case 'O': 
		case 'U': return true;
		default: return false;
		}
	}//end isVowel
	
	public static int countVowels (String words)
	{
	
		
		//i need to count all the vowels in words
		int counter=0;
		char letter;
		//i need to check each letter of the string
		for (int index = 0; index < words.length(); index++)
		{
			//pick the next letter
		     letter = words.charAt(index);
		     //see if that letter is a vowel, if so count it
		      if(isVowel(letter))
		    	  counter ++;
		}
		
		return counter;
		
	}
}//end class

