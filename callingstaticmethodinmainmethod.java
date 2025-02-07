package Assignment1;

public class callingstaticmethodinmainmethod 
{
	static void Addition()
	{
		 int a=10;
		 int b= 20;
		 int c=a+b;
		 System.out.println(c);
	}
	
	static void Sub()
	{
		 int a=10;
		 int b= 20;
		 int c=a-b;
		 System.out.println(c);
	}
	static void Mul()
	{
		 int a=10;
		 int b= 20;
		 int c=a*b;
		 System.out.println(c);
	}
	static void Div()
	{
		 int a=10;
		 int b= 20;
		 int c=a/b;
		 System.out.println(c);
	}
	
	static void Mod()
	{
		 int a=10;
		 int b= 20;
		 int c=a%b;
		 System.out.println(c);
	}
	

public static void main(String[] args) 
{
	System.out.println("College ID");
	
Addition();
Sub();
Mul();
Div();
Mod();

	
}

}
