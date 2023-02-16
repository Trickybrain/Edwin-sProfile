
public class Drama extends Movie 
{
	public Drama()
	{
		super();
	}

	public Drama(String r, int id, String t)
	{
		super(r, id, t);
	}
	
	public double lateFee(int days)
	{
		return 2.0 * days;
	}
}
