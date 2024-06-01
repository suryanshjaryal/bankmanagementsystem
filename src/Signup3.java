import bank.management.system.Connn;
import org.ems.deposit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
String pin;
JButton button1,button2;
 JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
 JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10, checkBox11;

 String formno;

 public Signup3(String formno) {
  this.formno = formno;
  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
  Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
  ImageIcon i3 = new ImageIcon(i2);
  JLabel image = new JLabel(i3);
  image.setBounds(200, 0, 100, 100);
  add(image);

  label1 = new JLabel("ACCOUNT TYPE");
  label1.setBounds(0, 20, 200, 200);
  label1.setFont(new Font("Raleway", Font.BOLD, 22));
  add(label1);

  label2 = new JLabel("PAGE3");
  label2.setBounds(550, 10, 100, 100);
  label2.setFont(new Font("Raleway", Font.BOLD, 20));
  label2.setForeground(new Color(0x0A0A0A));
  add(label2);


  checkBox1 = new JCheckBox("SAVING ACCOUNT");
  checkBox1.setForeground(new Color(0x9F20DE));
  // checkBox1.setBackground(new Color(0x0A0A0A));
  checkBox1.setBounds(0, 150, 350, 20);
  checkBox1.setFont(new Font("Raleway", Font.BOLD, 16));
  add(checkBox1);

  checkBox2 = new JCheckBox("CURRENT ACCOUNT");
  checkBox2.setForeground(new Color(0x9F20DE));
  // checkBox1.setBackground(new Color(0x0A0A0A));
  checkBox2.setBounds(350, 150, 400, 20);
  checkBox2.setFont(new Font("Raleway", Font.BOLD, 16));
  add(checkBox2);


  checkBox3 = new JCheckBox("FIXED DEPOSIT ACCOUNT");
  checkBox3.setForeground(new Color(0x9F20DE));
  // checkBox1.setBackground(new Color(0x0A0A0A));
  checkBox3.setBounds(0, 200, 350, 20);
  checkBox3.setFont(new Font("Raleway", Font.BOLD, 16));
  add(checkBox3);


  checkBox4 = new JCheckBox("RECURRING DEPOSIT ACCOUNT");
  checkBox4.setForeground(new Color(0x9F20DE));
  // checkBox1.setBackground(new Color(0x0A0A0A));
  checkBox4.setBounds(350, 200, 400, 20);
  checkBox4.setFont(new Font("Rale way", Font.BOLD, 16));
  add(checkBox4);

  ButtonGroup buttonGroup = new ButtonGroup();
  buttonGroup.add(checkBox1);
  buttonGroup.add(checkBox2);
  buttonGroup.add(checkBox3);
  buttonGroup.add(checkBox4);

  label3 = new JLabel("CARD NUMBER");
  label3.setBounds(00, 250, 200, 20);
  label3.setForeground(new Color(0x0A0A0A));
  label3.setFont(new Font("Raleway", Font.BOLD, 20));
  add(label3);

  label4 = new JLabel("XXXX-XXXX-XXXX-4252");
  label4.setBounds(250, 250, 300, 20);
  label4.setForeground(new Color(0x0A0A0A));
  label4.setFont(new Font("Raleway", Font.BOLD, 20));
  add(label4);


  label5 = new JLabel("Your 16-Digit Card Number");
  label5.setBounds(00, 280, 200, 20);
  label5.setForeground(new Color(0x0A0A0A));
  label5.setFont(new Font("Raleway", Font.ITALIC, 12));
  add(label5);


  label6 = new JLabel("(It would appear on your atmcard/bankstaements/cheque)");
  label6.setBounds(250, 280, 500, 20);
  label6.setForeground(new Color(0x0A0A0A));
  label6.setFont(new Font("Raleway", Font.ITALIC, 12));
  add(label6);


  label7 = new JLabel("PIN");
  label7.setBounds(0, 320, 200, 20);
  label7.setForeground(new Color(0x0A0A0A));
  label7.setFont(new Font("Raleway", Font.BOLD, 20));
  add(label7);


  label8 = new JLabel("XXXX");
  label8.setBounds(250, 320, 300, 20);
  label8.setForeground(new Color(0x0A0A0A));
  label8.setFont(new Font("Raleway", Font.BOLD, 20));
  add(label8);


  label9 = new JLabel("(4-digit password)");
  label9.setBounds(0, 350, 200, 20);
  label9.setForeground(new Color(0x0A0A0A));
  label9.setFont(new Font("Raleway", Font.ITALIC, 12));
  add(label9);


  label10 = new JLabel("SERVICES REQUIRED:");
  label10.setBounds(0, 340, 500, 100);
  label10.setFont(new Font("Raleway", Font.BOLD, 22));
  add(label10);


  checkBox5 = new JCheckBox("ATM CARD");
  checkBox5.setForeground(new Color(0x9F20DE));
  // checkBox1.setBackground(new Color(0x0A0A0A));
  checkBox5.setBounds(0, 430, 350, 20);
  checkBox5.setFont(new Font("Raleway", Font.BOLD, 16));
  add(checkBox5);


  checkBox6 = new JCheckBox("INTERNET BANKING");
  checkBox6.setForeground(new Color(0x9F20DE));
  // checkBox1.setBackground(new Color(0x0A0A0A));
  checkBox6.setBounds(0, 470, 350, 20);
  checkBox6.setFont(new Font("Raleway", Font.BOLD, 16));
  add(checkBox6);

  checkBox7 = new JCheckBox("MOBILE BANKING");
  checkBox7.setForeground(new Color(0x9F20DE));
  // checkBox1.setBackground(new Color(0x0A0A0A));
  checkBox7.setBounds(350, 430, 400, 20);
  checkBox7.setFont(new Font("Raleway", Font.BOLD, 16));
  add(checkBox7);


  checkBox8 = new JCheckBox("EMAIL-ALERTS");
  checkBox8.setForeground(new Color(0x9F20DE));
  // checkBox1.setBackground(new Color(0x0A0A0A));
  checkBox8.setBounds(350, 470, 350, 20);
  checkBox8.setFont(new Font("Raleway", Font.BOLD, 16));
  add(checkBox8);


  checkBox9 = new JCheckBox("CHEQUE BOOK");
  checkBox9.setForeground(new Color(0x9F20DE));
  // checkBox1.setBackground(new Color(0x0A0A0A));
  checkBox9.setBounds(350, 510, 400, 20);
  checkBox9.setFont(new Font("Rale way", Font.BOLD, 16));
  add(checkBox9);

  checkBox10 = new JCheckBox("E-STATEMENTS");
  checkBox10.setForeground(new Color(0x9F20DE));
  // checkBox1.setBackground(new Color(0x0A0A0A));
  checkBox10.setBounds(0, 510, 350, 20);
  checkBox10.setFont(new Font("Rale way", Font.BOLD, 16));
  add(checkBox10);


  checkBox11 = new JCheckBox("I here by declares that the above entered  details are correct to the best of my knowledge");
  checkBox11.setBackground(new Color(0x6EE171));
  checkBox11.setForeground(new Color(0x0A0A0A));

  checkBox11.setBounds(0, 550, 550, 18);
  checkBox11.setFont(new Font("Rale way", Font.BOLD, 12));
  add(checkBox11);


  button1 = new JButton("SUBMIT");
  button1.setFont(new Font("Raleway", Font.BOLD, 12));
  button1.setBounds(100, 580, 200, 18);
  button1.setBackground(Color.black);
  button1.setForeground(Color.white);
  button1.addActionListener(this);
  add(button1);

 button2 = new JButton("CANCEL");
  button2.setFont(new Font("Raleway", Font.BOLD, 12));
  button2.setBounds(320, 580, 200, 18);
  button2.setBackground(Color.black);
  button2.setForeground(Color.white);
  button2.addActionListener(this);
  add(button2);


  getContentPane().setBackground(new Color(0x6EE171));
  setLayout(null);
  setSize(700, 650);
  setLocation(300, 70);
  setVisible(true);


 }

 public static void main(String[] args) {
  new Signup3("");
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  String accType = " ";
  if (checkBox1.isSelected()) {
   accType = "SAVING ACCOUNT";
  } else if (checkBox2.isSelected()) {
   accType = "CURRENT ACCOUNT";

  } else if (checkBox3.isSelected()) {
   accType = "FIXED DEPOSIT ACCOUNT";

  } else if (checkBox3.isSelected()) {
   accType = "RECURRING DEPOSIT ACCOUNT";
  }
Random ran =new Random();
  Long first7=(ran.nextLong() % 90000000L) + 1409963000000000L;
String cardNo=""+Math.abs(first7);

Long first3 =(ran.nextLong() % 9000l)+ 1000L;
 pin=""+Math.abs((first3));

String fac ="";
if(checkBox5.isSelected()){
 fac=fac+"ATM CARD";
} else if (checkBox6.isSelected()){
   fac=fac+"INTERNET BANKING";
  } else if (checkBox7.isSelected()){
   fac=fac+"MOBILE BANKING";
  } else if (checkBox8.isSelected()){
  fac=fac+"EMAIL-ALERTS";
 } else if (checkBox9.isSelected()){
  fac=fac+"CHEQUE BOOK";
} else if (checkBox10.isSelected()) {
 fac=fac+"E-STATEMENTS";

}
try {
 if (e.getSource()==button1) {
  if (accType.equals("")) {
   JOptionPane.showMessageDialog(null, "FILL ALL THE FIELDS");
  } else {
   Connn c1 = new Connn();
   String q1 = "insert into signup3 values('" + formno + "','" + accType + "','" + cardNo + "','" + pin + "','" + fac + "')";
   String q2 = "insert into login values('"+formno+"','"+cardNo+"','"+pin+"')";
c1.statement.executeUpdate(q1);
   c1.statement.executeUpdate(q2);
   JOptionPane.showMessageDialog(null,"Card Number : "+cardNo+"\n Pin : "+pin );

   new deposit(pin);
   setVisible(false);

  }
 }
 }
catch (Exception E){
 E.printStackTrace();
}
 }
}
