package JavaAssignment;

import java.util.Scanner;

public class ExceptionDemo14 

{
	
	public void division(int a,int b)
	{
		System.out.println("Division of given no. are "+a/b);
	}

	public static void main(String[] args) 
	{
		ExceptionDemo14 div=new ExceptionDemo14();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter two no.s ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try
		{
			
			div.division(num1, num2);
		}catch(Exception e)	
		{
			System.out.println("Please enter values other than zero " +e);
		
		}
	
	}

}
