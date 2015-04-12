/**
 * @(#)P40.java
 *
 *
 * @author 
 * @version 1.00 2015/4/12
 */


public class P40 
{
	public static void pai(long b[])
	{
		for(int m=9;m>0;m--)
			for(int n=0;n<=m;n++)			
				if(b[n]>b[n+1])
				{
					long temp;
					temp=b[n+1];
					b[n+1]=b[n];
					b[n]=temp;
				}
	}
	public static void main (String args[]) 
    {
    	long a[]=new long[11];
    	for(int i=0;i<=10;i++)   	
    	{a[i]=(long)(100*Math.random());System.out.print(a[i]+" ");}
    	 for(int j=0;j<=10;j++)
    	 {pai(a); System.out.println(a[j]);}
    }
}