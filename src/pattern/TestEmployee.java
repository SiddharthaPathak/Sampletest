package pattern;

public class TestEmployee {

	public static void main(String[] args) 
	
	{
		Employee A1=new Employee();
		A1.display();
		A1.empid=201;
		A1.display();
		A1.setSalary(54000);
		
		A1.display();
		System.out.println(A1.getSalary());

	}

}
