package pattern;

public class MultiDimensionArray 
{

	public static void main(String[] args) 
	
	{
		int empid [] []=new int [2] [3];
		empid[0][0]=10;
		empid[0][1]=20;
		empid[0][2]=60;
				
		empid[1][0]=30;
		empid[1][1]=40;
		empid[1][2]=70;
		System.out.println(empid.length);
		System.out.println(empid [1].length);
		System.out.println(empid[1][2]);
		
		for(int r=0;r<empid.length;r++)
		{
			for(int c=0;c<empid[r].length;c++)
			{
				System.out.print(empid[r][c]+" ");
			}
			System.out.println();
		}
		
		for(int r[]:empid)
		{
			for(int c:r)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
