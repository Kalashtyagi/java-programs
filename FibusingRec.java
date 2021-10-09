import java.util.Scanner;
public class FibusingRec
{   static int a,b,c;
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter first Number: ");
    a = sc.nextInt();
   System.out.print("Enter Second Number: ");
    b = sc.nextInt();
   System.out.print("Enter size: ");
   int n = sc.nextInt();
   System.out.print(a+ " " + b);
   FibusingRec ob = new FibusingRec();
   ob.printfib(n);
}
    void printfib(int n)
{
  if(n>=1)
{  
  c=a+b;
  System.out.print(" " + c);
  a=b;
  b=c;
  printfib(n-1);
}
}
}

 