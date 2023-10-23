package pattern;

public class BreakContinue {
	
	
	public static String info(String msg)
	{
		return msg;
	}

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}else
			{
				System.out.println(i);
			}
		}

		System.out.println("*******************************");
		
			for(int i=1;i<=10;i++)
			{
				if(i>=5)
				{
					break;
				}else
				{
					System.out.println(i);
				}
			}

		String data=info("Hello All");
		System.out.println(data);
	}

}
