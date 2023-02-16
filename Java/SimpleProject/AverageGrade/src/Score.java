import java.util.Scanner;

public class Score 
{
	
	public static void main (String []args)
	{
		
		Scanner input = new Scanner(System.in);
		//declare variables
		double a,b,c,d,e,avgScore;
		//asking for the score
		System.out.println("What is the first test score?");
		a=Double.parseDouble(input.nextLine());
		System.out.println("What is the second test score?");
		b=Double.parseDouble(input.nextLine());
		System.out.println("What is the third test score?");
		c=Double.parseDouble(input.nextLine());
		System.out.println("What is the fourth test score?");
		d=Double.parseDouble(input.nextLine());
		System.out.println("What is the fivth test score?");
		e=Double.parseDouble(input.nextLine());
		//calculate the average score
		avgScore=(a+b+c+d+e)/5;
		//print
		System.out.printf("Your average letter grade will be %c",letterGrade(avgScore));
		
	}
	
	
	

	
	public static char letterGrade(double inputDouble)
	{
		//declare variables
		char letterGrade = 0;
		if(inputDouble>=90)
		{
			letterGrade = 'E';
		}
		else if(inputDouble<90&&inputDouble>=80)
			letterGrade = 'A';
		else if(inputDouble<80&&inputDouble>=70)
			letterGrade = 'B';
		else if(inputDouble<70&&inputDouble>=60)
			letterGrade = 'C';
		else if(inputDouble<60&&inputDouble>=50)
			letterGrade = 'D';
		else if(inputDouble<50)
			letterGrade = 'F';
		return letterGrade;
	
		}//end abcd validation

}


/*
 * What is the first test score?
100
What is the second test score?
20
What is the third test score?
30
What is the fourth test score?
40
What is the fivth test score?
50
Your average letter grade will be F
 */
