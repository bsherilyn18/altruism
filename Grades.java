package javacode;
import java.util.Scanner;
public class Grades 
{
    public static void main (String[]args)
    {
     Scanner assignment = new Scanner (System.in);
     int she = 0, sum = 0, grades = 0, i = 0;
        do
        {
	 System.out.println ("Do you want to enter a grade?");
	 System.out.println ("Press 1 == YES");
	 System.out.println ("Press 2 == NO");
   	 she = assignment.nextInt();
            if ( she == 1)
            {
	     System.out.println ("You chose YES");
	     System.out.println ("Please enter a grade:");
	     grades = assignment.nextInt();
	     sum += grades;
	     i++;
            }
            else
            {
	     System.out.println ("You chose NO"); 
            }
        }while (she == 1);
	 sum = sum / i;
	 System.out.print ("Total average is: " +sum);
    }
}