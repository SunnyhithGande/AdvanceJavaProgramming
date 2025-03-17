import java.util.*;
class Employee
{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString()
	{
		return "Employee ID: " + id + ",Name: " + name + ", Salary: " + salary;
	}
}
public class VectorExample
{
	public static void main(String args[])
	{
		Vector<Employee> e = new Vector<>();
        e.add(new Employee(1,"ABC",50000));
        e.add(new Employee(2,"XYZ",55000));
        e.add(new Employee(3,"GHI",60000));

        System.out.println("Iterator to display the Employee details");
        Iterator<Employee> i = e.iterator();
        while(i.hasNext())
		{
			System.out.println(i.next());
		}			
		
		System.out.println("Using Enumeration");
		Enumeration<Employee> enumeration = e.elements();
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
	}
}