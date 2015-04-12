/**
 * @(#)Swap.java
 *
 *
 * @author 
 * @version 1.00 2015/4/11
 */
public class Swap 
{
	public static void swap(int i,int j)
		{
		int s=j;
		j=i;
		i=s;
		System.out.println(i+"S"+j);
	}
    public static void main (String[] args) 
    {
    	int x,y;
    	x=Integer.parseInt(args[0]);
    	y=Integer.parseInt(args[1]);
    	swap(x,y);
    	System.out.println(x+"ÊÇ"+y);
	}
}