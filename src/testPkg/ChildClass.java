package testPkg;

public class ChildClass implements SimpleInterface//extends SimpleClass
{

	
	public void meth2()
	{
	
		System.out.println("this is abstract method code");
		
	}

	
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		//cc.meth1();
		//cc.meth2();
		cc.meth3();
	}


	
	public void meth3()
	{
		System.out.println("this is method of interface");
		
	}
	
}
