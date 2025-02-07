package Assignment1;

public class Calling3SMand2NSM 
{
static void me()
{
	System.out.println("Started learning the program today");
}
static void host()
{
	System.out.println("What type of program it is");
}
static void me1()
{
	System.out.println("Calling 3 Static Methods");
}
void host1()
{
	System.out.println("Only that much or any other");
}
void me2()
{
	System.out.println("calling 2 non=static methods also");
}
public static void main(String[] args)
{
	me();
	host();
	me1();
	Calling3SMand2NSM c1= new Calling3SMand2NSM();
	c1.host1();
	c1.me2();
	}
	
}

