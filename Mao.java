/**
 * @(#)Mao.java
 *
 *
 * @author 
 * @version 1.00 2015/4/11
 */
import java.io.*;
public class Mao 
{
	public static void main(String args[])
	{
		final int l=10;
		int a[]=new int [10];
		for(int i=0;i<=a.length;i++)
		{
			a[i]=(int)(100*Math.random());
			System.out.print("  "+a[i]);
		}
	}
}