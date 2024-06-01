package org.ems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainClass extends JFrame implements ActionListener {
String pin;
    JButton button1, button2, button3, button4, button5, button6, button7;
    JLabel label1;

    public mainClass(String pin) {
this.pin=pin;
        label1 = new JLabel("PLEASE SELECT YOUR TRANSACTIONS:");
        label1.setBounds(350, 100, 500, 100);
        label1.setForeground(new Color(0xFFFFFF));
        label1.setFont(new Font("Raleway", Font.BOLD, 19));
        add(label1);


        button1 = new JButton("DEPOSIT");
        button1.setBackground(new Color(0x1FA8F1));
        button1.setForeground(new Color(0xFFFFFF));
        button1.setBounds(600, 302, 180, 28);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("EXIT");
        button2.setBackground(new Color(0x0E0D0D));
        button2.setForeground(new Color(0xFFFFFF));
        button2.setBounds(680, 341, 100, 28);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("FAST CASH");
        button3.setBackground(new Color(0xF55E81));
        button3.setForeground(new Color(0xFFFFFF));
        button3.setBounds(310, 303, 180, 28);
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.addActionListener(this);
        add(button3);

        button4 = new JButton("PIN CHANGE");
        button4.setBackground(new Color(0xFA5114));
        button4.setForeground(new Color(0xFFFFFF));
        button4.setBounds(310, 265, 180, 28);
        button4.setFont(new Font("Arial", Font.BOLD, 14));
        button4.addActionListener(this);
        add(button4);

        button5 = new JButton("CASH WITHDRAWL");
        button5.setBackground(new Color(0xE00E009));
        button5.setForeground(new Color(0xFFFFFF));
        button5.setBounds(310, 227, 180, 28);
        button5.setFont(new Font("Arial", Font.BOLD, 14));
        button5.addActionListener(this);
        add(button5);


        button6 = new JButton("MINI STATEMENT");
        button6.setBackground(new Color(0xE0E009));
        button6.setForeground(new Color(0xFFFFFF));
        button6.setBounds(600, 227, 180, 28);
        button6.setFont(new Font("Arial", Font.BOLD, 14));
        button6.addActionListener(this);
        add(button6);

        button7 = new JButton("BALANCE ENQUIRY");
        button7.setBackground(new Color(0xCC08EA));
        button7.setForeground(new Color(0xFFFFFF));
        button7.setBounds(600, 265, 180, 28);
        button7.setFont(new Font("Arial", Font.BOLD, 14));
        button7.addActionListener(this);
        add(button7);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1300, 670, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-70, -5, 1500, 700);
        add(image);


        getContentPane().setBackground(new Color(0x0E0D0D));
        setLayout(null);
        setSize(1380, 730);
        setLocation(-10, 0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


        try {if (e.getSource()==button1){
            new deposit(pin);
            setVisible(false);

        }if ((e.getSource()==button2)){
           System.exit(0);

        }if ((e.getSource()==button3)){


        }if (e.getSource()==button4){

        }if (e.getSource()==button5){
            new withdrawalAmnt(pin);
        }if (e.getSource()==button6){

        }if (e.getSource()==button7){

        }



        }catch (Exception E){
            E.printStackTrace();

        }


    }

    public static void main(String[] args) {
new mainClass("");
    }
}
