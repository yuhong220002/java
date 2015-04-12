/**
 * @(#)Add.java
 *
 *
 * @author 
 * @version 1.00 2015/4/11
 */


public class Add 
{
	public static double m()
	{	
		{		
		double o=1,p=-1,q=0,s=-1;
		for(int i=1;i<=50;i++)
			{	
			s*=p;
			q+=s*1/o;
			o++;
			}
			return q;
		}
	}
	
	public static void main (String args[]) 
    {
    	System.out.println(m());
    }
}