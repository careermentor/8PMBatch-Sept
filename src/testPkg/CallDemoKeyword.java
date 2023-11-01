package testPkg;

public class CallDemoKeyword extends DemoKeywords
{

	int a= 60;
	public void var3()
	{
		int a = 50;
		System.out.println(a);//50
		System.out.println(this.a);  //60
		
		System.out.println(super.a);  //40
	}
	
}
