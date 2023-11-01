package testPkg;

public class CallInterface implements DemoInterfaces
{

	
	public void meth3() 
	{
	
		System.out.println("this is body of interface method");
		
	}

	public void method4()
	{
		System.out.println("this is simple method");
	}
	
	
	public static void main(String[] args) {
		CallInterface ci = new CallInterface();
		ci.meth3();
		ci.method4();
	}
}
