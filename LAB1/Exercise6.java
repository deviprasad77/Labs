import java.util.Scanner;
public class Exercise6 {
   public static int calculateDifference(int n){
    
      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
   
      int sumN = (n * (n + 1)) / 2;

      int squareSumN = sumN * sumN;
     
      return Math.abs(sumSquareN - squareSumN);
   }
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
      int n =sc.nextInt();
      System.out.println("Number: " + n);
      System.out.println("Difference: " + calculateDifference(n));
   }
}