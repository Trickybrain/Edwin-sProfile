
public class Comedy extends Movie 
{
	public Comedy()
	{
		super();
	}

	public Comedy(String r, int id, String t)
	{
		super(r, id, t);
	}
	
	public double lateFee(int days)
	{
		return 2.5 * days;
	}
}
