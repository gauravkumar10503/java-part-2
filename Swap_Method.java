class Swap_Method 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method start from here ");
		swap(5,10,15);
	}
	public static void swap(int a,int b,int c)
	{
		a=b;
		b=c;
		System.out.println("After swaping,result is "+a);
		System.out.println("After swaping,result is "+b);
	}
}
