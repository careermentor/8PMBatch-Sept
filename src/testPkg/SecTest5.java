package testPkg;

public class SecTest5 extends Test5
{

	
	public void meth2() 
	{
		System.out.println("this is my secret code");
		
	}

	public static void main(String[] args) 
	{
		SecTest5 st5 = new SecTest5();
		st5.meth1();
		st5.meth2();
	}
	
}
