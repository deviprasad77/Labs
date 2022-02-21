package Exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter two numbers:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		sc.close();
		Abc powerObj=(x,y)->{
			return Math.pow(x, y);
		};
		System.out.println(powerObj.power(x1,y1));
	}

}
