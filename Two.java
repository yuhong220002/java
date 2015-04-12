/**
 * @(#)Two.java
 *
 *
 * @author 
 * @version 1.00 2015/4/11
 */


public class Two 
{
	public static int sum(int j)
	{	
		int m=0,n=1,p=0;
		if(j==1)
			return 0;
		else
		{		
			if(j==2)
				return 1;
			else
				{
					
			for(int i=3;i<=j;i++)
					{
						p=m+n;
						m=n;
						n=p;
					}	
			 	 return p;
				}
		}
	}
    public static void main (String args[]) 
    {
    	int s=Integer.parseInt(args[0]);
    	System.out.println("add="+sum(s));
    }
}