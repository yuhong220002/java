import java.awt.*;
public class Labapp
{
	public static void main (String[] args) 
	{
		Frame fra=new Frame("Labapp");
		Label lab=new Label();
		fra.setSize(1000,600);
		lab.setText("this is a label");
		lab.setAlignment(Label.CENTER);
		lab.setBackground(Color.green);
		lab.setForeground(Color.BLACK);
		Font fnt=new Font("Serief",Font.ITALIC+Font.BOLD,22);
		lab.setFont(fnt);
		fra.add(lab);
		fra.setVisible(true);
			
		
	} 
    
}