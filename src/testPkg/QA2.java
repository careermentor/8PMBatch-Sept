package testPkg;

public class QA2 extends QA1
{
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a & b: " + c); 
		
		//System.out.println(x);
		
		super.sum(20, 30);
		System.out.println("this is print statement");
	}
	
	
	
	public void callorgsum()
	{
		//super.sum(20, 30);
	}
	
	public void sum(int a, int b)  ///method declaration
	{
		int c = a*a+b*b;       //method body
		System.out.println("sum of a & b: " + c);  
		
		
	}
	
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		
		q2.sum(20, 30);  //1300
		q2.callorgsum();  //50
		q2.sub(50, 30);
		
	}

	
	public void QA1IM() {
		
		System.out.println("this method is from QA1I");
	}
	
	
	
	
	
}
