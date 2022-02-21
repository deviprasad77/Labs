package Lab7;

class NameException extends Exception{
	
}

public class Name 
{
	public static void main(String[] args)
	{
		
		String firstName="devi";
		String lastName="pk";
		//String fullName=firstName.concat(lastName);
		String fullName=firstName+lastName;
		if(firstName==" " && lastName=="")
		{
			System.out.println(fullName);
		}
		try 
		{
			empName( firstName, lastName);
		}
		catch(NameException e)
		{
			System.out.println("Firstname and Lastname should not be Blank");
		}
		
	}

	public static void empName(String firstName,String lastName) throws NameException
	{
		
		if(firstName=="" || lastName=="") {
			 throw new NameException();}
		else
		{
			System.out.println("FIRSTNAME AND LASTNAME Filled Suuccesfully");
		}
		
	}
	

	

}
