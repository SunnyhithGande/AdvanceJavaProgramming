import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseListenerExample
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("MouseListenerExample");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Click,prees or move the mouse",SwingConstants.CENTER);
		frame.add(label);
		label.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent e)
			{
				System.out.println("Mouse Entered");
			}
			public void mouseClicked(MouseEvent e)
			{
				System.out.println("Mouse Clicked");
			}
			public void mousePressed(MouseEvent e)
			{
				System.out.println("Mouse Pressed");
			}
			public void mouseReleased(MouseEvent e)
			{
				System.out.println("Mouse Released");
			}
			public void mouseExited(MouseEvent e)
			{
				System.out.println("Mouse Exited");
			}
		});
	}
}