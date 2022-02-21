import java.util.Scanner;
class Exercise4{
public static int modifyNumber(int number1) {
	int z=number1%10;
	int y=number1/10;
    int x=y-z;
    if(x<0)
	x=x*(-1);
	return x;
	}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(modifyNumber(n));
}
}
