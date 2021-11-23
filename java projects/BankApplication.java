import java.util.Scanner;

public class BankApplication 
{
  
public static void main (String[]args) 
{
    
        BankAccount obj1 = new BankAccount ("XYZ", "NT@345");
    
        obj1.showMenu ();
} 
} 
 
 
 
class BankAccount 

{
  
int balance;
  
int previousTransaction;
  
String customerName;
  
String customerId;
  
 
BankAccount (String cname, String cid) 
  {
    
customerName = cname;
    
customerId = cid;
  
} 
 
void deposit (int amount) 
  {
    
if (amount != 0)
      
      {
	
balance = balance + amount;
	
previousTransaction = amount;
      
}
  
}
  
 
void withdraw (int amount) 
  {
    
if (amount != 0)
      
      {
	
balance = balance - amount;
	
previousTransaction = -amount;
      
}
  
}
  
 
void getPreviousTransaction () 
  {
    
if (previousTransaction > 0)
      
      {
	
System.out.println ("Deposited: " + previousTransaction);
      
 
}
    
    else if (previousTransaction < 0)
      
      {
	
System.out.println ("Withdrawn: " + Math.abs (previousTransaction));
      
}
    
    else
      
      {
	
System.out.println ("No transaction occured");
      
}
  
}
  
 
void showMenu () 
  {
    
Scanner scanner = new Scanner (System.in);
    
 
System.out.println ("Welcome " + customerName);
    
System.out.println ("Your id is " + customerId);
    
System.out.println ("\n");
    
System.out.println ("1. Check Balance");
    
System.out.println ("2. Deposit ");
    
System.out.println ("3. Withdraw");
    
System.out.println ("4. Previous Transaction");
    
System.out.println ("5. Exit");
int option;
    
 
    do
      
      {
	
System.out.println ("===============================================================================");
	
System.out.println ("Enter an option");
	
System.out.println("===============================================================================");
	
  option = scanner.nextInt() ;
	
System.out.println ("\n");
	
 
switch (option)
	  
	  {
	  
case 1:
	    
System.out.println ("------------------------------------------");
	    
System.out.println ("Balance= " + balance);
	    
System.out.println ("------------------------------------------");
	    
System.out.println ("\n");
	    
break;
	  
case 2:
	    
System.out.println ("------------------------------------------");
	    
System.out.println ("Enter an amount to deposit: ");
	    
System.out.println ("------------------------------------------");
	    
int amount = scanner.nextInt ();
	    
deposit (amount);
System.out.println("Deposit successfully......");
	    
System.out.println ("\n");
	    
break;
	  
 
case 3:
	    
System.out.println ("------------------------------------------");
	    
System.out.println ("Enter an amount to withdraw: ");
	    
System.out.println ("------------------------------------------");
	    
int amount2 = scanner.nextInt ();
	    
withdraw (amount2);
System.out.println("Withdrawn successfully...");
	    
System.out.println ("\n");
	  
case 4:
	    
System.out.println ("------------------------------------------");
	    
getPreviousTransaction ();
	    
System.out.println ("------------------------------------------");
	    
System.out.println ("\n");
	    
break;
	  
 
case 5:
	    
System.out.println ("*************************************************");
	    
break;
	  
 
default:
	    
 
System.out.println ("Invalid option!!. Please try again");
	    
break;
	  
 
}
}
	
 
while (option != 5);
	
	{
	  
System.out.println ("Thankyou for using our services.");
	
}
      
}
    
}

    
 
 
 
 
