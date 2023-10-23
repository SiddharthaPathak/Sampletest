package pattern;

public class ConstructorTest 
{
	int num1;
	int num2;
	int num3;
	
	public ConstructorTest()
	{
		System.out.println("This is default consturctor");
	}
	
	public ConstructorTest(int a,int b)
	{
		System.out.println("This is parameterized Constructor");
		num1=a;
		num2=b;
	}
	
	public void sum()
	{
		num3=num1+num2;
		System.out.println("Addition of 2 no. is "+num3);
	}
	
	
	public static void main(String args[])
	{
		ConstructorTest B1=new ConstructorTest();
		ConstructorTest B2=new ConstructorTest(99,99);
		B2.sum();
		
		
		
	}
	

}
