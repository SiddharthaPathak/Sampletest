package pattern;

public class Array {

	public static void main(String[] args) 
	{
		int eid[]=new int[5];
		eid[0]=10;
		eid[1]=20;
		eid[2]=30;
		eid[3]=40;
		eid[4]=50;
		System.out.println(eid[0]);
		System.out.println(eid[1]);
		System.out.println(eid[2]);
		System.out.println(eid[3]);
		System.out.println(eid[4]);
		System.out.println("size of index is "+eid.length);
		System.out.println(eid[3]+eid[4]);
		
		for(int i=0;i<eid.length;i++)
		{
			System.out.println(eid[i]);
		}
		
		for(int i:eid)
		{
			System.out.println(i);
		}
	
		System.out.println("************************************");
		
		int marks[]= {10,20,30,40};
		
		System.out.println(marks.length);
		System.out.println(marks[3]);
		
		for(int i:marks)
		{
			System.out.println(i);
		}
		
		String name[]= {"ram","Sita","Om"};
		for(String i:name)
		{
			System.out.println(i);
		}
		
		 Object empdata[]= {"ram",9827946045L,'M',45};
		for(Object j:empdata)
		{
			System.out.println(j);
		}
		
		
	}

}
