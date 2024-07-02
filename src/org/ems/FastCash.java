package org.ems;

import bank.management.system.Connn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
JLabel label1;
    JButton button1,button2,button3,button4,button5,button6,button7;
    String pin;
    public FastCash(String pin) {
        this.pin= this.pin;



        label1 = new JLabel("SELECT YOUR WITHDRAWAL AMOUNT:");
        label1.setBounds(350, 100, 500, 100);
        label1.setForeground(new Color(0xFFFFFF));
        label1.setFont(new Font("Raleway", Font.BOLD, 19));
        add(label1);


        button1 = new JButton("10000");
        button1.setBackground(new Color(0x1FA8F1));
        button1.setForeground(new Color(0xFFFFFF));
        button1.setBounds(600, 302, 180, 28);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("EXIT");
        button2.setBackground(new Color(0x1FA8F1));
        button2.setForeground(new Color(0xFFFFFF));
        button2.setBounds(680, 341, 100, 28);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("100");
        button3.setBackground(new Color(0x1FA8F1));
        button3.setForeground(new Color(0xFFFFFF));
        button3.setBounds(310, 303, 180, 28);
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.addActionListener(this);
        add(button3);

        button4 = new JButton("200");
        button4.setBackground(new Color(0x1FA8F1));
        button4.setForeground(new Color(0xFFFFFF));
        button4.setBounds(310, 265, 180, 28);
        button4.setFont(new Font("Arial", Font.BOLD, 14));
        button4.addActionListener(this);
        add(button4);

        button5 = new JButton("500");
        button5.setBackground(new Color(0x1FA8F1));
        button5.setForeground(new Color(0xFFFFFF));
        button5.setBounds(310, 227, 180, 28);
        button5.setFont(new Font("Arial", Font.BOLD, 14));
        button5.addActionListener(this);
        add(button5);


        button6 = new JButton("2000");
        button6.setBackground(new Color(0x1FA8F1));
        button6.setForeground(new Color(0xFFFFFF));
        button6.setBounds(600, 227, 180, 28);
        button6.setFont(new Font("Arial", Font.BOLD, 14));
        button6.addActionListener(this);
        add(button6);

        button7 = new JButton("5000");
        button7.setBackground(new Color(0x1FA8F1));
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

        try {
if (e.getSource()==button2){
    setVisible(false);
    new mainClass(pin);
}else{
    String amount= ((JButton)e.getSource()).getText();
    Connn connn=new Connn();
    Date date=new Date();

        ResultSet resultSet=connn.statement.executeQuery("Select * from bank where pin ='"+pin+"'");


        }


    }catch (Exception E){
        E.printStackTrace();
    }

}







    public static void main(String[] args) {
        new FastCash("");
    }
}
