package travel.management.system;

import java.awt.*;
import javax.swing.*;
public class Dashboard extends JFrame
{
    Dashboard()
    {
        setExtendedState (JFrame.MAXIMIZED_BOTH); 
        setLayout(null);
        JPanel pl =new JPanel();
        pl.setLayout(null);
        pl.setBackground(new Color(0,0,102));
        pl.setBounds(0, 0, 1600, 65);
        add(pl);
        
        ImageIcon i1 =new ImageIcon (ClassLoader.getSystemResource("Travel/Management/System/icons/dashboard.png")); 
        Image i2=i1.getImage().getScaledInstance(70, 70, Image. SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel icon =new JLabel(i3); 
        icon.setBounds(5, 0, 70, 70);
        pl.add(icon);
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        pl.add(heading);
        JPanel p2 =new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        JButton addPersonalDetails =new JButton("Add Personal Details");
        addPersonalDetails.setBounds (0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground (Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin (new Insets (0, 0, 0, 60));
        p2.add(addPersonalDetails);
        
        JButton updatePersonalDetails =new JButton("Update Personal Details");
        updatePersonalDetails.setBounds (0, 50, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground (Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin (new Insets (0, 0, 0, 30));
        p2.add(updatePersonalDetails);
        
        JButton viewPersonalDetails =new JButton("View Personal Details");
        viewPersonalDetails.setBounds (0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground (Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin (new Insets (0, 0, 0, 60));
        p2.add(viewPersonalDetails);
        
        JButton deletePersonalDetails =new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds (0, 150, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground (Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin (new Insets (0, 0, 0, 40));
        p2.add(deletePersonalDetails);
        
        JButton checkpackages =new JButton("Check Package");
        checkpackages.setBounds (0, 200, 300, 50);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground (Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin (new Insets (0, 0, 0, 110));
        p2.add(checkpackages);
        
        JButton bookpackages =new JButton("Book Package");
        bookpackages.setBounds (0, 250, 300, 50);
        bookpackages.setBackground(new Color(0, 0, 102));
        bookpackages.setForeground (Color.WHITE);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackages.setMargin (new Insets (0, 0, 0, 110));
        p2.add(bookpackages);
        
        JButton bookhotels =new JButton("Book Hotel");
        bookhotels.setBounds (0, 350, 300, 50);
        bookhotels.setBackground(new Color(0, 0, 102));
        bookhotels.setForeground (Color.WHITE);
        bookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotels.setMargin (new Insets (0, 0, 0, 150));
        p2.add(bookhotels);
        
        JButton viewhotels =new JButton("View Hotel");
        viewhotels.setBounds (0, 300, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground (Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin (new Insets (0, 0, 0, 150));
        p2.add(viewhotels);
        
        
        
        JButton bookhotels =new JButton("viewBooked Hotel");
        bookhotels.setBounds (0, 350, 300, 50);
        bookhotels.setBackground(new Color(0, 0, 102));
        bookhotels.setForeground (Color.WHITE);
        bookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotels.setMargin (new Insets (0, 0, 0, 150));
        p2.add(bookhotels);
        
        
        setVisible(true);
    } 
    public static void main(String []args)
    {

        new Dashboard();
    }
    
}
