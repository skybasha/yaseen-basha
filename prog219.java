/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 long n,fact=1;
	
	    Scanner sc=new Scanner(System.in);
	   
            n=sc.nextLong();
int i=1;
	    while(i<=n)
	    {
	
	    fact=fact*i;
                     i++;
 	    }
 
  	    System.out.println(fact);
 
	}
	}
