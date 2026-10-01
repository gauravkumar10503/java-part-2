import java.util.Scanner;
class Int_Double_Method 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number one by one :- ");
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		double a=sc.nextInt();
		double b=sc.nextInt();
		sum(a,b);
	}

	public static void sum(double x,double y)
	{
		System.out.println("Sum is :- "+(x+y));
	}
}
