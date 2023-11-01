package testPkg;

public class CallQA1 
{

	public void printsum()
	{
		QA1 q1 = new QA1();
		q1.sum(20, 30);
	}
	
	
	public static void main(String[] args) {
		CallQA1 cq1 =  new CallQA1();
		cq1.printsum();
	}
	
}
