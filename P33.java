/**
 * @(#)P33.java
 *
 *
 * @author 
 * @version 1.00 2015/4/11
 */
public class P33 
{
	public static void create(int [] [] a)
	{
		for (int row=0;row<a.length;row++)
		{
			for(int b=0;b<a[row].length;b++)
			{a[row][b]=(int)(100*Math.random());}
		}
	}
	public static  int max (int [] [] a)
	{
		int s=a[0][0];
		for(int x=0;x<a.length;x++)
		{		
			for(int y=0;y<a[x].length;y++)
			{
				if(a[x][y]>s)
				s=a[x][y];
			}
		}
		return s;
	}
	
	public static void pub(int [][] a)
	{
		for(int m=0;m<3;m++)
		{
		for(int n=0;n<4;n++)
		System.out.print(a[m][n]+"  ");
		System.out.println();
		}
	}
	public static void main (String args[]) 
    {
    	int [][] a=new int [3] [4];
    	create(a);
    	pub(a);
    	System.out.println(max(a));
    }
}