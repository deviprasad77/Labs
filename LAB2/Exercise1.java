import java.util.Arrays;
class Exercise1
{
   static int getSecondSmallest(int[] arr)
{  
  
   Arrays.sort(arr);
   System.out.println("The sorted array :"+ Arrays.toString(arr));
   int res=arr[1];
    return res;
}
  public static void main(String[] args)
{
   int arr[]={8,4,3,2,6};
  System.out.println("The smallest number is:"+ getSecondSmallest(arr));
}
}
 