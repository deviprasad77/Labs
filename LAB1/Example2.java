import java.util.Scanner;
class Example2
{
  public static void main(String[] args)
{
  String light="";
   Scanner sc = new Scanner(System.in);
  light=sc.next();

  
  switch (light)
{
   case "red":
       System.out.println("Stop");
        break;
   case "green":
       System.out.println("Go");
        break;
  case "yellow":
       System.out.println("Ready");
        break;
   default:
     System.out.println("No Match");
}
}
 }
  
  