import java.util.Scanner;
class  Greeting_Withargument_Withoutreturn
{
	public static void main(String[] args) 
	{
		System.out.println("Method start from here");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your word :- ");
		String s=sc.next();
		greeting(s);
	}
	public static void greeting(String a)
	{
		System.out.println("Your given string is :- "+a);
	}
}
