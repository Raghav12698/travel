/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame implements ActionListener{
    Paytm(){
        setBounds(500,200,800,600);
        JEditorPane j = new JEditorPane();
        j.setEditable(false);   

        try {
            j.setPage("https://paytm.com/electricity-bill-payment");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        } 

        JScrollPane scrollPane = new JScrollPane(j);     
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        //setPreferredSize(new Dimension(800,600));
        
        JButton back=new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this); 
        j.add(back);
        
        setSize(800,600);
        setLocation(600,220);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) 
            {
                setVisible(false);
                new Payment();
            }
    public static void main(String[] args){
        new Paytm();
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}