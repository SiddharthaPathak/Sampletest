package pattern;

public class patterntest 
{

	public static void main(String[] args) 
	
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(c+" ");
			}
			
			System.out.println();
			
		}

		
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(r+" ");
			}
			
			System.out.println();
		}
		
		int k=1;
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(k+" ");
				k++;
			}
			
			System.out.println();
			
		}
		
		for(int r=1; r<=10;r++)
		{
			if(r<5)
			{
				System.out.println(r);
			}
			else
			{
				System.out.print(r+" ");
			}
				
		}
		
	}
}

