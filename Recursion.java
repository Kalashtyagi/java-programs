import java.util.Scanner;
public class Recursion
{
  public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Number: ");
  int n = sc.nextInt();
  fun1(n);
}
  static void fun1(int n)
{
   if(n>0)
    fun1(n-1);
     System.out.println(n);
     
}                               
}