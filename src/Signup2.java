import bank.management.system.Connn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
JTextField textField11,textField12;
JComboBox comboBox1,comboBox2,comboBox3,comboBox13,comboBox4;
JButton button1;
JRadioButton jRadioButton1,jRadioButton2,jRadioButton3,jRadioButton4;
String formno;
    public Signup2(String formno) {

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(180, 18, 100, 100);
        add(image);

        this.formno =formno;

      JLabel label1= new JLabel("page 2:");
      label1.setFont(new Font("Raleway",Font.BOLD,22));
      label1.setBounds(300,60,600,40);
      add(label1);


        JLabel label2 = new JLabel("ADDITIONAL DETAILS");
        label2.setBounds(300, 85, 600, 40);
        label2.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label2);

        JLabel label3 = new JLabel("ADHAAR NUMBER");
        label3.setBounds(0, 130, 700, 60);
        label3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label3);

        textField11 = new JTextField();
        textField11.setFont(new Font("Raleway", Font.BOLD, 14));
        textField11.setBounds(250, 145, 400, 30);
        add(textField11);

        JLabel label4 = new JLabel("PAN NUMBER");
        label4.setBounds(0, 172, 700, 60);
        label4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label4);

        textField12 = new JTextField();
        textField12.setFont(new Font("Raleway", Font.BOLD, 14));
        textField12.setBounds(250, 185, 400, 30);
        add(textField12);

        JLabel label5 = new JLabel("RELIGION");
        label5.setBounds(0, 212, 700, 60);
        label5.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label5);

        String RELIGION[] ={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox1=new JComboBox<>(RELIGION);
       // comboBox1.setBackground(new Color(0x09A0A0A, true));
      //  comboBox1.setForeground(new Color(0x0E0D0D));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,20));
        comboBox1.setBounds(250,225,400,25);
        add(comboBox1);

        JLabel label6 = new JLabel("CATEGORY");
        label6.setBounds(0, 252, 700, 60);
        label6.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label6);

       String CATEGORY[] ={"GENERAL","OBC","SC","ST","Other"};
        comboBox2=new JComboBox<>(CATEGORY);
        // comboBox1.setBackground(new Color(0x09A0A0A, true));
        //  comboBox1.setForeground(new Color(0x0E0D0D));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,20));
        comboBox2.setBounds(250,265,400,25);
        add(comboBox2);

        JLabel label7 = new JLabel("INCOME");
        label7.setBounds(5, 285, 700, 60);
        label7.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label7);

        String INCOME[] ={"NULL","<150000","<250000","<500000","1000000&above"};
        comboBox3=new JComboBox<>(INCOME);
        // comboBox1.setBackground(new Color(0x09A0A0A, true));
        //  comboBox1.setForeground(new Color(0x0E0D0D));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,20));
        comboBox3.setBounds(250,300,400,25);
        add(comboBox3);

        JLabel label8 = new JLabel("EDUCATION");
        label8.setBounds(0, 325, 700, 60);
        label8.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label8);

        String EDUCATION[] ={"NON-GRADUATE","GRADUATE","POST-GRADUATE","OTHERS"};
        comboBox13=new JComboBox<>(EDUCATION);
        // comboBox1.setBackground(new Color(0x09A0A0A, true));
        //  comboBox1.setForeground(new Color(0x0E0D0D));
        comboBox13.setFont(new Font("Raleway",Font.BOLD,20));
        comboBox13.setBounds(250,340,400,25);
        add(comboBox13);


        JLabel label9 = new JLabel("OCCUPATION");
        label9.setBounds(0, 365, 700, 60);
        label9.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label9);

        String OCCUPATION[] ={"SALARIED","SELF-EMPLOYED","BUSINESS","RETIRED","OTHERS"};
        comboBox4=new JComboBox<>(OCCUPATION);
        // comboBox1.setBackground(new Color(0x09A0A0A, true));
        //  comboBox1.setForeground(new Color(0x0E0D0D));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,20));
        comboBox4.setBounds(250,380,400,25);
        add(comboBox4);

        JLabel label10 = new JLabel("SENIOR CITIZEN");
        label10.setBounds(0, 415, 700, 60);
        label10.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label10);

         jRadioButton1=new JRadioButton("YES");
        jRadioButton1.setFont(new Font("Raleway",Font.BOLD,14));
        jRadioButton1.setBounds(250,430,60,20);
        add(jRadioButton1);

        jRadioButton2=new JRadioButton("NO");
        jRadioButton2.setFont(new Font("Raleway",Font.BOLD,14));
        jRadioButton2.setBounds(350,430,50,20);
        add(jRadioButton2);

      ButtonGroup buttonGroup=new ButtonGroup();
      buttonGroup.add(jRadioButton1);
      buttonGroup.add(jRadioButton2);


        JLabel label11 = new JLabel("EXISTINGACCOUNT");
        label11.setBounds(0, 452, 700, 60);
        label11.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label11);

         jRadioButton3=new JRadioButton("YES");
        jRadioButton3.setFont(new Font("Raleway",Font.BOLD,14));
        jRadioButton3.setBounds(250,470,60,20);
        add(jRadioButton3);

         jRadioButton4=new JRadioButton("NO");
        jRadioButton4.setFont(new Font("Raleway",Font.BOLD,14));
        jRadioButton4.setBounds(350,470,50,20);
        add(jRadioButton4);

        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(jRadioButton3);
        buttonGroup2.add(jRadioButton4);

        button1 =new JButton("NEXT");
        button1.setBounds(600,490,80,22);
        button1.setFont(new Font("Raleway",Font.BOLD,14));
        button1.addActionListener(this);
        add(button1);


        setLayout(null);
        setSize(850,600);
        setLocation(350,80);
        getContentPane().setBackground(new Color(253, 242, 134));
setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox1.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox13.getSelectedItem();
        String occ = (String) comboBox4.getSelectedItem();
        String pan = (String) textField12.getText();
        String aadhar = (String) textField11.getText();
        String citizen = " ";
        if (jRadioButton1.isSelected()) {
            citizen = "yes";

        } else if (jRadioButton2.isSelected()) {
            citizen = "no";
        }

        String eAccount = " ";
        if (jRadioButton3.isSelected()) {
            citizen = "yes";

        } else if (jRadioButton4.isSelected()) {
            citizen = "no";
        }


        try {
            if (textField11.getText().equals("") || textField12.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else  {
                Connn c1 = new Connn();
                String q = "insert into signup2 values('" + formno + "','" + rel + "','" + cate + "','" + inc + "','" + edu + "','" + occ + "','" +pan+ "','" + aadhar + "','" + citizen + "','" + eAccount + "')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Signup2("");
    }
}
