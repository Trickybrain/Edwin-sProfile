
public class Diving 
{
	private double difficulty, score=0, finalscore;
	public Diving(double s)
	{
		score+=s;
	}
	
	public Diving() 
	{
		
	}

	public void setDiff(double d) {difficulty = d;}
	public void setScore(double s) {score+=s;}
	
	public double getDiff() {return difficulty;}
	public double getScore() {return score;}
	
	
}
