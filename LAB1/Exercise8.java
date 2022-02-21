import java.util.*;

class Exercise8
{
	public static boolean checkNumber(int n)
	{
         while(n%2==0)
       {
          n=n/2;
        }
         if(n==1)
        {
      return true;
        }
     else
      {
       return false;
      }
 }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
                  System.out.println(checkNumber(n));
	
		//if(checkNumber(n))
			//System.out.println(n+" is power of two");
		//else
			//System.out.println(n+" is not power of two");
	}
}