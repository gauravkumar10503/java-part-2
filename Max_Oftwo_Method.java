class  Max_Oftwo_Method
{
	public static void main(String[] args) 
	{
		System.out.println("Main method start from here ");
		max(20,10);
	}

	public static void max(int a,int b)
	{
		if(a>b)
		{
			System.out.println("Greater number between "+a+" and "+b+" is "+a);
		}
		else
		{
			System.out.println("Greater number between "+b+" and"+a+" is"+b);
		}
	}
}