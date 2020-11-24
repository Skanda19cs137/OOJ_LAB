package see;
import java.util.*;
import java.io.*;
import java.lang.*;

public class external extends cie.student
{
	public int[] see_m=new int[3];
	public int[] mar;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the SEE marks : ");
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter the SEE marks of the course " + (i+1)+": ");
			see_m[i]=sc.nextInt();
		}
	}
}