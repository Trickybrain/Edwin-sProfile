import java.util.ArrayList;
import java.util.Scanner;

public class Demo_diving 
{
	public static Scanner input=new Scanner (System.in);
	public static void main(String[] args) 
	{
		//variables
		double difficulty,finalScore = 0;
		double point;
		//objects
		ArrayList<Diving> scoreBoard = new ArrayList<Diving> ();
		Diving judge=new Diving();
		//ask for difficulty
		System.out.println("What is the difficuty?");
		difficulty=Double.parseDouble(input.next());
		judge.setDiff(difficulty);
		//ask for score
		for (int i=1;i<=7;i++)
		{
			System.out.println("What is the score from Judge#"+i);
			point=Double.parseDouble(input.next());
			scoreBoard.add(new Diving(point));
		}
		//find max and total score
		double max=scoreBoard.get(0).getScore();
		double min=scoreBoard.get(0).getScore();
		for (int i=0;i<=6;i++)
		{
			if(max<scoreBoard.get(i).getScore())
				max=scoreBoard.get(i).getScore();
			if(min>scoreBoard.get(i).getScore())
				min=scoreBoard.get(i).getScore();
			finalScore+=scoreBoard.get(i).getScore();
		}
		//final score
		finalScore=(finalScore-max-min)*0.6*judge.getDiff();
		
		System.out.println("Final score: "+finalScore);

	}

}
