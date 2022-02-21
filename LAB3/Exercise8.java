import java.util.*;
import java.util.Scanner;
class Exercise8{
public static boolean stringMethod(String str) {
       	String h=str.toLowerCase();
       char []ch=h.toCharArray();
       int j=ch[0];
       for(int i=1;i<ch.length;i++) {
    	   int c=h.charAt(i);
    	   if(j>c)
    		   return false;
       }
      
		return true;
	}
public static void main(String[] args){
Scanner sc=new Scanner(	System.in);
String str=sc.next();
System.out.println(stringMethod(str));
}
}