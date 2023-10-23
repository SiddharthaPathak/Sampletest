package pattern;

public class TwodimensionArrayAssignment {

	public static void main(String[] args) 
	{
		String data[][]= {{"sid","sid123","sid@p"}, {"prag","prag123","prag@p"}, {"Deep","Deep123","Deep@p"}};
		
		System.out.println(data.length);
		System.out.println(data[2].length);
		
		for(String r[]:data)
		{
			for(String c:r)
			{
				System.out.print(c+" ");
			}
			System.out.println();
				
			
		}
	

	}

}
