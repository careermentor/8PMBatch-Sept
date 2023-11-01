package testPkg;

public class GoodClass 
{

	static int i = 30;
	
	public static void printval()
	{
		System.out.println("this is static method");
		System.out.println(i);
	}
	
	
	
	public static void main(String[] args) 
	{
	
		//GoodClass gc = new GoodClass();
		GoodClass.printval();
		
	}
	
}
