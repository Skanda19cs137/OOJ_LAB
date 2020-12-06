package cie;
import java.util.*;
public class student
{
	public String usn;
	public String name;
	public int sem;

	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter usn of the student : ");
		usn=sc.next();
		System.out.print("Enter name of the student : ");
		name=sc.next();
		System.out.print("Enter semester of the student : ");
		sem=sc.nextInt();
	}
}

