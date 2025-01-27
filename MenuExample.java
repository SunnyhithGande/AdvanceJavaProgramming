import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenuExample
{
	MenuExample()
	{
		JFrame f = new JFrame("Menu and MenuItems Example");
		JLabel label = new JLabel("Hello!!");
		label.setBounds(100,100,100,30);
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenu submenu = new JMenu("Submenu");
		JMenuItem i1 = new JMenuItem("Item 1");
		JMenuItem i2 = new JMenuItem("Item 2");
		JMenuItem i3 = new JMenuItem("Item 3");
		JMenuItem i4 = new JMenuItem("Item 4");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        mb.add(menu);
        f.add(label);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	public static void main(String args[])
	{
		new MenuExample();
	}
}