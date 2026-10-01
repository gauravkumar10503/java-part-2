class Method_Ex4 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		add(30,50);
		sqr(25);
	}

	public static void add(int a,int b)
	{
		System.out.print("The sum of two given number is :- "+(a+b));
		System.out.println();
	}
	public static void sqr(double a)
	{
		System.out.print("The squareroot of given number is :- "+(Math.sqrt(a)));
		System.out.println();
	}

}
