
public class Action extends Movie 
{
	public Action()
	{
		super();
	}

	public Action(String r, int id, String t)
	{
		super(r, id, t);
	}
	
	public double lateFee(int days)
	{
		return 3.0 * days;
	}
}
