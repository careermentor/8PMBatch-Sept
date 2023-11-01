package testPkg;

public class LearnMethods 
{
	
	
	
	
	public LearnMethods(int a, int b)
	{
		int j = a-b;
		System.out.println(j);
		System.out.println("this is a constructor with parameter");
	}
	
	int i = 20;
	
	public int printval()   //no arguments/parameters
	{
		System.out.println(i);
		return i;
	}
	
	public int sum(int a, int b) //arguments/parameters
	{
		int c = a+b;
		System.out.println("sum of two numbers: " + c);
		return c;
	}
	
	//10+20+30
	//x=10+20
	//x+30
	
	public void sqr(float a)
	{
		float b = a*a;
		System.out.println("value of SQ a: " + b);
		
	}
	
	public LearnMethods()
	{
		int j = 50;
		System.out.println(j);
		System.out.println("this is a constructor");
		
	}
	
	public static void main(String[] args) 
	{
	
		//System.out.println("this is a main method");
		
		LearnMethods abc = new LearnMethods(); //constructor will be automatically called
		
		abc.printval();
		
		abc.sum(20, 30);
		abc.sqr(30);
		
		int x = abc.sum(10, 20);
		
		//int y = abc.sqr(20);
		abc.sum(x, 30);
		
		
		LearnMethods xyz = new LearnMethods(50,30);  //constructor having parameter will be called
		
		xyz.sum(30, 40);
	}	
	
	
}
