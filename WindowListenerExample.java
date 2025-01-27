import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import javax.swing.*;
public class WindowListenerExample
{
	private static void createWindow()
	{
		JFrame frame = new JFrame("Simple UI");
		JLabel label = new JLabel("label",SwingConstants.CENTER);
		label.setPreferredSize(new Dimension(300,100));
		frame.getContentPane().add(label,BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addWindowListener(new WindowListener()
		{
			public void windowOpened(WindowEvent e)
			{
				System.out.println("Window is opened:");
			}
			public void windowClosing(WindowEvent e)
			{
				System.out.println("Window is Closing");
			}
			public void windowIconified(WindowEvent e)
			{
				System.out.println("Window is iconified");
			}
			public void windowClosed(WindowEvent e)
			{
				System.out.println("Window is closed");
			}
			public void windowActivated(WindowEvent e)
			{
				System.out.println("Window is activated!");
			}
			public void windowDeactivated(WindowEvent e)
			{
				System.out.println("Window is deactivated");
			}
			public void windowDeiconified(WindowEvent e)
			{
				System.out.println("Window Deconified");
			}
		});
	}
	public static void main(String args[])
	{
	    WindowListenerExample w = new WindowListenerExample();
        w.createWindow();		
	}
}