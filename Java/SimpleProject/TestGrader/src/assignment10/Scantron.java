package assignment10;
import java.util.Scanner;

public class Scantron 
{
	public static Scanner input = new Scanner(System.in);
	
	public static void main (String []args)
	{
		//declare variables
		int question, tests,counter;
		String answer,key;
		double score;
		
		//get the amount of question
		System.out.print("How many questions? ");
		question=Integer.parseInt(input.nextLine());
		//validate it, must be more than 3
		while (question<3)
		{
			System.out.print("Must have at least 3 questions on the test. Re-enter please.");
			question=Integer.parseInt(input.nextLine());
		}//end question validation
		
		//getting the answer key
		System.out.println("Enter answer key: ");
		key=getInput(question);
		//display the test key
		System.out.println("Test key: "+key);
		
		System.out.println();
		
		//enter number of test
		System.out.print("How many tests to grade? ");
		tests=Integer.parseInt(input.nextLine());
		//validate it, must more than 2 
		while (tests<2)
		{
			System.out.print("Must have at least 2 tests. Re-enter please.");
			tests=Integer.parseInt(input.nextLine());
		}//end validate test
		
		System.out.println();
		
		//loop for the number of the test we are trying to grade
		for(int index=1;index<=tests;index++)
		{
			//get student answer
			System.out.print("Enter student " +index+" answers: ");
			answer=getInput(question);
			//call to grade the test
			counter=gradeTest(key,answer);
			
			System.out.println();
			
			//calculation for the score
			score=(counter*1.0/key.length())*100;
			System.out.println("Number correct: "+counter);
			System.out.printf("Score is %.1f %%%n",score);
			
			System.out.println();
		}//end loop for tests
	}//end main
	
	public static String getInput(int question)
	{
		//declare variable
		String answer;
		//getting answer input
		answer=input.nextLine();
		//validate the length
		while (question!=answer.length())
		{
			System.out.print("Must be exactly " + question+" answers, re-enter: ");
			answer=input.nextLine();
		}//end validate length
		
		//validate if it's abcd
		while (!isValid(answer))
		{
			System.out.println("Answer must only be A, B, C, or D, re-enter");
			answer=input.nextLine();
		}//end validation for abcd
		
		//change to upper case
		answer=answer.toUpperCase();
		return answer;
	}//end getInput
	
	public static boolean isValid(String inputstr)
	{
		//declare variables
		boolean result=true;
		//change it to uppercase
		inputstr=inputstr.toUpperCase();
		//loop to check if the they are abcd
		for(int index=0;index<inputstr.length();index++)
		{
			switch (inputstr.charAt(index))
			{
			case 'A': 
			case 'B': 
			case 'C': 
			case 'D': break;
			default: result=false;
			}
		}//end abcd validation
		return result;
	}//end isValid
	
	public static int gradeTest (String key, String stuanswers)
	{
		//declare variables
		int counter =0,student=1;
		//display
		System.out.printf("%s %5s %10s%n","Question" ,"Key" ,"Student");
		//format the display
		for(int index=0;index<key.length();index++)
		{
			System.out.printf("%5d %7c %7c",student, key.charAt(index), stuanswers.charAt(index));
			//if the student get the answer correct, will show "Correct!" and count it
			if (key.charAt(index)==stuanswers.charAt(index))
			{
				System.out.println(" Correct!");
				counter++;
			}
			else
			{
				System.out.println();
			}
			//part of the display for the number of student
			student ++;
		}//end loop for display
		return counter;	
	}//end gradeTest
}//end class
/**
How many questions? 5
Enter answer key: 
aba
Must be exactly 5 answers, re-enter: aBcbD
Test key: ABCBD

How many tests to grade? 1
Must have at least 2 tests. Re-enter please.3

Enter student 1 answers: bbccd
Question   Key    Student
    1       A       B
    2       B       B Correct!
    3       C       C Correct!
    4       B       C
    5       D       D Correct!

Number correct: 3
Score is 60.0 %

Enter student 2 answers: cbcbd
Question   Key    Student
    1       A       C
    2       B       B Correct!
    3       C       C Correct!
    4       B       B Correct!
    5       D       D Correct!

Number correct: 4
Score is 80.0 %

Enter student 3 answers: daddc
Question   Key    Student
    1       A       D
    2       B       A
    3       C       D
    4       B       D
    5       D       C

Number correct: 0
Score is 0.0 %

*/