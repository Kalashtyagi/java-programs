import java.util.Scanner;
public class Calculator
{
public static void main(String[] args)
{
      String yesno;
do
{
//calculator using switch case.............
 double number1,number2;
 double res;
 
 
 Scanner scanner = new Scanner(System.in);
System.out.println("Simple calculator using switch case in java.....");

 System.out.print("\nEnter your first number: ");
 number1 = scanner.nextDouble();
 System.out.print("Enter your second number: ");
  number2 = scanner.nextDouble();
 System.out.print("Enter symbol to perform your calculation: ");
 String symbol = scanner.next();
 
 switch(symbol)
 {
 case "+" : res= number1 + number2;
            System.out.println("Addition of" + number1 + " and " + number2 + " is: " + res);
            break;
 case "-" : res = number1 - number2;
            System.out.println("Substraction of"  +number1 + " and "+ number2 + " is: " + res);
            break;
 case "*" : res = number1 * number2;
            System.out.println("Multiplication of"  +number1 + " and " + number2 + " is: " + res);
            break;
 case"/" : res = number1 / number2;
            System.out.println("division of " +number1 + number2 + " and " + " is: " + res);
            break;
 default :
            System.out.println("Invalid symbol");
            break;
           
 }
   
    System.out.print("Do you want to continue: ");
    yesno = scanner.next();
   
 }while(yesno.equals("yes")|| yesno.equals("Yes"));
 
 
 
}
}