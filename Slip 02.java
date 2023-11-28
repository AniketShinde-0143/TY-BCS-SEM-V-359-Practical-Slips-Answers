Q. 1

--> class BM {
public static void main(String args[]) {
String fname = args[0];
String lname = args[1];
double weight = Double.parseDouble(args[2]);
double height = Double.parseDouble(args[3]);
double BMI = weight / (height * height);
System.out.println("First name is:" +fname);
System.out.println("Last Name is:" + lname);
System.out.println("weight is:" + weight);
System.out.println("height is:"+ height);
System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
}
}

Q. 2

--> import java.io.*;
class Cricket {
String name;
int inning, tofnotout, totalruns;
float batavg;
public Cricket(){
name=null;
inning=0;
tofnotout=0;
totalruns=0;
batavg=0;
}
public void get() throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the name, no of innings, no of times not out, total runs: ");
name=br.readLine();
inning=Integer.parseInt(br.readLine());
tofnotout=Integer.parseInt(br.readLine());
totalruns=Integer.parseInt(br.readLine());
}
public void put(){
System.out.println("Name="+name);
System.out.println("no of innings="+inning);
System.out.println("no times notout="+tofnotout);
System.out.println("total runs="+totalruns);
System.out.println("bat avg="+batavg);
}
static void avg(int n, Cricket c[]){
try{
for(int i=0;i<n;i++){
c[i].batavg=c[i].totalruns/c[i].inning;
}
}catch(ArithmeticException e){
System.out.println("Invalid arg");
}
}
static void sort(int n, Cricket c[]){
String temp1;
int temp2,temp3,temp4;
float temp5;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(c[i].batavg<c[j].batavg){
temp1=c[i].name;
c[i].name=c[j].name;
c[j].name=temp1;
temp2=c[i].inning;
c[i].inning=c[j].inning;