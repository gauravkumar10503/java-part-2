class Greet 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Greet obj=new Greet();
		obj.hello();
	}
	public void hello()
	{
		System.out.println("Hello from a non static method!!");
	}
}
