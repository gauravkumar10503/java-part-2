class  Maxoftwo_Withargument_withreturn
{
	public static void main(String[] args) 
	{
		System.out.println("Main method start from here ");
		 max(5,10);
	}

	//public static String max(int a,int b)
	public static int max(int a,int b)
	{
		if(a>b)
		{
			System.out.println("Given number "+a+" is gearter than "+b);
		}
		else
		{
			System.out.println("Given number "+b+" is gearter than "+a);
		}
	//return (a+" "+b);
	return 1;
	}
}
