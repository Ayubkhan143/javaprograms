package Assignment1;

public class NonStatic3with3differentmethods {
	void add()
	{
		System.out.println("Started a new one");
	}

	void sub()
	{
		System.out.println("Calling 3 Non-Static methods with");
	}
	void Mul()
	{
		System.out.println("3 diffeerent variables");
	}
	public static void main(String[] args) {
		NonStatic3with3differentmethods n1=new NonStatic3with3differentmethods();
		NonStatic3with3differentmethods n2= new NonStatic3with3differentmethods();
		NonStatic3with3differentmethods n3=new NonStatic3with3differentmethods();
		n1.add();
		n2.sub();
		n3.Mul();
		
	}
}
