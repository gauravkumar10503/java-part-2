import java.util.Scanner;
class Method_Overloadingex2 
{
	public static void main(String[] args) 
	{
     	Scanner sc=new Scanner(System.in);
		System.out.println("Enter four number one by one :- ");
		int w=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		sum(w,x,y,z);
	}


	/*public static void sum(int a,int b)
	{
		System.out.println(" Sum is :-"+(a+b));
	}


	public static void sum(int a,int b)
	{
		System.out.println(" Sum is :-"+(a+b));
	}*/


	public static void sum(int a,int b,int c,int d)
	{
		System.out.println(" Sum is :-"+(a+b+c+d));
	}
}
