package pattern;

public class AmazonSearchTest {

	public static void main(String[] args) 
	{
		AmazonSearch S1=new AmazonSearch();
		S1.name="Dell";
		S1.search();
		S1.search("peterENgland", 40);
		S1.search(105.50);
		S1.search(7456);

	}

}
