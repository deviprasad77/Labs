
class Exercise3
  public static void main(String[] args)
	{
		int[] arr ={1,2,3,4,5};
		int[] a=getSorted(arr);
		for (int i = 0; i < a.length; i++)
		{
		
		System.out.println(a[i]);
		}
		
	}
	public static int[] getSorted(int[] arr)
	{
		int[] rev=new int[arr.length];
		int j=0;
		for (int i=arr.length-1; i>=0; i--) 
		{
			rev[j]=arr[i];	
			j++;
		}
		return rev;
	}
}