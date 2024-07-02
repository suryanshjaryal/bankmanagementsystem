package org.ems;

import bank.management.system.Connn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposit extends JFrame implements ActionListener {
    JLabel label1;
    JTextField textField1;
    JButton button1, button2;

String pin;

    public deposit(String pin) {

        label1 = new JLabel("ENTER THE AMMOUNT  YOU WANT TO DEPOSIT:");
        label1.setBounds(310, 100, 500, 100);
        label1.setForeground(new Color(0xFFFFFF));
        label1.setFont(new Font("Raleway", Font.BOLD, 19));
        add(label1);


        textField1 = new JTextField();
        textField1.setBounds(380, 200, 300, 28);
        textField1.setFont(new Font("Raleway", Font.BOLD, 26));
        textField1.setBackground(new Color(0x0BDE10));
        textField1.setForeground(new Color(0xFFFFFF));
        add(textField1);

        button1 = new JButton("DEPOSIT");
        button1.setBackground(new Color(0xE0E009));
        button1.setForeground(new Color(0xFFFFFF));
        button1.setBounds(680, 306, 100, 28);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("BACK");
        button2.setBackground(new Color(0xE0E009));
        button2.setForeground(new Color(0xFFFFFF));
        button2.setBounds(680, 336, 100, 28);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(this);
        add(button2);

this.pin=pin;

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
            String amount = textField1.getText();
            Date date = new Date();
            if (e.getSource()==button1){
                if (textField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    Connn connn = new Connn();
                    connn.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new mainClass(pin);
                }
            }else if (e.getSource()==button2){
                setVisible(false);
                new mainClass(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new deposit("");

    }
}
