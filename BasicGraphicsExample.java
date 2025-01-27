import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class BasicGraphicsExample extends JComponent
{
	public void paint(Graphics g)
	{
		Color c = new Color(255, 255, 255);	
		g.setColor(c);
		g.drawRect(100,50,50,200);
		g.fillRect(100,50,50,200);
	}
	public static void main(String args[])
	{
		JFrame frame = new JFrame("Basic Graphics");
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new BasicGraphicsExample());
	}
}
