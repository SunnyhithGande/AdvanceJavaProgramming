import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainFrameCalcSI extends JFrame{
	public MainFrameCalcSI()
	{
		setTitle("Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		JButton calc = new JButton("Calc");
		calc.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Calculator s = new Calculator();
			}
		});
		JButton si = new JButton("SI");
		si.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				SimpleIntrest si = new SimpleIntrest();
			}
		});
		JPanel panel = new JPanel();
		panel.add(si);
		panel.add(calc);
		add(panel);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new MainFrameCalcSI();
	}
}