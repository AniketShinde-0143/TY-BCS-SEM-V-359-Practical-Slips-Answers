Q. 1

--> import java.util.*;
class slip23_1
{
private int data;
slip23_1()
{
data=0;
}
slip23_1(int data)
{
this();
this.data=data;
}
public void isPositive(int x)
{
if(x>0)
{
System.out.println(x+" Number is Positive ");
}
}
public void isNegetive(int x)
{
if(x<0)
{
System.out.println(x+" Number is Negetive");
}
}
public void isEven(int x)
{
if(x%2==0)
{
System.out.println(x+" Number is Even");
}
}
public void isOdd(int x)
{
if(x%2!=0)
{
System.out.println(x+" Number is Odd ");
}
}
public void isZero(int x)
{
if(x==0)
{
System.out.println(x+" Number is Zero ");
}
}
public static void main(String args[])
{
int data=Integer.parseInt(args[0]);
slip23_1 ob =new slip23_1(data);
ob.isPositive(data);
ob.isNegetive(data);
ob.isEven(data);
ob.isOdd(data);
ob.isZero(data);
}
}

Q. 2

--> import javax.swing.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
class slip23_2 extends KeyAdapter
{
JLabel l1,l2,l3;
JTextField t1,t2,t3;
slip23_2()
{
JFrame ob=new JFrame();
l1=new JLabel("US Dollars");
l2=new JLabel("Singapore Dollars");
l3=new JLabel("Euros");
t1=new JTextField(10);
t2=new JTextField(10);
t3=new JTextField(10);
ob.add(l1); ob.add(t1);
ob.add(l2); ob.add(t2);
ob.add(l3); ob.add(t3);
ob.setVisible(true);
t1.addKeyListener(this);
ob.setLayout(new FlowLayout());
ob.setSize(400,400);
ob.setDefaultCloseOperation(3);
}
public void keyReleased(KeyEvent ke)
{
try
{
Double USD=Double.parseDouble(t1.getText());
Double S=1.41;
Double E=0.92;
//Double sgd =Double.parseDouble(t1.getText());
Double SGD= USD * S;
//Double euro =Double.parseDouble(t1.getText());
Formatter fob=new Formatter();
fob.format("%.2f",SGD);
Double Euro=USD * E;
fob.format("%.2f",Euro);
t2.setText(""+SGD);
t3.setText(""+Euro);
}
catch(Exception e)
{
System.out.println("Enter Vaules in Box");
}
}
public static void main(String []args)
{
slip23_2 ob=new slip23_2();
Scanner sc=new Scanner(System.in);
}
}