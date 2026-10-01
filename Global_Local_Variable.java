class Global_Local_Variable 
{
	static int a=10;
	public static void main(String[] args) 
	{
		System.out.println("Global value of 'a' is :- "+a);
		local(a);
		local2();
	}
	public static int local(int a)
	{
		a=20;
		System.out.println("Updated value of 'a' in local :- "+a);
		return a;
	}

	public static void local2()
	{
		a=50;
		System.out.println("Updated value of 'a' in local :- "+a);
	}
}