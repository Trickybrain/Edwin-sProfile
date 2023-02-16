package money;
//this program is to sort out the money
public class money 
{
	public static void main(String[] args) 
	{
		double n = 168.88,i;
		double  quarter, dime,penny,$10,$5,$1;
		i=n;
		$10=i/10-1;
		i%=10;
		$5=i/5-1;
		i%=5;
		$1=i/1-1;
		i%=1;
		quarter=i/0.25-1;
		i%=25;
		dime=i/0.10-1;
		i%=10;
		penny=i/0.1-1;
		i%=1;
		System.out.printf("Amount = $168.88 \n'%.0f' = $10s \n'%.0f' = $5s \n'%.0f' = $1s \n'%.0f' = quarters \n'%.0f' = dimes \n'%.0f' = pennies\n",$10,$5,$1,quarter , dime,penny);
		
		System.out.println("Coded by Edwin");
	}
}
