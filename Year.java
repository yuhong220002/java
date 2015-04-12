/**
 * @(#)Year.java
 *
 *
 * @author 
 * @version 1.00 2015/4/11
 */
public class Year 
{
	public static void main (String args[]) 
    {
    	double y;
    	y=Double.parseDouble(args[0]);
    	if(y%400==0)
    	System.out.println("true");
    	else{
    	if(y%4==0&&y%100!=0)
    	System.out.println("true");
    	else
    	{
    	System.out.println("false");
    	}
    	}
    }
    
}