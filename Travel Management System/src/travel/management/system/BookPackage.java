/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.*;
import java.awt.EventQueue;


import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class BookPackage extends JFrame {
	private JPanel contentPane;
        JTextField t1,t2;
        JLabel l1,l2,l3,l4,l5;
        Choice c1,c2,c3;
        String username;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookPackage frame = new BookPackage("tarun12"); 
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BookPackage(String username) {
                this.username=username;
		setBounds(420, 220, 1100, 450);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,50,700,300);
                add(la1);
		
		JLabel lblName = new JLabel("BOOK PACKAGE");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 300, 53);
		add(lblName);
                
                JLabel la2 = new JLabel("Username :");
                la2.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		la2.setBounds(35, 70, 200, 14);
		add(la2);
                
                JLabel l1 = new JLabel(username);
		l1.setBounds(271, 70, 200, 14);
		add(l1);
                
                JLabel lblId = new JLabel("Select Package :");
		lblId.setBounds(35, 110, 200, 14);
		add(lblId);
                
                c1 = new Choice();
                c1.add("Gold Package");
                c1.add("Silver Package");
                c1.add("Bronze Package");
                c1.setBounds(271, 110, 150, 30);
                add(c1);
                
                JLabel la3 = new JLabel("Total Persons");
		la3.setBounds(35, 150, 200, 14);
		add(la3);
                
                t1 = new JTextField();
                t1.setText("0");
		t1.setBounds(271, 150, 150, 20);
		add(t1);
		t1.setColumns(10);
                
		JLabel lbl1 = new JLabel("ID :");
		lbl1.setBounds(35, 190, 200, 14);
		add(lbl1);
                
                JLabel l2= new JLabel();
		l2.setBounds(271, 190, 200, 14);
		add(l2);
		
		JLabel lbl2 = new JLabel("Number :");
		lbl2.setBounds(35, 230, 200, 14);
		add(lbl2);
                
                JLabel l3 = new JLabel();
		l3.setBounds(271, 230, 200, 14);
		add(l3);
           	
		JLabel lbl3 = new JLabel("Phone :");
		lbl3.setBounds(35, 270, 200, 14);
		add(lbl3);
                
                JLabel l4 = new JLabel();
		l4.setBounds(271, 270, 200, 14);
		add(l4);

		
		JLabel lblDeposite = new JLabel("Total Price :");
		lblDeposite.setBounds(35, 310, 200, 14);
		add(lblDeposite);
		
		JLabel l5 = new JLabel();
		l5.setBounds(271, 310, 200, 14);
                l5.setForeground(Color.RED);
		add(l5);
                
                try{
                    Conn c = new Conn();
                    String query="select * from customer where username = '"+username+"'";
                    ResultSet rs = c.s.executeQuery(query);
                        if (rs.next()) {
                            // Retrieve data from ResultSet and print to console for verification
                            String id = rs.getString("id");
                            String number = rs.getString("number");
                            String phone = rs.getString("phone");

                            System.out.println("ID: " + id); // Debug print
                            System.out.println("Number: " + number); // Debug print
                            System.out.println("Phone: " + phone); // Debug print

                            // Set data to labels
                            l2.setText(id);        // Set ID
                            l3.setText(number);    // Set Number
                            l4.setText(phone);     // Set Phone

                            // Print to confirm label text is set
                            System.out.println("Label ID Text: " + l2.getText());
                            System.out.println("Label Number Text: " + l3.getText());
                            System.out.println("Label Phone Text: " + l4.getText());
                        } else {
                            JOptionPane.showMessageDialog(null, "User details not found in the database.");
                        }

                    rs.close();
                }catch(SQLException e){e.printStackTrace();}
                setVisible(true);
                
                JButton b1 = new JButton("Check Price");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            String p = c1.getSelectedItem();
                            int cost = 0;
                            if(p.equals("Gold Package")) {
                                cost += 12000;
                            }if(p.equals("Silver Package")){
                                cost += 25000;
                            }else if(p.equals("Bronze Package")){
                                cost += 32000;
                            }
                            
                            cost *= Integer.parseInt(t1.getText());
                            l5.setText("Rs "+cost);
                            
                        }
		});
		b1.setBounds(50, 350, 120, 30);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		

		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                          
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "insert into bookPackage values('"+username+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+l2.getText()+"', '"+l3.getText()+"', '"+l4.getText()+"', '"+l5.getText()+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                                setVisible(false);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
                            
			}
		});
		btnNewButton.setBounds(200, 350, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(350, 350, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}