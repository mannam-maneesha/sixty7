/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int a,b,i;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 b=a+10;
	 if(a>0)
	 {
	 	for(i=a;i<b;i++)
	 	{
	 		if(i%10==0)
	 		{
	 			break;
	 		}
	 	}
	 	System.out.println(i);
	 }
	 
	}
}
