
class Date2
{
	private int day, year;
	private String mon;

	public Date2(String m, int d, int y)
	{
		mon=m;
		day=d;
		year=y;
	}

	public Date2(Date2 other)//copy constructor
	{
		mon=other.mon;
		year=other.year;
		day=other.day;
	}

	public boolean equals(Date2 other)
	{
		if ((mon.equals(other.mon)) && (year==other.year) &&  (day==other.day))
			return true;
		else
			return false;
	}
	public String toString()
	{
		return (mon+"/"+day+"/"+year);
	}

	public void set_date(String m, int d, int y)
	{
		mon=m;
		day=d;
		year=y;
	}
}