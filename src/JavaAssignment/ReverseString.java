package JavaAssignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Text");
		String s=sc.nextLine();
		
		for(int i=s.length();i>=1;i--)
		{
			System.out.print(s.charAt(i-1));
		}
	
	}

}
