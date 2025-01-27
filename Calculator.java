import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator
{
	    public Calculator()
		{
		JFrame frame = new JFrame("Calculator");
		JPanel panel = new JPanel();
		frame.setSize(300,300);
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int i1=Integer.parseInt(t1.getText());
				int i2=Integer.parseInt(t2.getText());
				int sum = i1+i2;
				t3.setText(""+sum);
			}
		});
		panel.add(t1);
		panel.add(t2);
		panel.add(t3);
		panel.add(add);
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		}
}
