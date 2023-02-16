import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Variables
		String user;
		String secretWord = tenPhrases();
		StringBuilder replace;
		System.out.println(secretWord);
		int wrongCount = 8;
		boolean Star=false;
		StringBuilder newWord = null;
		
		int counter = 0;
		String[] userlist = new String[100];
//		System.out.println(secretWord);
		replace=replace(secretWord);

		do {
			System.out.print("Enter a letter to guess: ");
			user = input.nextLine();	
			userlist[counter]=user;
			
			while(!Character.isLetter(user.charAt(0))&&(!Character.isDigit(user.charAt(0)))){
				System.out.print("This is not a letter or digit, please try again: ");
				user = input.nextLine();
			}//end do
			
			if (counter>0) {
				for(int i=0;i<counter;i++)
				{
					while (user.equalsIgnoreCase(userlist[i]))
					{
						System.out.println();
						System.out.print("You enter this before, try something else: ");
						user = input.nextLine();
						while(!Character.isLetter(user.charAt(0))&&(!Character.isDigit(user.charAt(0)))){
							System.out.print("This is not a letter or digit, please try again: ");
							user = input.nextLine();
						}
						userlist[counter]=user;
					}
				}
			
			}//end if
			
			// guess
			if (guess(secretWord, user) == true) 
			{
			
				newWord =reveal(secretWord, user, replace);
				replace=newWord;
				notify(guess(secretWord, user));
				System.out.println();
				System.out.println("The remaining phrase is");
				System.out.println(newWord);
				Star=noStar(newWord);
				
			}
		 
			else
			{
			wrongCount--;
			notify(guess(secretWord, user));
			System.out.println();
			System.out.println("Only "+wrongCount+" guess remaining. Be careful!");
			
			}
			
			
			System.out.println();
			counter++;
		} while ((wrongCount != 0) && Star==false);
	
		if (wrongCount == 0) 
		{
		    gameover();
		}
		else 
		{
			winner();
		}

	}// end main
	
	static boolean noStar(StringBuilder word)
	{
		int counter = 0;
		for (int i = 0; i < word.length(); i++) 
		{
			//if the same then replace it
			if ((word.charAt(i)=='*'))
			{
				counter++;
			} // end if	
		} // end for
		if (counter==0)
			return true;
		else
			return false;
		
	}

	static StringBuilder reveal(String secretWord, String user,StringBuilder replace) 
	{
		StringBuilder word = new StringBuilder(replace);
		//change string to char
		char tempchar = user.charAt(0);
		// replace all the character with *
		for (int i = 0; i < secretWord.length(); i++) 
		{
			//if the same then replace it
			if (Character.toLowerCase(secretWord.charAt(i))==Character.toLowerCase(tempchar))
			{
				if (!(secretWord.charAt(i)==tempchar))
					word.setCharAt(i,Character.toUpperCase(tempchar));
				else
					word.setCharAt(i,tempchar);
			} // end if	
		} // end for
		return word;
	}// end reveal

	static StringBuilder replace(String secretWord) {
		String tempWord = secretWord;
		StringBuilder word = new StringBuilder(secretWord);
		// replace all the character with *
		for (int i = 0; i < secretWord.length(); i++) {
			// if it's not white space then replace it.
			if (!Character.isWhitespace(tempWord.charAt(i))) {
				word.setCharAt(i,'*');
			} // end if
		} // end for
		return word;
	}// end replace

	static boolean guess(String secretWord, String user) {
		int i, counter = 0;
		char tempchar = user.charAt(0);
		for (i = 0; i < secretWord.length(); i++) {
			if (Character.toLowerCase(secretWord.charAt(i))==Character.toLowerCase(tempchar))
			{
				counter++;
			}
		}
		if (counter >= 1)
			return true;
		else
			return false;
	}// end guess

	static String tenPhrases() {
		Random random = new Random();
		String[] tenPhrases = { "Cola and pizza", "Chicken Nugget", "I am Loving it", "I love Monday",
				"Easy come easy go", "Be your own man", "Bored to death", "Hamburger and fries", "Death Metal",
				"Iron man" };
		// Generate random integers in range 1 to 10
		int randomNum = random.nextInt(10);

		String phrases = tenPhrases[randomNum];

		return phrases;
	}// end tenPhrases

	 static void notify(boolean i) {
	 	// display result
	 	if (i == true)
	 		System.out.println("You got it right! ");
	 	else
	 		System.out.println("Wrong! Try again! ");
	 }// end notify
	 
	 static void gameover()
	 {
		 for(int m=1;m<=3;m++){
		        for(int c=1;c<=16;c++){
		        	if( (m==1) ||  //top
		        		(m==3) ||  //bottom
		        		(c==1) ||  //left
		        		(c==16)    //right
		        		) {
		        		        System.out.print("*");
		        		} 
		        	else 
		        	{
		        		//the middle
        				if (m==2&&c==4) {
    					System.out.print("Game over! ");
    					c=15;
    					}
        		        System.out.print(" ");
		        		}	  
		        }
		        //the end of the box
		        System.out.println();
		} //end for
	 }//end game over
	 
	 static void winner()
	 {
		 for(int m=1;m<=3;m++){
		        for(int c=1;c<=15;c++){
		        	if( (m==1) ||  //top
		        		(m==3) ||  //bottom
		        		(c==1) ||  //left
		        		(c==15)    //right
		        		) {
		        		        System.out.print("*");
		        		} 
		        	else 
		        	{
		        		//the middle
        				if (m==2&&c==5) {
    					System.out.print("Winner!");
    					c=12;
    					}
        		        System.out.print(" ");
		        		}	  
		        }
		        //the end of the box
		        System.out.println();
		} //end for
	 }//end winner

}// end class
