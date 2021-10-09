import java.util.Scanner;
public class FactusingRec
{
   public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to find Factorial: ");
    int n = sc.nextInt();
    int fact;
     fact = fact(n);
    System.out.println("Factorial of " +n+ " is " + fact);
    
    
}
  static int  fact(int n)
{
  if(n>1)
{
    return(n*fact(n-1));

}
   return 1;
}
}
  