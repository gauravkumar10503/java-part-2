import java.util.Scanner;
class Square_Withargument_Withoutreturn
{
	public static void main(String[] args) 
	{
		System.out.println("Method start from here");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int sq=sc.nextInt();
		square(sq);
	}
	public static void square(int num)
	{
		num=num*num;
		System.out.println("The square of given number is :- "+num);
	}
}
