package pattern;

public class Employee 
{
	public String name="Shyam";
	public int empid=101;
	private int salary=50000;
	
	public void display()
	{
	System.out.println(name);
	System.out.println(empid);
	System.out.println(salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
