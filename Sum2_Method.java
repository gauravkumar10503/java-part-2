class  Sum2_Method
{
	public static void main(String[] args) 
	{
		System.out.println("Main start from here ");
		sum(123);
	}
	public static void sum(int num)
	{
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int last=temp%10;
			sum=sum+last;
			temp=temp/10;
		}
		System.out.println("The sum of given digit "+num+" is "+sum);
	}
}
