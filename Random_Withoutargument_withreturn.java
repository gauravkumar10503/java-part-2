class  Random_Withoutargument_withreturn
{
	public static void main(String[] args) 
	{
		System.out.println("Method start from here ");
		random();
	}
	public static double random()
	{
		double a=Math.random();
		System.out.println("The random number is :- "+a*101);
		return a;
	}
}
