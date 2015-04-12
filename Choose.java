/**
 * @(#)Choose.java
 *
 *
 * @author 
 * @version 1.00 2015/4/11
 */


public class Choose {

    public static void main (String args[]) 
    {
    	double i;
    	i=50;
    	double j;
    	j=Double.parseDouble(args[0]);
    	while(i!=j){
    	if(j>i)
    	System.out.println("big");
    	if(j<i)
    	System.out.println("small");
    	}
    	System.out.println("true");
    }
    
    
}