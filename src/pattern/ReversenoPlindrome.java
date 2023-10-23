package pattern;

public class ReversenoPlindrome 
{

	public static void main(String[] args) 
	{
		int no=454,rem,res=0;
		int k=no;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			res=res*10+rem;
		}
		System.out.println("reverse of value is "+res);
		if(k==res)
		{
			System.out.println("The no. is pelindrome no");
		}
		
	}
	

}
