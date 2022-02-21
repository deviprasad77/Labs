import java.util.*;
class Example1
{
  static int sumOfTheCubes(int n)
{
    int sum=0;
    while(n!=0)
{
   sum=sum+n%10;
   n=n/10;
}
return sum;
}
public static void main(String[] args)
{

  Scanner sc=new Scanner(System.in);
  System.out.println("enter number");
  int n=sc.nextInt();
  System.out.println(sumOfTheCubes(n));
}
}
  
