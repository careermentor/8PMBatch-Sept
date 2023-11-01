package testPkg;

public class QA1 
{

		
	public void sum(int a, int b)  ///method declaration
	{
		int c = a+b;       //method body
		System.out.println("sum of a & b: " + c);  
	}
	

	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of a & b & c: " + d);  
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of a & b: " + c);  
	}
	
	//10+10.5 = 20.5
	
	public static void main(String[] args) 
	{
	
		QA1 q1 = new QA1();
		
		q1.sum(200, 300);
		
		q1.sum(50, 1000);
		q1.sum(30, 40.5f);
		q1.sum(10, 20, 30);
		
	}
	
	
	
	
	
}
