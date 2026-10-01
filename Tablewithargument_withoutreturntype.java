import java.util.Scanner;
class Tablewithargument_withoutreturntype 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int x=sc.nextInt();
		table(x);
	}
	public static void table(int a)
	{
		int table=1;
		for(int i=1;i<=10;i++)
		{
			table=a*i;
			System.out.println(a+" x "+i+" = "+table);
		}
	}
}
