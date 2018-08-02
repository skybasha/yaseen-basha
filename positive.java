import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		   int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println("positive");
        }
        else if(number < 0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("neither positive nor negative");}

	}
}
