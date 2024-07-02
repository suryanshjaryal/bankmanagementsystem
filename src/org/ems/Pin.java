package org.ems;

import bank.management.system.Connn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton button1, button2;
    JLabel label1, label2, label3;
    JPasswordField jPasswordField1, jPasswordField2;
String pin;
    public Pin(String pin) {
        this.pin=pin;


        label1 = new JLabel("CHANGE YOUR PIN HERE:");
        label1.setBounds(310, 100, 500, 100);
        label1.setForeground(new Color(0xFFFFFF));
        label1.setFont(new Font("Raleway", Font.BOLD, 19));
        add(label1);


        label2 = new JLabel("ENTER NEW PIN :");
        label2.setBounds(310, 178, 200, 80);
        label2.setForeground(new Color(0xFFFFFF));
        label2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(label2);

        label3 = new JLabel("RE-ENTER YOUR PIN :");
        label3.setBounds(310, 210, 190, 80);
        label3.setForeground(new Color(0xFFFFFF));
        label3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(label3);

        jPasswordField1 = new JPasswordField();
        jPasswordField1.setBounds(550, 200, 200, 30);
        jPasswordField1.setForeground(new Color(0x0E0D0D));
        jPasswordField1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(jPasswordField1);


        jPasswordField2 = new JPasswordField();
        jPasswordField2.setBounds(550, 230, 200, 30);
        jPasswordField2.setForeground(new Color(0x0E0D0D));
        jPasswordField2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(jPasswordField2);

        button1 = new JButton("CHANGE PIN");
        button1.setBackground(new Color(0xE0E009));
        button1.setForeground(new Color(0xFFFFFF));
        button1.setBounds(650, 306, 120, 28);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("BACK");
        button2.setBackground(new Color(0xE0E009));
        button2.setForeground(new Color(0xFFFFFF));
        button2.setBounds(650, 336, 120, 28);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(this);
        add(button2);


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


            String pin1 = jPasswordField1.getText();
            String pin2 = jPasswordField2.getText();

            if (!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog(null, "ENTERED PIN DOES NOT MATCH");
                return;
            }
            if (e.getSource() == button1) {
                if (jPasswordField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ENTER NEW PIN");
                }
                if (jPasswordField2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, " RE-ENTER NEW PIN");
                }
                Connn connn = new Connn();
                String q1 = "update bank set pin='" + pin1 + "' where pin ='" + pin + "'";
                String q2 = "update login set pin='" + pin1 + "' where pin ='" + pin + "'";
                String q3 = "update signup3 set pin='" + pin1 + "' where pin ='" + pin + "'";

                connn.statement.executeUpdate(q1);
                connn.statement.executeUpdate(q2);
                connn.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"Pin changed successfully");
                new mainClass(pin);
            } else if (e.getSource()==button2) {
                setVisible(false);
                new mainClass(pin);

            }
        } catch (Exception E) {
            E.printStackTrace();

        }

    }


    public static void main(String[] args) {
        new Pin("");
    }
}

