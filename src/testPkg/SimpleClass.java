package testPkg;

public abstract class SimpleClass 
{

	int i=20;
	
	public void meth1()
	{
		i =50;
		System.out.println("this is concrete method");
	}
	
	public abstract void meth2();
	
	public static void main(String[] args) 
	{
	
		//SimpleClass sc = new SimpleClass();
		//sc.meth1();
		
	}
	
}
