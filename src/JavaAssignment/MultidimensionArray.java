package JavaAssignment;

public class MultidimensionArray {

	public static void main(String[] args) 
	{
		int obj[][]= {{1,6},{2,7},{3,8},{4,9},{5,10}};
		
		
		for (int i[]:obj)
		{
			for(int j:i)
			{
				System.out.println(j+" ");
			}
		}
		
		for(int r=0;r<obj.length;r++)
		{
			for(int c=0;c<obj[r].length;c++)
			{
				System.out.print(obj[r][c]+" ");
			}
			System.out.println();
		}
		
	

	}

}
