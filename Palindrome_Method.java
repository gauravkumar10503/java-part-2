class  Palindrome_Method
{
	public static void main(String[] args) 
	{
		System.out.println("Main method start form here ");
		pali(121);
	}

	public static void pali(int num)
	{
		int temp=num;
		int reverse=0;
		while(temp!=0)
		{
			int last=temp%10;
			reverse=reverse*10+last;
			temp=temp/10;
		}
		System.out.println("The reverse of given number is :- "+reverse);

		if(reverse==num)
		{
			System.out.println("given number is palindrome number ");
		}
		else
		{
			System.out.println("Given number is not a palindrome");
		}
	}
}
