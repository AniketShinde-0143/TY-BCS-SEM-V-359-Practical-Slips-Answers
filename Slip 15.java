Q. 1

--> import java.io.*;
import java.util.*;
class demoFile
{
public static void main(String args[]) throws Exception
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the first file");
String f1=sc.next();
System.out.println("Enter the second file");
String f2=sc.next();
FileInputStream fis=new FileInputStream(f1);
FileOutputStream fos=new FileOutputStream(f2);
int ch;
while((ch=fis.read())!=-1)
{
fos.write(ch);
}
System.out.println("file copied...");
fis.close();
fos.close();
}
}

Q. 2

--> import java.util.Scanner;
class Account {
    String custname;
    long accno;
    public Account() {
        custname = "Default Customer";
        accno = 0;
    }
    public Account(String custname, long accno) {
        this.custname = custname;
        this.accno = accno;
    }
    public void displayAccountDetails() {
        System.out.println("Customer Name: " + custname);
        System.out.println("Account Number: " + accno);
    }
}
class SavingAccount extends Account {
    double savingbal;
    double minbal;
    public SavingAccount() {
        savingbal = 0.0;
        minbal = 0.0;
    }
    public SavingAccount(String custname, long accno, double savingbal, double minbal) {
        super(custname, accno);
        this.savingbal = savingbal;
        this.minbal = minbal;
    }
}
class AccountDetail extends SavingAccount {
    double depositamt;
    double withdrawalamt;
    public AccountDetail() {
        depositamt = 0.0;
        withdrawalamt = 0.0;
    }
    public AccountDetail(String custname, long accno, double savingbal, double minbal, double depositamt, double withdrawalamt) {
        super(custname, accno, savingbal, minbal);
        this.depositamt = depositamt;
        this.withdrawalamt = withdrawalamt;
    }
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Saving Balance: " + savingbal);
        System.out.println("Minimum Balance: " + minbal);
        System.out.println("Deposit Amount: " + depositamt);
        System.out.println("Withdrawal Amount: " + withdrawalamt);
    }
}
public class Main {
    public static void main(String[] args) {
        AccountDetail account = new AccountDetail("John Doe", 123456789, 5000.0, 1000.0, 2000.0, 500.0);
        account.displayAccountDetails();
    }
}
