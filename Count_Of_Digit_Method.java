class  Count_Of_Digit_Method
{
	public static void main(String[] args) 
	{
		System.out.println("Main method start from here ");
		count(123);
	}

	public static void count(int num)
	{
		int temp=num;
		int count=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		System.out.println("Given number "+num+" hava total digit is :- "+count);
	}
}
