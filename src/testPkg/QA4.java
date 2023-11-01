package testPkg;

public class QA4 extends QA2 //implements QA3I
{

	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("div of a & b: " + c);  // + is concatanation  
	}
	
	public static void main(String[] args) 
	{
	
		QA4 q4 = new QA4();
		q4.sub(40, 10);
		q4.div(40, 20);
		q4.QA1IM();
		q4.QA3IM();
	}

	
	public void QA3IM() 
	{
	
		System.out.println("this method is from QA3I");
		
	}
	
	
	
	
	
}
