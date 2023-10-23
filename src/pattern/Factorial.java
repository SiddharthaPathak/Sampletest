package pattern;

public class Factorial {

	public static void main(String[] args)
	{
		int r=5;
		int num=1;
		for(int i=1;i<=r;i++)
		{
		num=num*i;
		}
		System.out.println(num);
	

		int a=10;
		int b=20;
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println(a+" is value of a and Value of B is "+b);
	}

}
