/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int num, rem, orig, rev=0;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        orig = num;
		
        while(num != 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(rev==orig)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("not");
        }
	}
}
