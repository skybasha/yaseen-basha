/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,K;
		Scanner sc=new Scanner(System.in);
	int	i=sc.nextInt();
	int	k=sc.nextInt();
		int a[]=new int[30];
		
		for( i=0;i<k;i++)
		{
			a[i]=sc.nextInt();
		if(a[i]==k)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
			
		}
	}
}
