package JavaAssignment;

public class Finally15 {

	public static void main(String[] args) 
	{
		try {
		int x=10/0;
		System.out.println(x);
		} finally
		{
			System.out.println("This is finally method");
		}


	}

}
