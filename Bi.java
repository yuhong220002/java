/**
 * @(#)Bi.java
 *
 *
 * @author 
 * @version 1.00 2015/4/12
 */
public class Bi 
{
	public static double max(double p, double q)
	{
		double s;
		s=Math.max(p,q);
		return s;
	}    
    public static void main (String args[]) 
    {
    	double a,b,c;
    	a=Integer.parseInt(args[0]);
    	b=Integer.parseInt(args[1]);
    	c=Integer.parseInt(args[2]);
    	double m,n;
    	m=max(a,b);
    	n=max(m,c);
    	System.out.println(n);
    }
}