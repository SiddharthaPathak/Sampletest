package JavaAssignment;

public class Child12 extends Father12
{

	public void multi()
	{
		int a=20;
		int b=30;
		int c=a*b;
		System.out.println(c);
	}
	
	public static void main(String args[])
	{
		Child12 obj=new Child12();
		obj.sum();
		obj.multi();
	}
	

}
