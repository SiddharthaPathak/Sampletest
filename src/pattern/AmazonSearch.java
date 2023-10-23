package pattern;

public class AmazonSearch 

{
	String name;
	public void search()
	{
	
		System.out.println("The search result for name is "+name);
	}
	
	public void search(int id)
	{
		
		System.out.println("The search result for id is "+id);
	}
	
	public void search(String name, int id)
	{
		
		System.out.println("The search result for name is "+name+id);
	}
	
	public void search(double price)
	{
		
		System.out.println("The search result for price is "+price);
	}

}
