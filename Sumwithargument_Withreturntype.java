import java.util.Scanner;
class  Sumwithargument_Withreturntype
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values one by one :- ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sum(x,y);
	}
	public static int sum(int a,int b)
	{
		int sum=a+b;
		System.out.println("The sum of given number is :- "+sum);
		return sum;
	}
}
