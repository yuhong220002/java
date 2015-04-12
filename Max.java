/**
 * @(#)Max.java
 *
 *
 * @author 
 * @version 1.00 2015/4/10
 */

/*取三个数的最大值*/
public class Max 
{
	public static void main (String[] args) 
	{
		double i,j,k,maxs,maxq;
		i=Double.parseDouble(args[0]);
		j=Double.parseDouble(args[1]);
		k=Double.parseDouble(args[2]);
		maxs=Math.max(i,j);
		maxq=Math.max(maxs,k);
		System.out.println(maxq);
    }
    
    
}