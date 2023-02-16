import java.util.ArrayList;
import java.util.Scanner;

public class Demo 
{
	public static Scanner input=new Scanner (System.in);
	public static void main(String[] args) 
	{
		ArrayList<Contact> book = new ArrayList<Contact> ();
		
		//variables
		int option,exist,optionExit=0;
		String firstName,lastName,email,phoneNum,search;
		
		do
		{
			System.out.println("What do you want to do? \n1=display all contact\n2=add new\n3=Search");
			option=Integer.parseInt(input.next());
			switch(option)
			{
			case 1: 
				if (book.size()==0)
					System.out.println("Zero contact"); 
				else
				for(Contact a:book)
				{
					System.out.println("\nFirst Name: "+a.getFirstName()+" \nLast Name: "+a.getLastName()+" \nEmail: "+a.getEmail()+" \nPhone Number: "+ a.getPhoneNum()+"\n");
;				}//end for
				break;
			case 2:
				System.out.println("What is the First Name?");
				firstName=input.next();
				System.out.println("What is the Last Name?");
				lastName=input.next();
				System.out.println("What is the Email?");
				email=input.next();
				System.out.println("What is the Phone Number?");
				phoneNum=input.next();
				book.add(new Contact(firstName,lastName,email,phoneNum));
				break;
			case 3:
				System.out.println("What are you trying to find?");
				search=input.next();
				int found=0;
				for (Contact A : book)
				{
					if (A.getFirstName().indexOf(search) != -1)
					{
						System.out.println(A);
						found=1;
					}
					
					else if(A.getLastName().indexOf(search) != -1)
					{
						System.out.println(A);
						found=1;
					}

					else if(A.getEmail().indexOf(search) != -1)
					{
						System.out.println(A);
						found=1;
					}
	
					else if(A.getPhoneNum().indexOf(search) != -1)
					{	
						System.out.println(A);
						found=1;
					}
					if (found>0)
					{
						System.out.println("Found "+search);
						System.out.println("Do you want to display it or delete it? 1=display, 2=delete");
						option=Integer.parseInt(input.next());
						if(option ==1)
						{
							System.out.println(A);
						}
						else
						{
							book.remove(A);
							break;
						}
					}
					else
						System.out.println("No such person found");		
				}//end for

				break;
		}//end switch
	
		System.out.println("Do you want to continue? 1=yes,0=no");
		optionExit=Integer.parseInt(input.next());
		option=0;
		}while(optionExit!=0);
		

	}//end main
	

}//end class
