package Lab7;
import java.util.Scanner;
  
 class AgeVerifiedException extends Exception
{

}






public class Age {
	
		static void ageMethod(int age) throws AgeVerifiedException {
			if(age<15) {
				throw new AgeVerifiedException();
				
				}else
					System.out.println("Validate age");
		
			}
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter age");
			int age=sc.nextInt();		
			try {
				ageMethod(age);
			} catch (AgeVerifiedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Not verified");
			}
			}
}