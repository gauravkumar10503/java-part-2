import java.util.Scanner;
class Prime_Input_Method 
{
	public static void main(String[] args) 
	{
		System.out.println("Main methode start from here ");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int x=sc.nextInt();
		prime(x);
	}
	public static void prime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Given number "+num+" is prime number ");
		}
		else
		{
			System.out.println("Given number "+num+" is not prime number ");
		}
	}
}
