package JavaAssignment;

public class SingleDimensionArray {

	public static void main(String[] args) 
	{
		int marks[] = new int[5];
		
		marks[0]=1;
		marks[1]=2;
		marks[2]=3;
		marks[3]=4;
		marks[4]=5;
		
		System.out.println(marks.length);
		
		for(int i:marks)
		{
			System.out.println(i);
		}
		
	}

}
