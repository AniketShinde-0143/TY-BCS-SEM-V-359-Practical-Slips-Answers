Q. 1

--> import java.util.Scanner;
class SortStr
{
public static void main(String args[])
{
String temp;
Scanner SC = new Scanner(System.in);
System.out.print("Enter the value of N: ");
int N= SC.nextInt();
SC.nextLine(); //ignore next line character
String names[] = new String[N];
System.out.println("Enter names: ");
for(int i=0; i<N; i++)
{
System.out.print("Enter name [ " + (i+1) +" ]: ");
names[i] = SC.nextLine();
}
//sorting strings
for(int i=0; i<N; i++)
{
for(int j=1; j<N; j++)
{
if(names[j-1].compareTo(names[j])>0)
{
temp=names[j-1];
names[j-1]=names[j];
names[j]=temp;
}
}
}
System.out.println("\nSorted names are in Ascending Order: ");
for(int i=0;i<N;i++)
{
System.out.println(names[i]);
}
}
}

Q. 2

--> import java.io.*;
class CovidException extends Exception{
public CovidException(){
System.out.println("Patient is Covid Positive and needs to be hospitalized");
}
}
class Patient{
String name;
int age;
double level,hrct;
public Patient(String name,int age,double level,double hrct)
{
this.name=name;
this.age=age;
this.level=level;
this.hrct=hrct;
}
public static void main(String[] args)throws IOException
{
String name;
int age;
double level,hrct;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter name: ");
name=br.readLine();
System.out.println("Enter the age: ");
age=Integer.parseInt(br.readLine());
System.out.println("Oxygen level: ");
level=Double.parseDouble(br.readLine());
System.out.println("HRCT report: ");
hrct=Double.parseDouble(br.readLine());
Patient ob=new Patient(name,age,level,hrct);
try{
if(ob.level<95 && ob.hrct>10)
throw new CovidException();
else
System.out.println("Patient Info: \n"+"Name: "+ob.name+"\nAge: "+ob.age+"\nHRCT
report: "+ob.hrct+"\nOxygen level:"
+ob.level);
}catch(CovidException e){
}
}
}