package Assignment1;

public class Forloop51to0 
{
public static void main(String[] args) {
	int a=21;
	int b=32;
	int c=43;
	int d=54;
	if(a>b&&c<d)
	{
		System.out.println("Correct declared");
	}
	else
	{
		System.out.println("Wrong declared");
	}
	if(a>b||b<c)
	{
		System.out.println("Any one of the statement is correct then it will print");
	}
	else
	{
		System.out.println("Or else it wont print");
	}
	if(!(a>b&&c<d))
	{
		System.out.println("wrong declared");
	}
	else
	{
		System.out.println("Correct declared");
	}
	if(!(a>b||b<c))
	{
		System.out.println("Any one of the statement is correct then it will print");
	}
	else
	{
		System.out.println("Or else it wont print");
	}
	}
}

