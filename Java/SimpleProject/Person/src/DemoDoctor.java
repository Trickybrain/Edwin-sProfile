
/*DemoStudent.java
	Author : Anita Rathi
	Driver Class of Student Class
*/
	
import java.util.Scanner;

public class DemoDoctor
{
	public static void main(String[] args)
	{
	Doctor D1= new Doctor("Elsa","Pediatrician",100.1);
	Doctor D2= new Doctor("Edwin","Obstetrician",109.9);
	
	

	System.out.println(D1);
	System.out.println(D2);
	D2.setSpecialty("General Practitioner");
	D2.setFee(200);
	System.out.println(D2);
	
	}

}