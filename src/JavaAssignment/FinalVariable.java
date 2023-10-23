package JavaAssignment;

public class FinalVariable 

{
	final int id =100;
	
}


class FinalVariable2 extends FinalVariable
{
	public static void main(String args[])
	{
		FinalVariable f1=new FinalVariable();
		f1.id=102;
	}
}



