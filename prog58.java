/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			  Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt(),c=0;
       int arr[]=new int[a];
       for(int i=0;i<a;i++){
           arr[i]=in.nextInt();
       }
       for(int i=0;i<a;i++){
           if(arr[i]==b){
               c++;
           }
       }
       System.out.println(c);
	}
}
