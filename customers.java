import java.util.Scanner;
class Customer
{
private int accountNo;
public String name;
private float balance;
Customer()
{
accountNo=1000;
name="raghu";
balance=100.0f;
}
void deposite(int amount)
{
balance=balance+amount;
System.out.println("after deposite balance is:" +balance);
}
void withdeaw(int amount){
if(amount>balance)
{
System.out.println("insufficient balance:");
}
else{
balance=balance-amount;
System.out.println("insufficient balance:");
}
void checkBalance(){
System.out.println("your current balance is:"+balance);
}
public static void main(String args[])
{
int amount;
Customer obj=new Cutomer();
obj.checkBalance();
System.out.println("select one of the below serives");
while(true)
{
System.out.println("1.Deposite\n2.withdraw\3.Checkbalance\n4.quit");
int opt=sc.nextInt();
switch(opt)
{
case 1:
System.out.println("enter amount to deposite");
amount=sc.nextInt();
obj.deposit(amount);
break;
case 2:
System.out.println("enter amount to withdraw");
amount=sc.nextInt();
obj.withdraw(amount);
break;
case 3:
obj.checkBalance(amount);
break;
case 4:
System.exit(0);
}
}
}
}

