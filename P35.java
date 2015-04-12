/**
 * @(#)P35.java
 * @author 
 * @version 1.00 2015/4/12
 */
public class P35 
{
	public static void Shu(int [][]a)
	{
		for(int x=0;x<a.length;x++)
			for(int y=0;y<a[x].length;y++)
				a[x][y]=(int)(100*Math.random());
	}
	public static void Show(int [][]a)
	{
		for(int p=0;p<a.length;p++)
		{		
			for(int q=0;q<a[p].length;q++)
			{System.out.print(a[p][q]+" ");}
			System.out.println();
		}
	}
	public static void Max(int [][]a)
	{
		double  sum=0;
		for(int m=0;m<a.length;m++)
		sum+=a[m][m];
		System.out.println(sum);
	}
	public static void main(String args[])
	{
		int [][] a=new int [3][3];
		Shu(a);
		Show(a);
		Max(a);
	}
}