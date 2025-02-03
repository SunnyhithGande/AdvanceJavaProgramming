import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CardExample extends JFrame implements ActionListener
{
	CardLayout crd;
	JButton btn1,btn2,btn3;
	Container Cpane;
	CardExample()
	{
		Cpane = getContentPane();
		crd = new CardLayout();
		Cpane.setLayout(crd);
		btn1 = new JButton("CSN");
		btn2 = new JButton("CSO");
		btn3 = new JButton("CSE");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		Cpane.add("a",btn1);
		Cpane.add("b",btn2);
		Cpane.add("c",btn3);
	}
	public void actionPerformed(ActionEvent e)
	{
		crd.next(Cpane);
	}
	public static void main(String args[])
	{
		CardExample crd1 = new CardExample();
		crd1.setSize(300,300);
		crd1.setVisible(true);
		crd1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}