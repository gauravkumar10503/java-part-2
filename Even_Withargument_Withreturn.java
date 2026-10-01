import java.util.Scanner;
class  Even_Withargument_Withreturn
{
	public static void main(String[] args) 
	{
		System.out.println("Main start from here ");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int x=sc.nextInt();
		even(x);
	}
	public static String even(int num)
	{
		boolean flag=false;
		if(num%2==0)
		{
			flag=true;
		}
		if(flag==true)
		{
			System.out.println("Given number "+num+" is even");
		}
		else
		{
			System.out.println("Given number "+num+" is not even");
		}
		return true+" "+false;
	}
}
