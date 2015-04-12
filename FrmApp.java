
import java.awt.*;
public class FrmApp
 {
	static Frame fra=new  Frame("FramApp");
	public static void main(String args[])
	{
		fra.setSize(1000,600);
		fra.setLocation(100,200);
		fra.setVisible(true);
		System.out.println("State:"+fra.getState());
		System.out.println("Title:"+fra.getState());
		System.out.println("Visible:"+fra.isVisible());		
		}

	

}
