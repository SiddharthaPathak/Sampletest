package JavaAssignment;

import java.util.Scanner;

public class StudentClass 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Data");
		int marks=sc.nextInt();
		
		if(marks<35)
		{
			System.out.println("Student is fail");
		}
		else if(marks>=35 && marks<=50)
		{
			System.out.println("Student is pass");
		}
		else if(marks>50 && marks<60)
		{
			System.out.println("Student is second class”");
		}
		else
		{
			System.out.println("Student is First class");
		}
		

	}

}
