Q. 1

--> import java.util.*;
class Customer {
String name;
int Pno;
}
class Depositer extends Customer
{
int accno;
double bal;
}
class Borrower extends Depositer
{
int loanno;
double loanamt;
void read()
{
System.out.println("enter name, Phone number, accno, bal, loanno,
loanamt");
Scanner sc = new Scanner(System.in);
this.name = sc.next();
this.Pno = sc.nextInt();
this.accno = sc.nextInt();
this.bal = sc.nextDouble();
this.loanno = sc.nextInt();
this.loanamt = sc.nextDouble();
}
void display()
{
System.out.println("The details are:");
System.out.println("name: " +this.name);
System.out.println("phone number: "+this.Pno);
System.out.println("accout number: " +this.accno);
System.out.println("Balance: " +this.bal);
System.out.println("loan number: "+this.loanno);
System.out.println("loan amount: "+this.loanamt);
System.out.println("------------------------------------");
}
public static void main(String args[]){
int i;
Scanner sc = new Scanner(System.in);
System.out.println("enter total number:");
int n =sc.nextInt();
Borrower[] l = new Borrower[n];
for(i=0;i<n;i++){
l[i] = new Borrower();
l[i].read();
}
for(i=0;i<n;i++){
l[i].display();
}
}
}

Q. 2

--> import java.util.*;
import javax.swing.*;
import java.awt.event.*;
class TextField implements ActionListener{
JTextField tf1,tf2,tf3;
JButton b1,b2;
TextField(){
JFrame f= new JFrame();
tf1=new JTextField();
tf1.setBounds(50,50,150,20);
tf2=new JTextField();
tf2.setBounds(50,100,150,20);
tf3=new JTextField();
tf3.setBounds(50,150,150,20);
tf3.setEditable(false);
b1=new JButton("concatenation");
b1.setBounds(30,200,100,50);
b2=new JButton("reverse");
b2.setBounds(150,200,100,50);
b1.addActionListener(this);
b2.addActionListener(this);
f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e) {
StringBuffer sb = new StringBuffer();
String s1=tf1.getText();
String s2=tf2.getText();
if(e.getSource()==b1){
String s3= s1+s2;
tf3.setText(s3);
}else if(e.getSource()==b2){
String str = s1;
String strArray = "";
for (int i = str.length()-1; i>=0 ; i--){
strArray+=str.charAt(i);
}
tf3.setText(strArray);
}
}
public static void main(String[] args) {
new TextField();
} 
}