import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.*;

class RegFormJDBC
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("User Registration");
        JPanel p = new JPanel();
        f.setSize(400, 300);
        p.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 50, 100, 20);
        p.add(l1);
        JTextField t1 = new JTextField(20);
        t1.setBounds(150, 50, 150, 20);
        p.add(t1);

        JLabel l2 = new JLabel("Email ID :");
        l2.setBounds(50, 100, 100, 20);
        p.add(l2);

        JTextField t2 = new JTextField(20);
        t2.setBounds(150, 100, 150, 20);
        p.add(t2);

        JLabel l4 = new JLabel("Password");
        l4.setBounds(50, 150, 100, 20);
        p.add(l4);

        JPasswordField t3 = new JPasswordField(20);
        t3.setBounds(150, 150, 150, 20);
        p.add(t3);

        JButton b1 = new JButton("SUBMIT");
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String name = t1.getText();
                String email = t2.getText();
                String password = new String(t3.getPassword());

                if(register(name, email, password))
                {
                    JLabel l5 = new JLabel("Registered Successfully");
                    l5.setBounds(150, 200, 150, 20);
                    p.add(l5);
                }
                else
                {
                    JLabel l6 = new JLabel("Error");
                    l6.setBounds(150, 200, 100, 20);
                    p.add(l6);
                }
            }
        });
        b1.setBounds(150, 200, 100, 20);
        p.add(b1);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static boolean register(String name, String email, String password)
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/6csn1b1", "root", "cclab");
            String query = "insert into form(name,email,password) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);

            int rowInserted = ps.executeUpdate();
            con.close();
            return rowInserted > 0;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return false;
        }
    }
}
