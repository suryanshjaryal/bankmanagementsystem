import jdk.jshell.execution.JdiDefaultExecutionControl;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup3 extends JFrame {
    JLabel label1,label2,label3,label4;
    JCheckBox checkBox1,checkBox2,checkBox3,checkBox4;


    public Signup3() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(200, 0, 100, 100);
        add(image);

       label1=new JLabel("ACCOUNT TYPE");
       label1.setBounds(0,20,200,200);
       label1.setFont(new Font("Raleway",Font.BOLD,22));
       add(label1);

        label2=new JLabel("PAGE3");
        label2.setBounds(350,10,100,100);
        label2.setFont(new Font("Raleway",Font.BOLD,20));
        label2.setForeground(new Color(0x0A0A0A));
        add(label2);


        checkBox1=new JCheckBox("SAVING ACCOUNT");
       checkBox1.setForeground(new Color(0x9F20DE));
      // checkBox1.setBackground(new Color(0x0A0A0A));
       checkBox1.setBounds(0,150,200,20);
        checkBox1.setFont(new Font("Raleway",Font.BOLD,16));
        add(checkBox1);

        checkBox2=new JCheckBox("CURRENT ACCOUNT");
        checkBox2.setForeground(new Color(0x9F20DE));
        // checkBox1.setBackground(new Color(0x0A0A0A));
        checkBox2.setBounds(350,150,200,20);
        checkBox2.setFont(new Font("Raleway",Font.BOLD,16));
        add(checkBox2);


        checkBox3=new JCheckBox("FIXED DEPOSIT ACCOUNT");
        checkBox3.setForeground(new Color(0x9F20DE));
        // checkBox1.setBackground(new Color(0x0A0A0A));
        checkBox3.setBounds(0,200,250,20);
        checkBox3.setFont(new Font("Raleway",Font.BOLD,16));
        add(checkBox3);


        checkBox4=new JCheckBox("SAVING ACCOUNT");
        checkBox4.setForeground(new Color(0x9F20DE));
        // checkBox1.setBackground(new Color(0x0A0A0A));
        checkBox4.setBounds(350,200,200,20);
        checkBox4.setFont(new Font("Rale way",Font.BOLD,16));
        add(checkBox4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(checkBox1);
        buttonGroup.add(checkBox2);
        buttonGroup.add(checkBox3);
        buttonGroup.add(checkBox4);






     getContentPane().setBackground(new Color(0x6EE171));
     setLayout(null);
     setSize(700,650);
     setLocation(300,70);
     setVisible(true);


    }
    public static void main(String[] args) {
new Signup3();
    }
}
