class  Hcf_Method
{
	public static void main(String[] args) 
	{
		System.out.println("Main start from here ");
		hcfl(15,5);
	}
	public static void hcfl(int a,int b)
	{
		int hcf=1;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=hcf*i;
			}
		}
		System.out.println("The hcf of given number "+a+" and "+b+" is "+hcf);
		System.out.println();

		int lcm=0;
		lcm=(a*b)/hcf;
		System.out.println("The lcm of given number "+a+" and "+b+" is "+lcm);

	}
}
