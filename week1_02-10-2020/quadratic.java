// Java program to find roots of a quadratic equation

import java.util.Scanner;
import static java.lang.Math.*;
class quadratic
{
	public static void main(String args[])
		{
			 quadratic obj = new quadratic();
			 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the value of a ::");
	     float a = sc.nextFloat();
	     System.out.print("Enter the value of b ::");
	     float b = sc.nextFloat();
	     System.out.print("Enter the value of c ::");
	     float c = sc.nextFloat();
				if (a == 0)
				{
					System.out.println("Invalid");
					return;
				}
				float d = b*b - 4*a*c;
				float sqrt_val = (float)Math.sqrt(abs(d));
				float root1= (-b + sqrt_val) / (2 * a);
				float root2=(-b - sqrt_val) / (2 * a);
				if(d == 0)
				{
         System.out.println("Roots are real and equal :: "+root1);
      	}
				else if (d > 0)
				{
						System.out.print("Roots are real and different \n");
						System.out.print(root1 + "\n"+ root2);
				}
				else
				{
					System.out.print("Roots are complex \n");
				  System.out.print( -b / ( 2 * a ) + " + i"+ sqrt_val/( 2 * a ) + "\n" + -b / ( 2 * a )+ " - i" + sqrt_val/( 2 * a ));
				}
		}

}
