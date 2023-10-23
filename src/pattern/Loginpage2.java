package pattern;

public class Loginpage2 
{
	public static void main(String[] args)
	{
		LoginPage1 user1=new LoginPage1();
		user1.setUsername("siddharth");
		user1.setPassword("pathak");
		user1.dologin(user1.getUsername(), user1.getPassword());
		
		LoginPage1 user2=new LoginPage1();
		user2.setUsername("pankaj");
		user2.setPassword("verma");
		user2.dologin(user2.getUsername(), user2.getPassword());
		
		
		
	}
		
	
		

}
