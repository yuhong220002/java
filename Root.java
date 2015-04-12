/**
 * @(#)Root.java
 *
 *
 * @author 
 * @version 1.00 2015/4/11
 */
public class Root 
{
	public static void  root (double i,double j,double k)
	{
		double s,q;
		s=j*j-4*i*k;
		q=Math.sqrt(s);
		double x1,x2;
		if(q<0)
			System.out.println("false");
		else
		{
			x1=(-j-q)/2*i;
			x2=(-j+q)/2*i;
		System.out.println("x1="+x1+"   x2="+x2);
		}
		
	}
    public static void main (String args[]) 
    {
    	double x,y,z;
    	x=Double.parseDouble(args[0]);
    	y=Double.parseDouble(args[1]);
    	z=Double.parseDouble(args[2]);
    	root(x,y,z);
    }
    
}