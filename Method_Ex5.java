class Method_Ex5 
{
	public static void main(String[] args) 
	{
		System.out.println("main method");
		cuboid(5.5,7.5,4.5);
		reverse(123);
	}

	public static void cuboid(double l,double b,double h)
	{
		System.out.print("The voiume of cuboid is :- "+(l*b*h));
		System.out.println();
	}
	public static void reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		System.out.print("The reverse of given number is :- "+rev);
		System.out.println();
	}
		
}