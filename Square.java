/**
 * @(#)Square.java
 *
 *
 * @author 
 * @version 1.00 2015/4/12
 */


public class Square 
{
	public static  long square(int x)
	{
		long sum;
		sum=x*x;
		return sum;
	}
    
    public static void main (String args[]) 
    {
    	long a []=new long[11]; 
    	for(int i=10;i<=20;i++)
    	{
    		a[i-10]=square(i);
    		System.out.println(a[i-10]);
    	}
    }
}