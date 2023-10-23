package pattern;

public class StringClass {

	public static void main(String[] args) 
	{
		String S1="this Bill is of 1289";
		
		String price=S1.split(" ")[4];
		
		int amount= Integer.parseInt(price);
		System.out.println(amount);
		if(amount==1289)
		{
			System.out.println("Price matched");
		}
		else {
			System.out.println("Price not matched");
		}
		
		System.out.println(S1.toLowerCase());
		System.out.println(S1.toUpperCase());
		System.out.println(S1.startsWith("this"));
		System.out.println(S1.endsWith("1289"));
		String S2="Hello,All,how,are,you";
		String S3="HELLO ALL";
		
		System.out.println(S2.equals(S3));
		System.out.println(S2.equalsIgnoreCase(S3));
		System.out.println(S1.contains("1289"));
		System.out.println(S1.trim());
		System.out.println(S1.charAt(5));
		System.out.println(" "+S1.concat(S3));
		System.out.println(S1.indexOf('l'));
		System.out.println(S2.split(",")[2]);
				
	}

}
