import java.util.Scanner;
public class LoanConverter
{
public  static void main (String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter loan amount: ");
    int amount = sc.nextInt();
    int remaining = amount;
     System.out.println("pay 10 percent per month of loan amount till 3 months");
     for( int i=1;i<=3;i++)
     {
        int payment = ((amount*10)/100);
        System.out.println("month " + i + " payment" + " : " + payment);
        remaining = amount - payment;
        System.out.println("remaining after " + i +  " month payment: " + remaining);
        amount = remaining;
     }
        
    }
}