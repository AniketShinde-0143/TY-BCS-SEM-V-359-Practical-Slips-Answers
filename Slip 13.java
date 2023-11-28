Q. 1

--> import java.io.*;
class slip13_1
{
public static void main(String argd[]) throws Exception
{
String fname=argd[0];
File f=new File(fname);
if(f.isFile())
{
FileInputStream fis=new FileInputStream(fname);
int ch,cnt=0;
while((ch=fis.read())!=-1)
{
if(ch=='\n')
{
cnt++;
}
}
System.out.println("Number of line in Given file is "+cnt);
}
else
{
System.out.println("file not exists");
}
}
}

Q. 2

--> import java.text.SimpleDateFormat;
import java.util.Date;
class slip13_2
{
public static void main(String[] args)
{
Date date = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
String strDate= formatter.format(date);
System.out.println(strDate);
SimpleDateFormat formatter1 = new SimpleDateFormat("MM-dd-yyyy");
String strDate1= formatter1.format(date);
System.out.println(strDate1);
SimpleDateFormat formatter2 = new SimpleDateFormat("EEEEE
MMMMM dd yyyy");
String strDate2= formatter2.format(date);
System.out.println(strDate2);
SimpleDateFormat formatter3 = new SimpleDateFormat("EEEEE
MMMMM dd HH:mm:ss z yyyy");
String strDate3= formatter3.format(date);
System.out.println(strDate3);
SimpleDateFormat formatter4 = new SimpleDateFormat("dd/MM/yyyy
HH:mm:ss a");
String strDate4= formatter4.format(date);
System.out.println(strDate4);
}
}