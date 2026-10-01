class Method_Without_Argument_With_Returntype 
{
	public static void main(String[] args) 
	{
		System.out.println("Main start from here");
		System.out.println(getpi());
		double pi=getpi();
		System.out.println(pi);
		if(pi==3.1416)
		{
			System.out.println("True value ");
		}
		else
		{
			System.out.println("False value ");
		}
	}
	public static double getpi()
	{
		return 3.1416;
	}
}
