import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RegistrationForm
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("Registeration form");
		JPanel p = new JPanel();
		f.setSize(300,300);
		p.setLayout(null);
		
		JLabel l1 = new JLabel("First Name: ");
		l1.setBounds(120,50,100,20);
		p.add(l1);
		JTextField t1 = new JTextField(20);
		t1.setBounds(220,50,100,20);
		p.add(t1);
		
		JLabel l2 = new JLabel("Last Name:");
		l2.setBounds(120,100,100,20);
		p.add(l2);
		
		JTextField t2 = new JTextField(20);
		t2.setBounds(220,100,100,20);
		p.add(t2);
		
		JLabel l4 = new JLabel("Gender");
		l4.setBounds(120,150,50,20);
		p.add(l4);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(190,150,100,20);
		p.add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(300,150,100,20);
		p.add(r2);
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(r1);
		grp.add(r2);
		
		JLabel l3 = new JLabel("DOB");
		l3.setBounds(120,200,100,20);
		p.add(l3);
		
		String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14"};
		String months[] = {"Jan","Feb","Mar","Apr","may","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String years[] = {"1990","1990","1990","1990","1990","1990","1990","1990"};
		
		JComboBox day = new JComboBox(days);
		day.setBounds(150,200,100,20);
		p.add(day);
		
		JComboBox month = new JComboBox(months);
		month.setBounds(250,200,100,20);
		p.add(month);
		
		JComboBox year = new JComboBox(years);
		year.setBounds(350,200,100,20);
		p.add(year);

		JButton b1 = new JButton("SUBMIT");
		b1.setBounds(120,370,100,20);
		p.add(b1);
		f.add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

		