/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		number=sc.nextInt();
		if(number>0)
		{
			System.out.println("positive number");
		}
		else if(number<0)
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println("number is zero");
		}
	}
 }
