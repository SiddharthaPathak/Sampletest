package pattern;

public class LoginPage1 

{
	private String username;
	private String password;
	
	
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void dologin(String un,String psw)
	{
		System.out.println(un+" is username "+"& Password is "+psw);
	}

}
