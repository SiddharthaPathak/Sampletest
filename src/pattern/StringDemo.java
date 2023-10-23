package pattern;

public class StringDemo 
{
	public static void main(String args[])
	{
		StringBuilder rev=new StringBuilder("SAI BABA");
		System.out.println(rev.reverse());
		
		String SS1="DATIA";
		String res="";
		for(int i=SS1.length()-1;i>=0;i--)
		{
			res=res+SS1.charAt(i);
		}
		System.out.println(res);
		
	}

}
