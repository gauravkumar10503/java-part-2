import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method start form here !");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number :- ");
		int x=sc.nextInt();
		
		Table obj=new Table();
		obj.multi(x);
	}
	public void multi(int a)
	{
		int p=0;
		for(int i=1;i<=10;i++)
		{
			p=a*i;
			System.out.println(a+" x "+i+" = "+p);
		}
		
	}
}
