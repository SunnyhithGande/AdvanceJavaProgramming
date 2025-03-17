import java.util.*;
class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private double marks;
	
	public Student(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getMarks()
	{
		return marks;
	}
	
	public int compareTo(Student other)
	{
		return Double.compare(this.marks,other.marks);
	}
     public String toString()
	 {
		 return "Student ID: " + id + ",Name: " + name + ", Marks: " + marks;
	 }
}
public class ComparableExample
{
	public static void main(String args[])
	{
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(1,"A",5.5));
		students.add(new Student(2,"B",9.2));
		students.add(new Student(3,"C",7.8));
		
		System.out.println("Before sorting");
		for(Student s : students)
		{
			System.out.println(s);
		}
		Collections.sort(students);
		System.out.println("\nAfter sorting by marks:");
		for(Student s : students)
		{
			System.out.println(s);
		}
	}
}
