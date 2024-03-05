import bank.management.system.Connn;
import com.toedter.calendar.JDateChooser;
//import org.ems.Connn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.util.Random;

import static java.time.chrono.JapaneseEra.values;

public class Signup extends JFrame implements ActionListener {
    JTextField textField1, textField2, textField3, textField5, textField6, textField7, textField8;
    JDateChooser jDateChooser;
    JRadioButton r1, r2, m1, m2, m3;
    JButton next;
    Random ran = new Random();
    long first4 = ran.nextLong(1000);

    public Signup() {

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, 4, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO:" + first4);
        label1.setBounds(150, 35, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);


        JLabel label2 = new JLabel("PAGE1");
        label2.setBounds(350, 65, 600, 40);
        label2.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label2);

        JLabel label3 = new JLabel("PERSONAL DETAILS");
        label3.setBounds(300, 85, 600, 40);
        label3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label3);

        JLabel label4 = new JLabel("NAME");
        label4.setBounds(0, 130, 700, 60);
        label4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label4);

        textField1 = new JTextField();
        textField1.setFont(new Font("Raleway", Font.BOLD, 14));
        textField1.setBounds(250, 145, 400, 30);
        add(textField1);

        JLabel label5 = new JLabel("FATHER'S NAME");
        label5.setBounds(0, 172, 700, 60);
        label5.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label5);

        textField2 = new JTextField();
        textField2.setFont(new Font("Raleway", Font.BOLD, 14));
        textField2.setBounds(250, 185, 400, 30);
        add(textField2);


        JLabel label6 = new JLabel("DOB");
        label6.setBounds(0, 212, 700, 60);
        label6.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label6);

        jDateChooser = new JDateChooser();
        jDateChooser.setForeground(new Color(105, 105, 105));
        jDateChooser.setBounds(250, 225, 400, 30);
        add(jDateChooser);


        JLabel label7 = new JLabel("GENDER");
        label7.setBounds(0, 255, 700, 60);
        label7.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label7);

        r1 = new JRadioButton("MALE");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(290, 270, 90, 30);
        add(r1);

        r2 = new JRadioButton("FEMALE");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(470, 270, 110, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        //other
        JLabel label8 = new JLabel("EMAIL ADDRESS");
        label8.setBounds(0, 290, 700, 60);
        label8.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label8);

        textField3 = new JTextField();
        textField3.setFont(new Font("Raleway", Font.BOLD, 14));
        textField3.setBounds(250, 305, 400, 30);
        add(textField3);

        JLabel label9 = new JLabel("MARITAL STATUS");
        label9.setBounds(0, 330, 700, 60);
        label9.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label9);

        m1 = new JRadioButton("MARRIED");
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        m1.setBounds(260, 340, 100, 30);
        add(m1);

        m2 = new JRadioButton("UNMARRIED");
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        m2.setBounds(390, 340, 120, 30);
        add(m2);

        m3 = new JRadioButton("OTHER");
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        m3.setBounds(540, 340, 90, 30);
        add(m3);
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        /*
        textField4=new JTextField();
        textField4.setFont(new Font("Raleway",Font.BOLD,14));
        textField4.setBounds(250,345,400,30);
        add(textField4);
*/
        //address
        JLabel label10 = new JLabel("ADDRESS");
        label10.setBounds(0, 372, 700, 60);
        label10.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label10);

        textField5 = new JTextField();
        textField5.setFont(new Font("Raleway", Font.BOLD, 14));
        textField5.setBounds(250, 385, 400, 30);
        add(textField5);

        JLabel label11 = new JLabel("PINCODE");
        label11.setBounds(0, 412, 700, 60);
        label11.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label11);

        textField6 = new JTextField();
        textField6.setFont(new Font("Raleway", Font.BOLD, 14));
        textField6.setBounds(250, 425, 400, 30);
        add(textField6);

        JLabel label12 = new JLabel("CITY");
        label12.setBounds(0, 452, 700, 60);
        label12.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label12);

        textField7 = new JTextField();
        textField7.setFont(new Font("Raleway", Font.BOLD, 14));
        textField7.setBounds(250, 465, 400, 30);
        add(textField7);

        JLabel label13 = new JLabel("STATE");
        label13.setBounds(0, 495, 700, 60);
        label13.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label13);

        textField8 = new JTextField();
        textField8.setFont(new Font("Raleway", Font.BOLD, 14));
        textField8.setBounds(250, 510, 400, 30);
        add(textField8);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(540, 560, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(800, 650);
        setLocation(360, 40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = String.valueOf(first4);
        String name = textField1.getName();
        String fname = textField2.getName();
        String dob = ((JTextField) jDateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";

        }
        String email = textField3.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";

        } else if (m3.isSelected()) {
            marital = "other";

        }

        String address = textField5.getText();
        String city = textField6.getText();
        String pincode = textField7.getText();
        String state = textField8.getText();

        try {
            if (textField1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Connn c = new Connn();
                String query = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";

                // c.statement.executeUpdate(q);
                c.statement.executeUpdate(query);
                 new Signup2();
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }
        public static void main (String[]args){
            new Signup();
        }
    }