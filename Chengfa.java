/**
 * @(#)Chengfa.java
 *
 *
 * @author 
 * @version 1.00 2015/4/10
 */


public class Chengfa 
{

    public static void main (String[] args) 
    {
    	
    	int k;

    	for(int i=1;i<=9;i++)
    		{
    			
    			for(int p=1;p<=i;p++){
    			
        		String s="    ";
    		    System.out.print(s);}
    		    
    			for(int j=1;j<=10-i;j++)
    			{
    			
    				System.out.print(i+"*"+j);
					System.out.print(" ");
   
    			}
    		
       			System.out.print("\n");  			
    		}
	}
    
    
}