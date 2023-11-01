package testPkg;

public class DemoKeywords 
{

	final int a = 40;  //global variable
	
	public void var1()
	{
		final int a = 20;   // local variable
		//a=30;
		System.out.println("value of a: " + a);  //20
		System.out.println(this.a);    // 40
	}
	
	public void var2()
	{
		//a=50;
		System.out.println(a);  
	}
	
	public static void main(String[] args) {
		DemoKeywords dk = new DemoKeywords();
		dk.var1();
	}
}
