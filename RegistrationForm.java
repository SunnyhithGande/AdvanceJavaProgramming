import java.util.*;
import javax.swing.*;
import java.awt.*;

class RegistrationForm {
	public static void main(String args[]) {
		JFrame f = new JFrame("Registration Form");
		JPanel p = new JPanel();
		f.setSize(600, 500); // Increased size to fit all components
		p.setLayout(null);

		// First Name
		JLabel l1 = new JLabel("First Name:");
		l1.setBounds(50, 50, 100, 20);
		p.add(l1);

		JTextField t1 = new JTextField(20);
		t1.setBounds(150, 50, 150, 20);
		p.add(t1);

		// Last Name
		JLabel l2 = new JLabel("Last Name:");
		l2.setBounds(50, 100, 100, 20);
		p.add(l2);

		JTextField t2 = new JTextField(20);
		t2.setBounds(150, 100, 150, 20);
		p.add(t2);

		// Gender
		JLabel l4 = new JLabel("Gender:");
		l4.setBounds(50, 150, 100, 20);
		p.add(l4);

		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(150, 150, 80, 20);
		p.add(r1);

		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(240, 150, 80, 20);
		p.add(r2);

		ButtonGroup grp = new ButtonGroup();
		grp.add(r1);
		grp.add(r2);

		// DOB
		JLabel l3 = new JLabel("DOB:");
		l3.setBounds(50, 200, 100, 20);
		p.add(l3);

		String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14"};
		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String years[] = {"1990","1991","1992","1993","1994","1995","1996","1997"};

		JComboBox<String> day = new JComboBox<>(days);
		day.setBounds(150, 200, 60, 20);
		p.add(day);

		JComboBox<String> month = new JComboBox<>(months);
		month.setBounds(220, 200, 80, 20);
		p.add(month);

		JComboBox<String> year = new JComboBox<>(years);
		year.setBounds(310, 200, 80, 20);
		p.add(year);

		// Submit Button
		JButton b1 = new JButton("SUBMIT");
		b1.setBounds(150, 270, 100, 30);
		p.add(b1);

		f.add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
