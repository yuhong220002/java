/**
 * @(#)P28.java
 *
 *
 * @author 
 * @version 1.00 2015/4/11
 */


public class P28 
{
	public static double jie(int x)
	{
		double y=1;
		for(int j=1;j<=x;j++)
		{
			y*=j;
		}
		return y;
	}
	public static void main (String args[]) 
    {
    	double sum=0;
    	for(int i=1;i<=10;i++)
    	{
    		sum+=jie(i);
    	}
    System.out.println(sum);
    }
    
    
}