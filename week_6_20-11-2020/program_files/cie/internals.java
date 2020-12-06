package cie;
import java.util.*;

public class internals extends student
{
	public int[] cie_m=new int[3];

	public void read()
	{
		super.read();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the CIE marks : ");
	    for(int i=0;i<3;i++)
	    {
	    	System.out.print("Enter marks of the course " + (i+1)+": ");
	    	cie_m[i]=sc.nextInt();
	    }
	}
	public void display()
	{
		System.out.println("USN of the student is " + usn);
		System.out.println("Name of the stuednt is " + name);
		System.out.println("Semester of the student is " + sem);
	}


}